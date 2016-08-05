(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .controller('BusinessPartnerController', BusinessPartnerController);
    
    /** @ngInject */
    function BusinessPartnerController($scope, $mdStepper)
    {
    	var that = this;
    	
    	$scope.businessPartner = {};
    	$scope.businessPartner.address = {};
   	
    	that.forward = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.next();
    	}
    	
    	that.back = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.back();
    	}
    	
    	that.createBusinessPartner = function() {
    		alert('Create BusinessPartner');
    	}

    }
    
})();