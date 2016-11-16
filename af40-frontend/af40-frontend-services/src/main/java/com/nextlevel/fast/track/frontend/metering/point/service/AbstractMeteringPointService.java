package com.nextlevel.fast.track.frontend.metering.point.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nextlevel.fast.track.model.meter.point.AbstractMeterPoint;

public abstract class AbstractMeteringPointService<T extends AbstractMeterPoint> {

	private List<T> meteringPoints = new ArrayList<>();
	
	private Long nextId = 1L;
	
	public T createMeteringPoint(T meteringPoint) {
		meteringPoint.setMeteringPointId(nextId);
		nextId++;
		meteringPoints.add(meteringPoint);
		return meteringPoint;
	}
	
	public List<T> getMeteringPoints() {
		return meteringPoints;
	}
	
	public List<T> getMeteringPointsForAddress(Long addressId) {
		return meteringPoints.stream()
				.filter(meterPoint -> addressId.equals(meterPoint.getAddress().getAddressId()))
				.collect(Collectors.toList());
	}
	
}
