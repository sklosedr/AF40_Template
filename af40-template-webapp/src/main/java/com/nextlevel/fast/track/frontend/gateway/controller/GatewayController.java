package com.nextlevel.fast.track.frontend.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.frontend.gateway.model.Gateway;
import com.nextlevel.fast.track.frontend.gateway.service.GatewayService;

@RestController
@RequestMapping("/gateway")
public class GatewayController {
	
	@Autowired
	private GatewayService gatewayService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Gateway> getGateways() {
		return gatewayService.getGateways();
	}
	
	@RequestMapping(path = "/address/{addressId}", method = RequestMethod.GET)
	public List<Gateway> getGatewaysForAddress(@PathVariable("addressId") Long addressId) {
		return gatewayService.getGatewaysForAddress(addressId);
	}

}
