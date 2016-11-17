(function ()
{
    'use strict';

    angular.module('fastTrackApp').config(globalConfig);
    
    globalConfig.$inject = ['$httpProvider', '$mdThemingProvider'];
    
    function globalConfig($httpProvider, $mdThemingProvider) {
    	$httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
    	$mdThemingProvider.theme('default')
	    	.primaryPalette('orange')
	        .accentPalette('blue')
	        .warnPalette('deep-orange')
	        .backgroundPalette('grey'); 
    };
    
})();