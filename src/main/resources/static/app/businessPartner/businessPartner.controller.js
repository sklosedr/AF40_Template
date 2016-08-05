(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .controller('BusinessPartnerController', BusinessPartnerController);
    
    /** @ngInject */
    function BusinessPartnerController($scope, $mdStepper, $http, $mdDialog)
    {
    	var that = this;
    	
    	$scope.businessPartner = {};
    	$scope.businessPartner.firstname = "";
    	$scope.businessPartner.address = {};
    	
    	var businessPartner = $scope.businessPartner;
    	
    	that.forward = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.next();
    	}
    	
    	that.back = function() {
    		var steppers = $mdStepper('businessPartnerStepper');
    		steppers.back();
    	}
    	
    	that.createBusinessPartner = function() {
    		$http.post("http://localhost:8080/businessPartner", $scope.businessPartner, {})
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