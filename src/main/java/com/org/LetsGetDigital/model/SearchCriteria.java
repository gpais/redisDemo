package com.org.LetsGetDigital.model;

import java.util.Date;




public class SearchCriteria implements Cacheable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date fromDate;
    
    private Date toDate;
    
    private String pickupLocation;
//    
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

	public String getKey() {
		return Integer.valueOf(hashCode()).toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
				+ ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result
				+ ((pickUpTime == null) ? 0 : pickUpTime.hashCode());
		result = prime * result
				+ ((pickupLocation == null) ? 0 : pickupLocation.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
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
		SearchCriteria other = (SearchCriteria) obj;
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
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
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
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}


    
    
    

}
