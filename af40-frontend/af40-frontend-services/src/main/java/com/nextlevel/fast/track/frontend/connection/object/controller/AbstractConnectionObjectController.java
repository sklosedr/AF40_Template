package com.nextlevel.fast.track.frontend.connection.object.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nextlevel.fast.track.frontend.connection.object.service.AbstractConnectionObjectService;
import com.nextlevel.fast.track.model.address.AbstractAddress;

@RequestMapping("/connectionObject")
public abstract class AbstractConnectionObjectController<T extends AbstractAddress> {

	@Autowired
	private AbstractConnectionObjectService<T> connectionObjectService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> getConnectionObject() {
		return connectionObjectService.getConnectionObjects();
	}
}
