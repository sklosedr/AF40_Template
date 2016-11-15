package com.nextlevel.fast.track.backend.business.partner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.nextlevel.fast.track.model.business.partner.AbstractBusinessPartner;

@NoRepositoryBean
public interface AbstractBusinessPartnerRepository<T extends AbstractBusinessPartner> extends CrudRepository<T, Long> {

}
