package com.nextlevel.fast.track.backend.business.partner.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BusinessPartner {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long businessPartnerId;
	
	private String company;
	
	private String phone;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Person person;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Person contactPerson;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
