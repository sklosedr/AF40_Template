(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.meteringPoint')
        .controller('MeteringPointController', MeteringPointController);
    
    /** @ngInject */
    function MeteringPointController($mdStepper, $http, $mdDialog, $log, baseUrl)
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
    	
    	vm.simulateQuery = true;
    	vm.isDisabled    = false;

        // list of `state` value/display objects
    	vm.states        = loadAll();
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
           * Build `states` list of key/value pairs
           */
          function loadAll() {
            var allStates = 'Nattermannallee 1, 50829 Köln; Goldenbergstraße 2, 50354 Hürth; Parkgürtel 24, 50823 Köln;\
            	Siegburger Str. 229, 50679 Köln; Sellerstraße 16, 13353 Berlin; Glockengießerwall 2, 20095 Hamburg;\
            	Glockengießerwall 2, 20095 Hamburg';

            return allStates.split(/; +/g).map( function (state) {
              return {
                value: state.toLowerCase(),
                display: state
              };
            });
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
          
          
          vm.gateways = [
            {
            	gatewayId: 'EPPC0287658934'            	
            },
            {
            	gatewayId: 'ETHE0112345678'            	
            },
            {
            	gatewayId: 'ETHE0992347778'            	
            },
            {
            	gatewayId: 'ETHE0992347779'            	
            },
            {
            	gatewayId: 'ETHE0992347780'            	
            }
          ];
          
          
    	
    }
    
})();