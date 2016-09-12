package com.nextlevel.fast.track.frontend.metering.point.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.fast.track.frontend.metering.point.model.MeteringPoint;
import com.nextlevel.fast.track.frontend.metering.point.service.MeteringPointService;

@RestController
@RequestMapping("/meteringPoint")
public class MeteringPointController {
	
	@Autowired
	private MeteringPointService meteringPointService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<MeteringPoint> getMeteringPoints() {
		return meteringPointService.getMeteringPoints();
	}
	

}
