package com.nextlevel.fast.track.customer1.frontend.gateway.service;

import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.gateway.service.AbstractGatewayService;
import com.nextlevel.fast.track.model.gateway.Gateway;
import com.nextlevel.fast.track.model.meter.point.MeteringPoint;

@Service
public class GatewayService extends AbstractGatewayService<Gateway, MeteringPoint> {

	@Override
	protected Gateway createGateway(String key, long power, long gas, long water, long heat) {
		return new Gateway(key, power, gas, water, heat);
	}

}
