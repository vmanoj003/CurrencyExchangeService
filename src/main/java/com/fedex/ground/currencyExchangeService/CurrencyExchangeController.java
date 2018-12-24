package com.fedex.ground.currencyExchangeService;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	

	@Autowired
	private Environment environment;
	
	@Autowired
	ExchangeValueRepository repository;
	
	@GetMapping(path="/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		//ExchangeValue exchangeValue = new ExchangeValue((long) 1000,from,to,BigDecimal.valueOf(65));
		
		//return //new ExchangeValue(1000,from,to,BigDecimal.valueOf(65));
		
		ExchangeValue exchangeValue = repository.findByFromAndTo(from,to);
		exchangeValue.setPort(Long.parseLong(environment.getProperty("local.server.port")));
		
		return exchangeValue;
	}
}
