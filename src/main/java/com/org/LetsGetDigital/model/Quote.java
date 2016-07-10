package com.org.LetsGetDigital.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


public class Quote  implements Cacheable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1450871231132632301L;

	private UUID reference;

    private PaymentModel paymentModel;
    
    private BigDecimal total;
    
    private String baseCurrency;
    
    private String paymentCurrency;
    
    private BigDecimal exchangeRate;
    
    private BigDecimal browseTotal;
    private SearchCriteria search;
    private CarType cartype;
    private Date fromDate;
    private Date toDate;
    private String pickupLocation;
    private String droppOffLocation;
    private String pickUpTime;
    private String dropOffTime;
    private String countryOfResidence;
    
  
    public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}





	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDroppOffLocation() {
		return droppOffLocation;
	}

	public void setDroppOffLocation(String droppOffLocation) {
		this.droppOffLocation = droppOffLocation;
	}

	public String getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getDropOffTime() {
		return dropOffTime;
	}

	public void setDropOffTime(String dropOffTime) {
		this.dropOffTime = dropOffTime;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	
    public UUID getReference() {
		return reference;
	}

	public void setReference(UUID reference) {
		this.reference = reference;
	}

	public PaymentModel getPaymentModel() {
		return paymentModel;
	}

	public void setPaymentModel(PaymentModel paymentModel) {
		this.paymentModel = paymentModel;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getBrowseTotal() {
		return browseTotal;
	}

	public void setBrowseTotal(BigDecimal browseTotal) {
		this.browseTotal = browseTotal;
	}




	
	public CarType getCartype() {
		return cartype;
	}

	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((baseCurrency == null) ? 0 : baseCurrency.hashCode());
		result = prime * result
				+ ((browseTotal == null) ? 0 : browseTotal.hashCode());
		result = prime * result + ((cartype == null) ? 0 : cartype.hashCode());
		result = prime
				* result
				+ ((countryOfResidence == null) ? 0 : countryOfResidence
						.hashCode());
		result = prime * result
				+ ((dropOffTime == null) ? 0 : dropOffTime.hashCode());
		result = prime
				* result
				+ ((droppOffLocation == null) ? 0 : droppOffLocation.hashCode());
		result = prime * result
				+ ((exchangeRate == null) ? 0 : exchangeRate.hashCode());
		result = prime * result
				+ ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result
				+ ((paymentCurrency == null) ? 0 : paymentCurrency.hashCode());
		result = prime * result
				+ ((paymentModel == null) ? 0 : paymentModel.hashCode());
		result = prime * result
				+ ((pickUpTime == null) ? 0 : pickUpTime.hashCode());
		result = prime * result
				+ ((pickupLocation == null) ? 0 : pickupLocation.hashCode());
		result = prime * result
				+ ((reference == null) ? 0 : reference.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quote other = (Quote) obj;
		if (baseCurrency == null) {
			if (other.baseCurrency != null)
				return false;
		} else if (!baseCurrency.equals(other.baseCurrency))
			return false;
		if (browseTotal == null) {
			if (other.browseTotal != null)
				return false;
		} else if (!browseTotal.equals(other.browseTotal))
			return false;
		if (cartype == null) {
			if (other.cartype != null)
				return false;
		} else if (!cartype.equals(other.cartype))
			return false;
		if (countryOfResidence == null) {
			if (other.countryOfResidence != null)
				return false;
		} else if (!countryOfResidence.equals(other.countryOfResidence))
			return false;
		if (dropOffTime == null) {
			if (other.dropOffTime != null)
				return false;
		} else if (!dropOffTime.equals(other.dropOffTime))
			return false;
		if (droppOffLocation == null) {
			if (other.droppOffLocation != null)
				return false;
		} else if (!droppOffLocation.equals(other.droppOffLocation))
			return false;
		if (exchangeRate == null) {
			if (other.exchangeRate != null)
				return false;
		} else if (!exchangeRate.equals(other.exchangeRate))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (paymentCurrency == null) {
			if (other.paymentCurrency != null)
				return false;
		} else if (!paymentCurrency.equals(other.paymentCurrency))
			return false;
		if (paymentModel != other.paymentModel)
			return false;
		if (pickUpTime == null) {
			if (other.pickUpTime != null)
				return false;
		} else if (!pickUpTime.equals(other.pickUpTime))
			return false;
		if (pickupLocation == null) {
			if (other.pickupLocation != null)
				return false;
		} else if (!pickupLocation.equals(other.pickupLocation))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

	public String getKey() {
		return Integer.valueOf(hashCode()).toString();
	}

	public SearchCriteria getSearch() {
		return search;
	}

	public void setSearch(SearchCriteria search) {
		this.search = search;
	}


    
    

}
