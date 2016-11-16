package com.nextlevel.fast.track.model.address;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractAddress {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long addressId;
	private String street;
	private String streetNumber;
	private String zipCode;
	private String city;
	private String extraAddressLine;
	private Double latitude;
	private Double longitude;
	
	public AbstractAddress() {}
	
	public AbstractAddress(Long addressId, String street, String streetNumber, String zipCode, String city, String extraAddressLine, Double latitude, Double longitude) {
		this.addressId = addressId;
		this.street = street;
		this.streetNumber = streetNumber;
		this.zipCode = zipCode;
		this.city = city;
		this.extraAddressLine = extraAddressLine;
		this.latitude = latitude;
		this.longitude = longitude;
	}

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
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", streetNumber=" + streetNumber
				+ ", zipCode=" + zipCode + ", city=" + city + ", extraAddressLine=" + extraAddressLine + "]";
	}

}
