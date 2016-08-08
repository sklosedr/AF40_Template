package com.nextlevel.fast.track.frontend.business.partner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nextlevel.fast.track.frontend.business.partner.model.BusinessPartner;

@Service
public class BusinessPartnerService {
	
	@Value("${af40.backend.url}")
	private String backendUrl;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public void createBusinessPartner(BusinessPartner businessPartner) {
		restTemplate.postForEntity(backendUrl + "/businessPartner", businessPartner, BusinessPartner.class);
	}
	
	public List<BusinessPartner> getBusinessPartner() {
		return restTemplate.getForObject(backendUrl + "/businessPartner", List.class);
	}

}
