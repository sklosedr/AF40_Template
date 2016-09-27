(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .factory('BusinessPartnerService', BusinessPartnerService);
    
    BusinessPartnerService.$inject = ['$http'];
    
    function BusinessPartnerService($http)
    {
    	return {
    		createBusinessPartner : function(businessPartner) {
    			return $http.post("businessPartner", businessPartner, {});
    		}
    	}
    }
    
})();