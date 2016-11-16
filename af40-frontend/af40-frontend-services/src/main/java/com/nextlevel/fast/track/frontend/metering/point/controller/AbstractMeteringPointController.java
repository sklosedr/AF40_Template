package com.nextlevel.fast.track.frontend.metering.point.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nextlevel.fast.track.frontend.metering.point.service.AbstractMeteringPointService;
import com.nextlevel.fast.track.model.meter.point.AbstractMeterPoint;

@RequestMapping("/meteringPoint")
public class AbstractMeteringPointController<T extends AbstractMeterPoint> {

	@Autowired
	private AbstractMeteringPointService<T> meteringPointService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<T> getMeteringPoints() {
		return meteringPointService.getMeteringPoints();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public T createMeteringPoint(@RequestBody T meteringPoint) {
		return meteringPointService.createMeteringPoint(meteringPoint);
	}
}
