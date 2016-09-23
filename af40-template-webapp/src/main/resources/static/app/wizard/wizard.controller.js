(function ()
{
    'use strict';

    angular
        .module('fastTrackApp')
        .controller('WizardController', WizardController);

    /** @ngInject */
    function WizardController($mdDialog, $location, Principal)
    {
    	var vm = this;
    	
    	var auth = Principal.isAuthenticated ();
    	if (!auth) {
    		$location.path('/login'); 
    	}
    	
    	vm.showPopupForm = function($event, $templateUrl) {

            $mdDialog.show({
                parent: angular.element(document.body),
                targetEvent: $event,
                templateUrl: $templateUrl ,
                locals: {
                    items: this.items
                },
                controller: DialogController
            });

            function DialogController($scope, $mdDialog, items) {
                $scope.items = items;
                $scope.closeDialog = function() {
                    $mdDialog.hide();
                }
            }
    	}
    }
})(angular);