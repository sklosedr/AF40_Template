package com.nextlevel.fast.track.backend.business.partner.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.backend.business.partner.model.BusinessPartner;
import com.nextlevel.fast.track.backend.business.partner.repository.BusinessPartnerRepository;

@Service
public class BusinessPartnerService {

	@Autowired
	private BusinessPartnerRepository repository;
	
	public List<BusinessPartner> findAllBusinessPartner() {
		return IterableUtils.toList(repository.findAll());
	}
	
	@Transactional
	public BusinessPartner save(BusinessPartner businessPartner) {
		 return repository.save(businessPartner);
	}
	
	
}
