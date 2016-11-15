package com.nextlevel.fast.track.backend.business.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.backend.business.partner.model.BusinessPartner;
import com.nextlevel.fast.track.backend.business.partner.service.BusinessPartnerService;

@RestController
@RequestMapping("/businessPartner")
public class BusinessPartnerBackendController {
	
	@Autowired
	private BusinessPartnerService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public BusinessPartner createBusinessPartner(@RequestBody BusinessPartner businessPartner) {
		return service.save(businessPartner);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<BusinessPartner> getBusinessPartners() {
		return service.findAllBusinessPartner();
	}

}
