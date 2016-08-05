package com.nextlevel.fast.track.frontend.business.partner;

public class BusinessPartner {
	
	private String firstname;
	
	private String lastname;
	
	private Address address;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "BusinessPartner [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + "]";
	}
	
}
