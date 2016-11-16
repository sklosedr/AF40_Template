package com.nextlevel.fast.track.customer1.business.partner.model;

import javax.persistence.Entity;

import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;

@Entity
public class Customer1BusinessPartner extends AbstractBusinessPartner {

	private String mail;
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
}
