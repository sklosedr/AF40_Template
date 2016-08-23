(function ()
{
    'use strict';
    
    angular.module('fastTrackApp').constant("baseUrl", "http://23.251.139.27");
//    angular.module('fastTrackApp').constant("baseUrl", "http://localhost:8080");
    
    angular.module('fastTrackApp').config(function($httpProvider) {
    	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
    });

})();