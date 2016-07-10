package com.org.LetsGetDigital.dao;

import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.org.LetsGetDigital.model.Cacheable;
import com.org.LetsGetDigital.model.Quote;
import com.org.LetsGetDigital.model.SearchCriteria;


@Repository
public class QuotesDao{

	private static final String KEY = "QUOTE";
	@Autowired
    private RedisTemplate<String, Cacheable> redisTemplate;
 

	
	public void save(Quote quote){
		redisTemplate.opsForHash().put(KEY, quote.getReference(), quote);

	}
	
	public void save(List<Quote> quotes){
		redisTemplate.opsForHash().put(KEY,quotes.get(0).getSearch().getKey(), quotes);

	}



	public Quote findQuoteByReference(UUID reference) {
		return (Quote) redisTemplate.opsForHash().get(KEY, reference);
	}

	public List<Quote> findAllBySearchCriteria(SearchCriteria search) {
		 return  (List<Quote>) redisTemplate.opsForHash().get(KEY, search.getKey());
	}
	
	
	
	


}
