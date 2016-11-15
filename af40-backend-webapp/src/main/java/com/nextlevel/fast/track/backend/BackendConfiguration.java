package com.nextlevel.fast.track.backend;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import com.nextlevel.fast.track.model.AbstractEntity;

@Configuration
@EntityScan(basePackageClasses=AbstractEntity.class) 
public class BackendConfiguration {

}
