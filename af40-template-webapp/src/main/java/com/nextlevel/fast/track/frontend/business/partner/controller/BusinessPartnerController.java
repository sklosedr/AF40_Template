package com.nextlevel.fast.track.frontend.business.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.frontend.business.partner.service.BusinessPartnerService;
import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;
import com.nextlevel.fast.track.model.business.partner.BusinessPartner;

@RestController
@RequestMapping("/businessPartner")
public class BusinessPartnerController {
	
	@Autowired
	private BusinessPartnerService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public void createBusinessPartner(@RequestBody BusinessPartner businessPartner) {
		service.createBusinessPartner(businessPartner);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(method = RequestMethod.GET)
	public List<BusinessPartner> getBusinessPartners() {
		return service.getBusinessPartner();
	}

}
