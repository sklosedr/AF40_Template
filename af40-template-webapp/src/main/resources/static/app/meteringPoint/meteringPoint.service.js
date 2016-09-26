(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.meteringPoint')
        .factory('MeteringPointService', MeteringPointService);
    
    /** @ngInject */
    function MeteringPointService($http) {
    	return {
    		createMeteringPoint : function(meteringPoint) {
    			return $http.post("meteringPoint", meteringPoint, {});
    		}
    	}
    }
    
})();