package com.nextlevel.fast.track.frontend.gateway.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.nextlevel.fast.track.model.meter.point.MeteringPointType;
import com.nextlevel.fast.track.frontend.metering.point.service.AbstractMeteringPointService;
import com.nextlevel.fast.track.model.gateway.AbstractGateway;
import com.nextlevel.fast.track.model.meter.point.AbstractMeterPoint;

public abstract class AbstractGatewayService<S extends AbstractGateway, T extends AbstractMeterPoint> {
	
	@Autowired
	private AbstractMeteringPointService<T> meteringPointService;

	public List<S> getGateways() {	
		return computeGateways(meteringPointService.getMeteringPoints());
	}
	
	public List<S> getGatewaysForAddress(Long addressId) {
		return computeGateways(meteringPointService.getMeteringPointsForAddress(addressId));
	}
	
	private List<S> computeGateways(List<T> meteringPoints) {
		Map<String, List<T>> groupedMeteringPoints = meteringPoints
			.stream()
			.collect(Collectors.groupingBy(meteringPoint -> meteringPoint.getGatewayId()));
		
		List<S> gateways = new ArrayList<>();
		for (String key : groupedMeteringPoints.keySet()) {
			List<T> result = groupedMeteringPoints.get(key);
			long power = result.stream().filter(meteringPoint -> MeteringPointType.POWER.equals(meteringPoint.getMeteringPointType())).count();
			long gas = result.stream().filter(meteringPoint -> MeteringPointType.GAS.equals(meteringPoint.getMeteringPointType())).count();
			long water = result.stream().filter(meteringPoint -> MeteringPointType.WATER.equals(meteringPoint.getMeteringPointType())).count();
			long heat = result.stream().filter(meteringPoint -> MeteringPointType.HEAT.equals(meteringPoint.getMeteringPointType())).count();
			gateways.add(createGateway(key, power, gas, water, heat));
		}
		
		return gateways;
	}
	
	protected abstract S createGateway(String key, long power, long gas, long water, long heat);
}
