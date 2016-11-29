(function ()
{
    'use strict';

    angular
        .module('fastTrackApp')
        .controller('WizardController', WizardController);

    WizardController.$inject = ['$location', 'Principal', 'TemplateService'];
    
    function WizardController($location, Principal, TemplateService) {
    	var vm = this;
    	
    	var auth = Principal.isAuthenticated ();
    	if (!auth) {
    		$location.path('/login'); 
    	}
    	
    	vm.getCards = function() {
    		return TemplateService.getCards();
    	}
    	
    }
})(angular);