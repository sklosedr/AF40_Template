(function ()
{
    'use strict';
    
//    angular.module('fastTrackApp').constant("baseUrl", "http://23.251.139.27");
    angular.module('fastTrackApp').constant("baseUrl", "http://localhost:8080");
    
    angular.module('fastTrackApp').config(function($httpProvider, $mdThemingProvider) {
    	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
    	$mdThemingProvider.theme('default')
	    	.primaryPalette('amber')
	        .accentPalette('light-blue')
	        .warnPalette('deep-orange')
	        .backgroundPalette('grey'); 
    });

})();