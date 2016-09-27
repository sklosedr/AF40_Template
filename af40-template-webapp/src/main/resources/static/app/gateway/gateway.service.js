(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.gateway')
        .factory('GatewayService', GatewayService);
    
    GatewayService.$inject = ['$http'];
    
    function GatewayService($http) {
    	return {
    		getGateways : function() {
    			return $http.get("gateway");
    		},
    		getGatewaysForAddress : function(addressId) {
    			return $http.get("gateway/address/" + addressId);
    		}
    	}
    }
    
})();