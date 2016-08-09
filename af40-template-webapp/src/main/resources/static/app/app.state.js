(function ()
{
    'use strict';
    
    /** @ngInject */
    angular.module('fastTrackApp').config(function($routeProvider) {
    	$routeProvider
    		.when('/', {
    			templateUrl: 'app/wizard/wizard.html',
        		controller: 'WizardController',
        		controllerAs: 'vm'    			
    		})
    		.when('/login', {
    			templateUrl: 'app/login/login.html',
    			controller: 'LoginController',
    			controllerAs: 'vm'
    		})
    		.otherwise('/');
    });
    
    
})();