package com.nextlevel.fast.track.portal.frontend.business.partner.service;

import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.business.partner.service.AbstractBusinessPartnerService;
import com.nextlevel.fast.track.model.business.partner.BusinessPartner;

@Service
public class BusinessPartnerService extends AbstractBusinessPartnerService<BusinessPartner> {

	protected Class<?> getDomainClazz() {
		return BusinessPartner.class;
	}
}
