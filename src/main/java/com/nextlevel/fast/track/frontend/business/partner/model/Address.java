package com.nextlevel.fast.track.frontend.business.partner.model;

public class Address {
	
	private Long addressId;
	private String street;
	private String streetNumber;
	private String zipCode;
	private String city;
	private String extraAddressLine;
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getExtraAddressLine() {
		return extraAddressLine;
	}
	public void setExtraAddressLine(String extraAddressLine) {
		this.extraAddressLine = extraAddressLine;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", streetNumber=" + streetNumber
				+ ", zipCode=" + zipCode + ", city=" + city + ", extraAddressLine=" + extraAddressLine + "]";
	}
	
}
