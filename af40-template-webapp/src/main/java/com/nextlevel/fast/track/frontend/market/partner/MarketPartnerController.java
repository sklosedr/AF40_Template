package com.nextlevel.fast.track.frontend.market.partner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marketPartner")
public class MarketPartnerController {

	@RequestMapping(method = RequestMethod.GET)
	public String getMarketPartner() {
		return "marketParnter";
	}
	
}
