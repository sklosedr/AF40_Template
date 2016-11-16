package com.nextlevel.fast.track.frontend.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nextlevel.fast.track.frontend.gateway.service.AbstractGatewayService;
import com.nextlevel.fast.track.model.gateway.AbstractGateway;

@RequestMapping("/gateway")
public abstract class AbstractGatewayController<T extends AbstractGateway> {

	@Autowired
	private AbstractGatewayService<T, ?> gatewayService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> getGateways() {
		return gatewayService.getGateways();
	}
	
	@RequestMapping(path = "/address/{addressId}", method = RequestMethod.GET)
	public List<T> getGatewaysForAddress(@PathVariable("addressId") Long addressId) {
		return gatewayService.getGatewaysForAddress(addressId);
	}
}
