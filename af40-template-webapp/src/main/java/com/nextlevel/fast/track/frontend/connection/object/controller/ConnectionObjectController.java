package com.nextlevel.fast.track.frontend.connection.object.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.frontend.model.Address;

@RestController
@RequestMapping("/connectionObject")
public class ConnectionObjectController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Address> getConnectionObject() {
		List<Address> addresses = new ArrayList<>();
		addresses.add(new Address(1L, "Nattermannallee", "1", "50829", "Köln", null));
		addresses.add(new Address(1L, "Goldenbergstraße", "2", "50354", "Hürth", null));
		addresses.add(new Address(1L, "Parkgürtel", "24", "50823", "Köln", null));
		addresses.add(new Address(1L, "Siegburger Str.", "229", "50679", "Köln", null));
		addresses.add(new Address(1L, "Sellerstraße", "16", "13353", "Berlin", null));
		addresses.add(new Address(1L, "Glockengießerwall", "2", "20095", "Hamburg", null));
		return addresses;
	}

}
