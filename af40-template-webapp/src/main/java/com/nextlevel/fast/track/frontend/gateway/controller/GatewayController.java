package com.nextlevel.fast.track.frontend.gateway.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.frontend.gateway.model.Gateway;

@RestController
@RequestMapping("/gateway")
public class GatewayController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Gateway> getGateways() {
		List<Gateway> gateways = new ArrayList<>();
		gateways.add(new Gateway("EPPC0287658934", 2L, 1L, 1L));
		gateways.add(new Gateway("ETHE0112345678", 2L, 1L, 1L));
		gateways.add(new Gateway("ETHE0992347778", 2L, 1L, 1L));
		gateways.add(new Gateway("ETHE0992347779", 2L, 1L, 1L));
		gateways.add(new Gateway("ETHE0992347780", 2L, 1L, 1L));
		return gateways;
	}

}
