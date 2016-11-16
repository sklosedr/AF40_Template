package com.nextlevel.fast.track.frontend.business.partner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;

public abstract class AbstractBusinessPartnerService<T extends AbstractBusinessPartner> {

	@Value("${af40.backend.url}")
	private String backendUrl;
	
	private RestTemplate restTemplate = new RestTemplate();
	
	public void createBusinessPartner(T businessPartner) {
		restTemplate.postForEntity(backendUrl + "/businessPartner", businessPartner, getDomainClazz());
	}
	
	public List<T> getBusinessPartner() {
		return restTemplate.getForObject(backendUrl + "/businessPartner", List.class);
	}
	
	protected abstract Class<?> getDomainClazz();
}
