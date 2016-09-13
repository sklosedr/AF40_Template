(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.meteringPoint')
        .factory('MeteringPointService', MeteringPointService);
    
    /** @ngInject */
    function MeteringPointService($http, baseUrl) {
    	return {
    		createMeteringPoint : function(meteringPoint) {
    			return $http.post(baseUrl + "/meteringPoint", meteringPoint, {});
    		}
    	}
    }
    
})();