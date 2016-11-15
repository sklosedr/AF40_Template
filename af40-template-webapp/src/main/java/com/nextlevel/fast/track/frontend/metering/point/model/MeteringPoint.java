package com.nextlevel.fast.track.frontend.metering.point.model;

import com.nextlevel.fast.track.model.address.AdditionalAddressInformation;
import com.nextlevel.fast.track.model.address.Address;

public class MeteringPoint {
	
	private Long meteringPointId;
	
	private String meteringPointDescription;
	
	private String internalDescription;
	
	private String gatewayId;
	
	private Address address;
	
	private MeteringPointType meteringPointType;
	
	private AdditionalAddressInformation additionalAddressInformation;
	
	public MeteringPoint() {}
	
	public MeteringPoint(Long meteringPointId, String meteringPointDescription, String internalDescription, String gatewayId, Address address, MeteringPointType meteringPointType) {
		this.meteringPointId = meteringPointId;
		this.meteringPointDescription = meteringPointDescription;
		this.internalDescription = internalDescription;
		this.gatewayId = gatewayId;
		this.address = address;
		this.meteringPointType = meteringPointType;
	}

	public Long getMeteringPointId() {
		return meteringPointId;
	}

	public void setMeteringPointId(Long meteringPointId) {
		this.meteringPointId = meteringPointId;
	}

	public String getMeteringPointDescription() {
		return meteringPointDescription;
	}

	public void setMeteringPointDescription(String meteringPointDescription) {
		this.meteringPointDescription = meteringPointDescription;
	}

	public String getInternalDescription() {
		return internalDescription;
	}

	public void setInternalDescription(String internalDescription) {
		this.internalDescription = internalDescription;
	}

	public String getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public AdditionalAddressInformation getAdditionalAddressInformation() {
		return additionalAddressInformation;
	}

	public void setAdditionalAddressInformation(AdditionalAddressInformation additionalAddressInformation) {
		this.additionalAddressInformation = additionalAddressInformation;
	}
	
	public MeteringPointType getMeteringPointType() {
		return meteringPointType;
	}
	
	public void setMeteringPointType(MeteringPointType meteringPointType) {
		this.meteringPointType = meteringPointType;
	}
	
}
