(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.connectionObject')
        .factory('ConnectionObjectService', ConnectionObjectService);
    
    /** @ngInject */
    function ConnectionObjectService($http, baseUrl)
    {
    	return {
    		getConnectionObjects : function() {
    			return $http.get(baseUrl + "/connectionObject");
    		}
    	}
    }
    
})();