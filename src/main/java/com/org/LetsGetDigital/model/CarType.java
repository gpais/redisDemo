package com.org.LetsGetDigital.model;



public class CarType implements Cacheable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarType(){

	}
	public CarType(String supplier,String sipp){
		this.supplier=supplier;
		this.sipp=sipp;
	}
	public String getSipp() {
		return sipp;
	}
	public void setSipp(String sipp) {
		this.sipp = sipp;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	private String sipp;
	
	private String supplier;

	public String getKey() {
		return Integer.valueOf(hashCode()).toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sipp == null) ? 0 : sipp.hashCode());
		result = prime * result
				+ ((supplier == null) ? 0 : supplier.hashCode());
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
		CarType other = (CarType) obj;
		if (sipp == null) {
			if (other.sipp != null)
				return false;
		} else if (!sipp.equals(other.sipp))
			return false;
		if (supplier == null) {
			if (other.supplier != null)
				return false;
		} else if (!supplier.equals(other.supplier))
			return false;
		return true;
	}
	

}
