package com.nextlevel.fast.track.frontend.business.partner.model;

public class Person {
	
	private Long personId;
	
	private Salutation salutation;
	
	private String firstName;
	private String lastName;
	private String description;
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	
	public Salutation getSalutation() {
		return salutation;
	}
	public void setSalutation(Salutation salutation) {
		this.salutation = salutation;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
