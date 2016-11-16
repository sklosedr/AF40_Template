package com.nextlevel.fast.track.frontend.business.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nextlevel.fast.track.frontend.business.partner.service.AbstractBusinessPartnerService;
import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;

@RequestMapping("/businessPartner")
public class AbstractBusinessPartnerController<T extends AbstractBusinessPartner> {
	
	@Autowired
	private AbstractBusinessPartnerService<T> service;
	
	@RequestMapping(method = RequestMethod.POST)
	public void createBusinessPartner(@RequestBody T businessPartner) {
		service.createBusinessPartner(businessPartner);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.GET)
	public List<T> getBusinessPartners() {
		return service.getBusinessPartner();
	}

}
