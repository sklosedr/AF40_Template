package com.nextlevel.fast.track.frontend.connection.object.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.model.address.Address;


@Service
public class ConnectionObjectService {
	
	private Map<Long, Address> addresses;

	@PostConstruct
	private void init() {
		addresses = new HashMap<>();
		addresses.put(1L, new Address(1L, "Nattermannallee", "1", "50829", "Köln", null, 50.9766753, 6.8563744));
		addresses.put(2L, new Address(2L, "Goldenbergstraße", "2", "50354", "Hürth", null, 50.8617234, 6.8393013));
		addresses.put(3L, new Address(3L, "Parkgürtel", "24", "50823", "Köln", null, 50.9595434, 6.9305113));
		addresses.put(4L, new Address(4L, "Siegburger Str.", "229", "50679", "Köln", null, 50.9234134, 6.9789613));
		addresses.put(5L, new Address(5L, "Sellerstraße", "16", "13353", "Berlin", null, 52.5375904, 13.3648168));
		addresses.put(6L, new Address(6L, "Glockengießerwall", "2", "20095", "Hamburg", null, 53.5532567, 10.0018138));
	}
	
	
	public List<Address> getConnectionObjects() {
		return new ArrayList<>(addresses.values());
	}
	
	public Address getConnectionObject(Long id) {
		return addresses.get(id);
	}
	
}
