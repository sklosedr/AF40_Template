package com.nextlevel.fast.track.customer1.frontend.metering.point.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextlevel.fast.track.frontend.connection.object.service.AbstractConnectionObjectService;
import com.nextlevel.fast.track.frontend.metering.point.service.AbstractMeteringPointService;
import com.nextlevel.fast.track.model.address.Address;
import com.nextlevel.fast.track.model.meter.point.MeteringPoint;
import com.nextlevel.fast.track.model.meter.point.MeteringPointType;

@Service
public class MeteringPointService extends AbstractMeteringPointService<MeteringPoint> {

	@Autowired
	private AbstractConnectionObjectService<Address> connectionObjectService;
	
	@PostConstruct
	private void init() {
		// Address 1
		createMeteringPoint(new MeteringPoint(null, "DE123456789", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456790", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456791", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456792", "", "ETHE0112345678", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		createMeteringPoint(new MeteringPoint(null, "DE123456793", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456794", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456795", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456796", "", "EPPC0287658934", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		createMeteringPoint(new MeteringPoint(null, "DE123456797", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456798", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456799", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456800", "", "ETHE0112345679", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		createMeteringPoint(new MeteringPoint(null, "DE123456801", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456802", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456803", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456803", "", "EPPC0287658935", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		createMeteringPoint(new MeteringPoint(null, "DE123456804", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456805", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456806", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456807", "", "ETHE0112345680", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		createMeteringPoint(new MeteringPoint(null, "DE123456809", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456810", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456811", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456812", "", "EPPC0287658936", connectionObjectService.getConnectionObject(1L), MeteringPointType.WATER));
		
		// Address 5
		createMeteringPoint(new MeteringPoint(null, "DE123456813", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456814", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456815", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456816", "", "ETHE0112345681", connectionObjectService.getConnectionObject(5L), MeteringPointType.WATER));
		
		createMeteringPoint(new MeteringPoint(null, "DE123456817", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456818", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456819", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456820", "", "EPPC0287658937", connectionObjectService.getConnectionObject(5L), MeteringPointType.WATER));
		
		// Address 6
		createMeteringPoint(new MeteringPoint(null, "DE123456821", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456822", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.POWER));
		createMeteringPoint(new MeteringPoint(null, "DE123456823", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.GAS));
		createMeteringPoint(new MeteringPoint(null, "DE123456824", "", "EPPC0287658938", connectionObjectService.getConnectionObject(6L), MeteringPointType.WATER));
	}
}
