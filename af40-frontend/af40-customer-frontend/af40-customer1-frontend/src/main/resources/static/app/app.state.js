(function ()
{
    'use strict';
    
    angular.module('fastTrackApp').config(stateConfig);
    
    stateConfig.$inject = ['$routeProvider'];
    
    function stateConfig($routeProvider) {
    	$routeProvider
    		.when('/', {
    			templateUrl: 'app/wizard/c_wizard.view.html',
        		controller: 'WizardController',
        		controllerAs: 'vm'
    		})
    		.when('/login', {
    			templateUrl: 'app/login/login.view.html',
    			controller: 'LoginController',
    			controllerAs: 'vm'
    		})
    		.otherwise('/');
    }
    
    
})();