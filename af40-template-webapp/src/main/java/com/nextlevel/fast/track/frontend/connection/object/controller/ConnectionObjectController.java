package com.nextlevel.fast.track.frontend.connection.object.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.frontend.connection.object.service.ConnectionObjectService;
import com.nextlevel.fast.track.model.address.Address;

@RestController
@RequestMapping("/connectionObject")
public class ConnectionObjectController {
	
	@Autowired
	private ConnectionObjectService connectionObjectService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Address> getConnectionObject() {
		return connectionObjectService.getConnectionObjects();
	}

}
