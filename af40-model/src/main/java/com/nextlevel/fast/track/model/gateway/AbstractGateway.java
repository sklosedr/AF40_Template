package com.nextlevel.fast.track.model.gateway;

import com.nextlevel.fast.track.model.address.AdditionalAddressInformation;

public class AbstractGateway {

	private String gatewayId;
	
	private AdditionalAddressInformation additionalAddressInformation;
	
	private Long numberOfPowerConnections;
	
	private Long numberOfGasConnections;
	
	private Long numberOfWaterConnections;
	
	private Long numberOfHeatConnections;

	public AbstractGateway() {}

	public AbstractGateway(String gatewayId, Long numberOfPowerConnections, Long numberOfGasConnections, Long numberOfWaterConnections, Long numberOfHeatConnections) {
		this.gatewayId = gatewayId;
		this.numberOfPowerConnections = numberOfPowerConnections;
		this.numberOfGasConnections = numberOfGasConnections;
		this.numberOfWaterConnections = numberOfWaterConnections;
		this.numberOfHeatConnections = numberOfHeatConnections;
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
	
	public Long getNumberOfHeatConnections() {
		return numberOfHeatConnections;
	}
	
	public void setNumberOfHeatConnections(Long numberOfHeatConnections) {
		this.numberOfHeatConnections = numberOfHeatConnections;
	}
}
