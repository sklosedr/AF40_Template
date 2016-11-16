package com.nextlevel.fast.track.model.gateway;

public class Gateway extends AbstractGateway {
	
	public Gateway() {}

	public Gateway(String gatewayId, Long numberOfPowerConnections, Long numberOfGasConnections, Long numberOfWaterConnections, Long numberOfHeatConnections) {
		super(gatewayId, numberOfPowerConnections, numberOfGasConnections, numberOfWaterConnections, numberOfHeatConnections);
	}
	


}
