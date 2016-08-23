(function ()
{
    'use strict';
    
    angular.module('fastTrackApp').constant("baseUrl", "http://app3.level365.de");
//    angular.module('fastTrackApp').constant("baseUrl", "http://localhost:8080");
    
    angular.module('fastTrackApp').config(function($httpProvider) {
    	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
    });

})();