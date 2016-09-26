(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.connectionObject')
        .factory('ConnectionObjectService', ConnectionObjectService);
    
    /** @ngInject */
    function ConnectionObjectService($http)
    {
    	return {
    		getConnectionObjects : function() {
    			return $http.get("connectionObject");
    		}
    	}
    }
    
})();