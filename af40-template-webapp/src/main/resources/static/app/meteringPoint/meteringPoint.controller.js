(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.meteringPoint')
        .controller('MeteringPointController', MeteringPointController);
    
    /** @ngInject */
    function MeteringPointController($mdStepper, $http, $mdDialog, $log, $mdToast, ConnectionObjectService, GatewayService, MeteringPointService, baseUrl)
    {
    	var vm = this;
    	
    	vm.meteringPoint = {};
    	vm.meteringPoint.meteringPointType = 'POWER';
    	vm.meteringPoint.address = {};
    	vm.meteringPoint.additionalAddressInformation = {};
    	
    	vm.forward = function() {
    		var steppers = $mdStepper('meteringPointStepper');
    		steppers.next();
    	}
    	
    	vm.back = function() {
    		var steppers = $mdStepper('meteringPointStepper');
    		steppers.back();
    	}
    	
    	vm.createMeteringPoint = function() {
    		MeteringPointService.createMeteringPoint(vm.meteringPoint);
    	    $mdToast.show(
    	    	      $mdToast.simple()
    	    	        .textContent('Messstelle erstellt')
    	    	        .position('bottom left')
    	    	        .hideDelay(10000)
    	    	    );
    		$mdDialog.hide();
    	}
    	
    	vm.selectedItem = '';
    	vm.simulateQuery = true;
    	vm.isDisabled = false;
    	vm.isNewGateway = true;
    	
        // list of `state` value/display objects
    	ConnectionObjectService.getConnectionObjects().success(function (result) {
    		vm.states = result.map(function (address) {
                return {
                    value: address.street.toLowerCase(),
                    display: address.street + ' ' + address.streetNumber + ', ' + address.zipCode + ' ' + address.city,
                    display1: address.street + ' ' + address.streetNumber,
                    display2: address.zipCode + ' ' + address.city,
                    addressId: address.addressId,
                    street : address.street,
                    streetNumber : address.streetNumber,
                    zipCode : address.zipCode,
                    city : address.city,
                    extraAddressLine : address.extraAddressLine,
                    latitude: address.latitude,
                    longitude: address.longitude
                  };
    		});   		
    	});
    	vm.querySearch   = querySearch;
    	vm.selectedItemChange = selectedItemChange;
    	vm.searchTextChange   = searchTextChange;

    	vm.newState = newState;

        function newState(state) {
            alert("Sorry! You'll need to create a Constitution for " + state + " first!");
          }

          // ******************************
          // Internal methods
          // ******************************

          /**
           * Search for states... use $timeout to simulate
           * remote dataservice call.
           */
          function querySearch(query) {
            var results = query ? vm.states.filter( createFilterFor(query) ) : vm.states,
                deferred;
            if (self.simulateQuery) {
              deferred = $q.defer();
              $timeout(function () { deferred.resolve( results ); }, Math.random() * 1000, false);
              return deferred.promise;
            } else {
              return results;
            }
          }

          function searchTextChange(text) {
            $log.info('Text changed to ' + text);
          }

          function selectedItemChange(item) {
            $log.info('Item changed to ' + JSON.stringify(item));
            if( vm.selectedItem ) {
            	vm.map = { center: { latitude: vm.selectedItem.latitude, longitude: vm.selectedItem.longitude }, zoom: 15 };
            	vm.meteringPoint.address = vm.selectedItem;
            	GatewayService.getGatewaysForAddress(vm.selectedItem.addressId).success(function (result) {
              	  vm.gateways = result;      		  
              	});
            }
          }

          /**
           * Create filter function for a query string
           */
          function createFilterFor(query) {
            var lowercaseQuery = angular.lowercase(query);

            return function filterFn(state) {
              return (state.value.indexOf(lowercaseQuery) === 0);
            };

          }
          
          vm.createNewGateway = function() {
        	  vm.isNewGateway = true;
          }
          
          vm.newGatewayIdChanged = function() {
        	  vm.meteringPoint.gatewayId = vm.newGatewayId;
          }
          
          vm.useExistingGateway = function() {
        	  vm.isNewGateway = false;
          }
      	  
      	  GatewayService.getGateways().success(function (result) {
      		  vm.gateways = result;      		  
      	  });
      	  
      	  vm.showAdditionalAddressInformation = function(additionalAddressInformation) {
      		  var addressInfo = [];
      		  if (additionalAddressInformation.building) {
      			addressInfo.push('Gebäude ' + additionalAddressInformation.building);
      		  }
      		  if (additionalAddressInformation.floor) {
      			addressInfo.push('Etage ' + additionalAddressInformation.floor);
      		  }
      		  if (additionalAddressInformation.room) {
      			addressInfo.push('Raum ' + additionalAddressInformation.room);
      		  }
      		  var text = addressInfo.join(', ');
      		  if (text) {
      			  text = '\\\\ ' + text;
      		  }
      		  return text;
      	  }
    	
    }
    
})();