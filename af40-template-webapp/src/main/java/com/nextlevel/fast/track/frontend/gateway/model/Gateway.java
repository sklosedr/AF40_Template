package com.nextlevel.fast.track.frontend.gateway.model;

import com.nextlevel.fast.track.frontend.model.AdditionalAddressInformation;

public class Gateway {
	
	private String gatewayId;
	
	private AdditionalAddressInformation additionalAddressInformation;
	
	private Long numberOfPowerConnections;
	
	private Long numberOfGasConnections;
	
	private Long numberOfWaterConnections;
	
	

	public Gateway() {}

	public Gateway(String gatewayId, Long numberOfPowerConnections, Long numberOfGasConnections, Long numberOfWaterConnections) {
		this.gatewayId = gatewayId;
		this.numberOfPowerConnections = numberOfPowerConnections;
		this.numberOfGasConnections = numberOfGasConnections;
		this.numberOfWaterConnections = numberOfWaterConnections;
	}

	public String getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public AdditionalAddressInformation getAdditionalAddressInformation() {
		return additionalAddressInformation;
	}

	public void setAdditionalAddressInformation(AdditionalAddressInformation additionalAddressInformation) {
		this.additionalAddressInformation = additionalAddressInformation;
	}

	public Long getNumberOfPowerConnections() {
		return numberOfPowerConnections;
	}

	public void setNumberOfPowerConnections(Long numberOfPowerConnections) {
		this.numberOfPowerConnections = numberOfPowerConnections;
	}

	public Long getNumberOfGasConnections() {
		return numberOfGasConnections;
	}

	public void setNumberOfGasConnections(Long numberOfGasConnections) {
		this.numberOfGasConnections = numberOfGasConnections;
	}

	public Long getNumberOfWaterConnections() {
		return numberOfWaterConnections;
	}

	public void setNumberOfWaterConnections(Long numberOfWaterConnections) {
		this.numberOfWaterConnections = numberOfWaterConnections;
	}

}
