(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.meteringPoint')
        .controller('MeteringPointController', MeteringPointController);
    
    /** @ngInject */
    function MeteringPointController($mdStepper, $http, $mdDialog, $log, ConnectionObjectService, GatewayService, baseUrl)
    {
    	var vm = this;
    	
    	vm.map = { center: { latitude: 45, longitude: -73 }, zoom: 8 };
    	
    	vm.meteringPoint = {};
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
    		alert('Messstelle erstellt');
    		$mdDialog.hide();
    	}
    	
    	vm.selectedItem = '';
    	vm.simulateQuery = true;
    	vm.isDisabled    = false;
    	
        // list of `state` value/display objects
    	ConnectionObjectService.getConnectionObjects().success(function (result) {
    		vm.states = result.map(function (address) {
                return {
                    value: address.street.toLowerCase(),
                    display: address.street + ' ' + address.streetNumber + ', ' + address.zipCode + ' ' + address.city
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
          
      	  vm.isNewGateway = function() {
      		  return vm.selectedGateway === 'new_gateway';
      	  }
      	  
      	  GatewayService.getGateways().success(function (result) {
      		  vm.gateways = result;      		  
      	  });
    	
    }
    
})();