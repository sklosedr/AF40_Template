package com.nextlevel.fast.track.model.address;

import javax.persistence.Entity;

@Entity
public class Address extends AbstractAddress {

	public Address() {}
	
	public Address(Long addressId, String street, String streetNumber, String zipCode, String city, String extraAddressLine, Double latitude, Double longitude) {
		super(addressId, street, streetNumber, zipCode, city, extraAddressLine, latitude, longitude);
	}
	

	
}
