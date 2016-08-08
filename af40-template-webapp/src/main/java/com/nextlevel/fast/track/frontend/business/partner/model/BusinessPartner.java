package com.nextlevel.fast.track.frontend.business.partner.model;

public class BusinessPartner {
	
	private Long businessPartnerId;
	
	private String company;
	
	private String phone;
	
	private Person person;
	
	private Person contactPerson;
	
	private Address address;

	public Long getBusinessPartnerId() {
		return businessPartnerId;
	}
	public void setBusinessPartnerId(Long businessPartnerId) {
		this.businessPartnerId = businessPartnerId;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(Person contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
