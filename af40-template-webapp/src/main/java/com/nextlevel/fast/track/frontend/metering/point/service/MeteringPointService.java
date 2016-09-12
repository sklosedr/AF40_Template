package com.nextlevel.fast.track.frontend.metering.point.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.connection.object.service.ConnectionObjectService;
import com.nextlevel.fast.track.frontend.metering.point.model.MeteringPoint;
import com.nextlevel.fast.track.frontend.metering.point.model.MeteringPointType;

@Service
public class MeteringPointService {
	
	@Autowired
	private ConnectionObjectService connectionObjectService;
	
	private List<MeteringPoint> meteringPoints;
	
	@PostConstruct
	private void init() {
		// Address 1
		meteringPoints = new ArrayList<>();
		meteringPoints.add(new MeteringPoint(1L, "DE123456789", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456790", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456791", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456792", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		meteringPoints.add(new MeteringPoint(1L, "DE123456793", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456794", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456795", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456796", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		meteringPoints.add(new MeteringPoint(1L, "DE123456797", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456798", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456799", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456800", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		meteringPoints.add(new MeteringPoint(1L, "DE123456801", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456802", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456803", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456803", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		meteringPoints.add(new MeteringPoint(1L, "DE123456804", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456805", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456806", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456807", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		meteringPoints.add(new MeteringPoint(1L, "DE123456809", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456810", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456811", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456812", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		// Address 5
		meteringPoints.add(new MeteringPoint(1L, "DE123456813", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456814", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456815", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456816", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.WATER));
		
		meteringPoints.add(new MeteringPoint(1L, "DE123456817", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456818", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456819", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456820", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.WATER));
		
		// Address 6
		meteringPoints.add(new MeteringPoint(1L, "DE123456821", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(2L, "DE123456822", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.POWER));
		meteringPoints.add(new MeteringPoint(3L, "DE123456823", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.GAS));
		meteringPoints.add(new MeteringPoint(4L, "DE123456824", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.WATER));
	}
	
	public List<MeteringPoint> getMeteringPoints() {
		return meteringPoints;
	}
	
	public List<MeteringPoint> getMeteringPointsForAddress(Long addressId) {
		return meteringPoints.stream()
				.filter(meterPoint -> addressId.equals(meterPoint.getAddress().getAddressId()))
				.collect(Collectors.toList());
	}

}
