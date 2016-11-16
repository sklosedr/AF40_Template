package com.nextlevel.fast.track.customer1.backend;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import com.nextlevel.fast.track.customer1.business.partner.model.Customer1BusinessPartner;
import com.nextlevel.fast.track.model.AbstractEntity;

@Configuration
@EntityScan(basePackageClasses={AbstractEntity.class, Customer1BusinessPartner.class})
public class AF40Customer1BackendConfiguration {

}
