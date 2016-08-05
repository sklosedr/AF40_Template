package com.nextlevel.fast.track.frontend.business.partner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/businessPartner")
public class BusinessPartnerController {
	
	private List<BusinessPartner> businessPartner;
	
	@RequestMapping(method = RequestMethod.POST)
	public void createBusinessPartner(@RequestBody BusinessPartner businessPartner) {
		getBusinessPartnerInternal().add(businessPartner);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<BusinessPartner> getBusinessPartners() {
		return getBusinessPartnerInternal();
	}
	
	private List<BusinessPartner> getBusinessPartnerInternal() {
		if (businessPartner == null) {
			businessPartner = new ArrayList<>();
		}
		return businessPartner;
	}

}
