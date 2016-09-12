package com.nextlevel.fast.track.frontend.gateway.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.gateway.model.Gateway;
import com.nextlevel.fast.track.frontend.metering.point.model.MeteringPoint;
import com.nextlevel.fast.track.frontend.metering.point.model.MeteringPointType;
import com.nextlevel.fast.track.frontend.metering.point.service.MeteringPointService;

@Service
public class GatewayService {
	
	@Autowired
	private MeteringPointService meteringPointService;
	
	public List<Gateway> getGateways() {	
		return computeGateways(meteringPointService.getMeteringPoints());
	}
	
	public List<Gateway> getGatewaysForAddress(Long addressId) {
		return computeGateways(meteringPointService.getMeteringPointsForAddress(addressId));
	}
	
	private List<Gateway> computeGateways(List<MeteringPoint> meteringPoints) {
		Map<String, List<MeteringPoint>> groupedMeteringPoints = meteringPoints
			.stream()
			.collect(Collectors.groupingBy(meteringPoint -> meteringPoint.getGatewayId()));
		
		List<Gateway> gateways = new ArrayList<>();
		for (String key : groupedMeteringPoints.keySet()) {
			List<MeteringPoint> result = groupedMeteringPoints.get(key);
			long power = result.stream().filter(meteringPoint -> MeteringPointType.POWER.equals(meteringPoint.getMeteringPointType())).count();
			long gas = result.stream().filter(meteringPoint -> MeteringPointType.GAS.equals(meteringPoint.getMeteringPointType())).count();
			long water = result.stream().filter(meteringPoint -> MeteringPointType.WATER.equals(meteringPoint.getMeteringPointType())).count();
			long heat = result.stream().filter(meteringPoint -> MeteringPointType.HEAT.equals(meteringPoint.getMeteringPointType())).count();
			gateways.add(new Gateway(key, power, gas, water, heat));
		}
		
		return gateways;
	}
}
