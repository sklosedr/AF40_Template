package com.nextlevel.fast.track.portal.frontend.connection.object.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.connection.object.service.AbstractConnectionObjectService;
import com.nextlevel.fast.track.model.address.Address;

@Service
public class ConnectionObjectService extends AbstractConnectionObjectService<Address> {

	@PostConstruct
	private void init() {
		createConnectionObject(new Address(null, "Nattermannallee", "1", "50829", "Köln", null, 50.9766753, 6.8563744));
		createConnectionObject(new Address(null, "Goldenbergstraße", "2", "50354", "Hürth", null, 50.8617234, 6.8393013));
		createConnectionObject(new Address(null, "Parkgürtel", "24", "50823", "Köln", null, 50.9595434, 6.9305113));
		createConnectionObject(new Address(null, "Siegburger Str.", "229", "50679", "Köln", null, 50.9234134, 6.9789613));
		createConnectionObject(new Address(null, "Sellerstraße", "16", "13353", "Berlin", null, 52.5375904, 13.3648168));
		createConnectionObject(new Address(null, "Glockengießerwall", "2", "20095", "Hamburg", null, 53.5532567, 10.0018138));
	}
}
