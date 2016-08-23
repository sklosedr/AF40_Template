(function ()
{
    'use strict';
    
    /** @ngInject */
    angular.module('fastTrackApp').config(function($routeProvider) {
    	$routeProvider
    		.when('/', {
    			templateUrl: 'app/wizard/wizard.view.html',
        		controller: 'WizardController',
        		controllerAs: 'vm'
    		})
    		.when('/login', {
    			templateUrl: 'app/login/login.view.html',
    			controller: 'LoginController',
    			controllerAs: 'vm'
    		})
    		.otherwise('/');
    });
    
    
})();