package com.nextlevel.fast.track.model.meter.point;

import com.nextlevel.fast.track.model.address.Address;

public class MeteringPoint extends AbstractMeterPoint {
	
	public MeteringPoint() {}
	
	public MeteringPoint(Long meteringPointId, String meteringPointDescription, String internalDescription, String gatewayId, Address address, MeteringPointType meteringPointType) {
		super(meteringPointId, meteringPointDescription, internalDescription, gatewayId, address, meteringPointType);
	}
	
}
