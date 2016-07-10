package com.org.LetsGetDigital.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.LetsGetDigital.dto.QuotesResult;
import com.org.LetsGetDigital.dto.SearchCriteriaDto;
import com.org.LetsGetDigital.facade.Facade;



@RestController
public class QuotationSearchController {
	
	
	public QuotationSearchController(){
		System.out.print("INIt QuotationSearchController ");
	}
	
	@Autowired
	private Facade facade;

    @RequestMapping(value="/search/quotes", method=RequestMethod.POST, produces = "application/json")
    public QuotesResult getQuotes(@RequestBody SearchCriteriaDto search) {
        return this.facade.getQuotes(search);
    }

	
	@RequestMapping(value="/search/quotes/{reference}", method=RequestMethod.GET)
    public QuotesResult getQuotes(@PathVariable("reference") UUID reference) {
        return this.facade.getQuoteByReference(reference);
    }
	

 
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
    public SearchCriteriaDto getSearchCriteriaSample() {
        return facade.getSearchCriteriaSample();
    }

}
