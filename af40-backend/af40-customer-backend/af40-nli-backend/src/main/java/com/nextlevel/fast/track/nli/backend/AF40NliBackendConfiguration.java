package com.nextlevel.fast.track.nli.backend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@Component
@ComponentScan({"com.nextlevel.fast.track.backend"})
@EnableJpaRepositories("com.nextlevel.fast.track.backend.business.partner.repository")
public class AF40NliBackendConfiguration {

}
