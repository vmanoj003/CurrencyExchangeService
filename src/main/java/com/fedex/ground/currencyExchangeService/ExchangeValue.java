package com.fedex.ground.currencyExchangeService;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ExchangeValue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long amount;
	@Column(name="from_country")
	private String from;
	@Column(name="to_country")
	private String to;
	private BigDecimal conversionMultiple;
	private Long port;
	
	public ExchangeValue() {
		
		
	}
	
	
	public ExchangeValue(Long amount, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.amount = amount;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}


	public Long getAmount() {
		return amount;
	}


	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}


	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}


	public Long getPort() {
		return port;
	}


	public void setPort(Long port) {
		this.port = port;
	}

}
