package com.nextlevel.fast.track.customer1.frontend.business.partner.service;

import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.business.partner.service.AbstractBusinessPartnerService;
import com.nextlevel.fast.track.customer1.business.partner.model.Customer1BusinessPartner;

@Service
public class BusinessPartnerService extends AbstractBusinessPartnerService<Customer1BusinessPartner> {

	protected Class<?> getDomainClazz() {
		return Customer1BusinessPartner.class;
	}
}
