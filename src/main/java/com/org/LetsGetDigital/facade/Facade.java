package com.org.LetsGetDigital.facade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.LetsGetDigital.converter.Converter;
import com.org.LetsGetDigital.dao.QuotesDao;
import com.org.LetsGetDigital.dto.QuoteDto;
import com.org.LetsGetDigital.dto.QuotesResult;
import com.org.LetsGetDigital.dto.SearchCriteriaDto;
import com.org.LetsGetDigital.engine.QuotationEngine;
import com.org.LetsGetDigital.model.Quote;
import com.org.LetsGetDigital.model.SearchCriteria;



@Service
public class Facade {

	@Autowired
	private QuotesDao quotesDao;
	
	@Autowired
	private QuotationEngine quotationEngine;


	public SearchCriteriaDto getSearchCriteriaSample() {

		SearchCriteria searchCriteria = new SearchCriteria();
		searchCriteria.setCountryOfResidence("France");
		searchCriteria.setPickUpTime("10:00");
		searchCriteria.setDropOffTime("10:00");
		Calendar calendar = Calendar.getInstance();
		searchCriteria.setFromDate(calendar.getTime());

		calendar.add(Calendar.DAY_OF_MONTH, 5);
		searchCriteria.setToDate(calendar.getTime());

		searchCriteria.setPickupLocation("PARIS");
		searchCriteria.setDroppOffLocation("PARIS");

		return Converter.convertTo(searchCriteria);
	}

	public QuotesResult getQuoteByReference(UUID reference){
    	QuotesResult result = new QuotesResult();
	    Quote quoteByReference = this.quotesDao.findQuoteByReference(reference);
		result.setSearchCriteria(Converter.convertTo(quoteByReference.getSearch()));
		
//	    List<Quote> quotes = this.quotesDao.findAllBySearchCriteria(quoteByReference.getSearch()) ;

		result.setQuotes(new ArrayList<QuoteDto>());
		result.getQuotes().add(Converter.convertTo(quoteByReference));
    	return result;
		
	}
	public QuotesResult getQuotes(SearchCriteriaDto search) {
    	QuotesResult result = new QuotesResult();
    	result.setSearchCriteria(search);
    	Function<List<Quote>, List<QuoteDto>> convertToDtos = a->{
    		List<QuoteDto> quoteDtos= new ArrayList<>();
    		a.stream()
    		.forEach(b-> {
    			b.setSearch(Converter.convertFrom(search));
    			this.quotesDao.save(b);
    			quoteDtos.add(Converter.convertTo(b));
    			
    		});
    		return quoteDtos;
    	};
    	
//     	List<Quote> quotes=quotesDao.findAll();
    	List<Quote> quotes=quotesDao.findAllBySearchCriteria(Converter.convertFrom(search));

    	if(quotes != null && quotes.size() != 0){
        	result.setQuotes(convertToDtos.apply(quotes));
        	return result;
    	}
    	
    	SearchCriteria searchModel = Converter.convertFrom(search);
//    	this.searchCriteriaDao.save(searchModel);
    	quotes=this.quotationEngine.getQuotes(searchModel);
    	
    	result.setQuotes(convertToDtos.apply(quotes));
    	return result;
    }

}
