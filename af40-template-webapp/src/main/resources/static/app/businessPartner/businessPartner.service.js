(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .factory('BusinessPartnerService', BusinessPartnerService);
    
    /** @ngInject */
    function BusinessPartnerService($http)
    {
    	return {
    		createBusinessPartner : function(businessPartner) {
    			return $http.post("businessPartner", businessPartner, {});
    		}
    	}
    }
    
})();