package com.nextlevel.fast.track.frontend.connection.object.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nextlevel.fast.track.model.address.AbstractAddress;

public abstract class AbstractConnectionObjectService<T extends AbstractAddress> {

	private Map<Long, T> addresses = new HashMap<Long, T>();
	private Long nextId = 1L;
	
	public List<T> getConnectionObjects() {
		return new ArrayList<>(addresses.values());
	}
	
	public T getConnectionObject(Long id) {
		return addresses.get(id);
	}
	
	public T createConnectionObject(T address) {
		address.setAddressId(nextId);
		addresses.put(nextId, address);
		nextId++;
		return address;
	}
}
