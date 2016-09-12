(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.gateway')
        .factory('GatewayService', GatewayService);
    
    /** @ngInject */
    function GatewayService($http, baseUrl)
    {
    	return {
    		getGateways : function() {
    			return $http.get(baseUrl + "/gateway");
    		},
    		getGatewaysForAddress : function(addressId) {
    			return $http.get(baseUrl + "/gateway/address/" + addressId);
    		}
    	}
    }
    
})();