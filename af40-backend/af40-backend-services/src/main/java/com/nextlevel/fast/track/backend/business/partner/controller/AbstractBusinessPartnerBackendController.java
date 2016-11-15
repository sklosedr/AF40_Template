package com.nextlevel.fast.track.backend.business.partner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nextlevel.fast.track.backend.business.partner.service.AbstractBusinessPartnerService;
import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;

@RequestMapping("/businessPartner")
public class AbstractBusinessPartnerBackendController<T extends AbstractBusinessPartner> {
	
	@Autowired
	private AbstractBusinessPartnerService<T> service;
	
	@RequestMapping(method = RequestMethod.POST)
	public AbstractBusinessPartner createBusinessPartner(@RequestBody T businessPartner) {
		return service.save(businessPartner);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> getBusinessPartners() {
		return service.findAllBusinessPartner();
	}

}
