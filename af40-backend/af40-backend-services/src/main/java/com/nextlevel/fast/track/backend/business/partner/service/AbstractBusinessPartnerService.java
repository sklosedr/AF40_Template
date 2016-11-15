package com.nextlevel.fast.track.backend.business.partner.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.nextlevel.fast.track.backend.business.partner.repository.AbstractBusinessPartnerRepository;
import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;

public abstract class AbstractBusinessPartnerService<T extends AbstractBusinessPartner> {

	@Autowired
	private AbstractBusinessPartnerRepository<T> repository;
	
	public List<T> findAllBusinessPartner() {
		return IterableUtils.toList(repository.findAll());
	}
	
	@Transactional
	public T save(T businessPartner) {
		return repository.save(businessPartner);
	}
	
	
}
