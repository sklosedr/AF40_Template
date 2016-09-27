(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.meteringPoint')
        .factory('MeteringPointService', MeteringPointService);
    
    MeteringPointService.$inject = ['$http'];
    
    function MeteringPointService($http) {
    	return {
    		createMeteringPoint : function(meteringPoint) {
    			return $http.post("meteringPoint", meteringPoint, {});
    		}
    	}
    }
    
})();