package com.nextlevel.fast.track.frontend.business.partner.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nextlevel.fast.track.frontend.business.partner.model.BusinessPartner;

@Service
public class BusinessPartnerService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public void createBusinessPartner(BusinessPartner businessPartner) {
		restTemplate.postForEntity("http://104.155.54.166/businessPartner", businessPartner, BusinessPartner.class);
	}
	
	public List<BusinessPartner> getBusinessPartner() {
		return restTemplate.getForObject("http://104.155.54.166/businessPartner", List.class);
	}

}
