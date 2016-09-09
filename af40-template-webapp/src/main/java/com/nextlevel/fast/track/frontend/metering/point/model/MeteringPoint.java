package com.nextlevel.fast.track.frontend.metering.point.model;

import com.nextlevel.fast.track.frontend.model.AdditionalAddressInformation;
import com.nextlevel.fast.track.frontend.model.Address;

public class MeteringPoint {
	
	private Long meteringPointId;
	
	private String meteringPointDescription;
	
	private String internalDescription;
	
	private String gatewayId;
	
	private Address address;
	
	private AdditionalAddressInformation additionalAddressInformation;

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
	
}
