(function ()
{
    'use strict';
    
    /** @ngInject */
    angular.module('fastTrackApp').config(function($routeProvider) {
    	$routeProvider
    		.when('/', {
    			templateUrl: 'app/wizard/wizard.html'
//        		controller: 'IndexController',
//        		controllerAs: 'vm'    			
    		})
    		.when('/login', {
    			templateUrl: 'app/login/login.html'
//    			controller: 'IndexController',
//    			controllerAs: 'vm'
    		})
    		.otherwise('/');
    		
    });
    
    
})();