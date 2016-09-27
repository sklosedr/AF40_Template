(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .controller('BusinessPartnerController', BusinessPartnerController);
    
    BusinessPartnerController.$inject = ['$mdStepper', '$http', '$mdDialog', '$mdToast', 'BusinessPartnerService'];
    
    function BusinessPartnerController($mdStepper, $http, $mdDialog, $mdToast, BusinessPartnerService)
    {
    	var vm = this;
    	
    	vm.formOfOrganisation = 'person';
    	vm.businessPartner = {};
    	vm.businessPartner.person = {};
    	vm.businessPartner.contactPerson = {};
    	vm.businessPartner.address = {};
    	
    	vm.forward = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.next();
    	}
    	
    	vm.isPerson = function() {
    		return vm.formOfOrganisation === 'person';
    	}
    	
    	vm.isCompany = function() {
    		return vm.formOfOrganisation === 'company';
    	}
    	
    	vm.back = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.back();
    	}
    	
    	vm.createBusinessPartner = function() {
    		BusinessPartnerService.createBusinessPartner(vm.businessPartner)
    			.then(function (result) {
    				doToast('Der Geschäftspartner wurde erfolgreich angelegt.');
    				$mdDialog.hide();
    			}).catch(function (result) {
    				doToast('Fehler ' +  result.status + ' ' + result.statusText);
    				$mdDialog.hide();
    			} );
    	}
    	
    	function doToast(message) {
    	    $mdToast.show(
  	    	      $mdToast.simple()
  	    	        .textContent(message)
  	    	        .position('bottom left')
  	    	        .hideDelay(10000)
  	    	    );
    	}

    }
    
})();