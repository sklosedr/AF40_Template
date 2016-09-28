(function ()
{
    'use strict';

    angular
        .module('fastTrackApp')
        .factory('ConnectionObjectService', ConnectionObjectService);
    
    ConnectionObjectService.$inject = ['$http'];
    
    function ConnectionObjectService($http)
    {
    	return {
    		getConnectionObjects : function() {
    			return $http.get("connectionObject");
    		}
    	}
    }
    
})();