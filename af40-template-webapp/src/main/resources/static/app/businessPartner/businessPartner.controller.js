(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .controller('BusinessPartnerController', BusinessPartnerController);
    
    /** @ngInject */
    function BusinessPartnerController($mdStepper, $http, $mdDialog, baseUrl)
    {
    	var vm = this;
    	
    	vm.businessPartner = {};
    	vm.businessPartner.person = {};
    	vm.businessPartner.contactPerson = {};
    	vm.businessPartner.address = {};

    	vm.forward = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.next();
    	}
    	
    	vm.back = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.back();
    	}
    	
    	vm.createBusinessPartner = function() {
    		$http.post(baseUrl + "/businessPartner", vm.businessPartner, {})
    			.then(function (result) {
    				alert('Der Geschäftspartner wurde erfolgreich angelegt.');
    				$mdDialog.hide();
    			}).catch(function (result) {
    				alert('Fehler ' +  result.status + ' ' + result.statusText);
    				$mdDialog.hide();
    			} );
    	}

    }
    
})();