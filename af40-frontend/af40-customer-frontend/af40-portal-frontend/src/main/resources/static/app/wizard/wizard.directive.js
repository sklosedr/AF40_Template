(function ()
{
    'use strict';

    angular
        .module('fastTrackApp')
        .directive("wizardCard", WizardCard);
    
    function WizardCard() {
    	return {
    		templateUrl: "app/wizard/wizard.card.html",
    		controller: WizardCardController,
    		scope: {
    			card: "="
    		},
    		controllerAs: 'vm'

    	}
    }
    
    angular
    	.module('fastTrackApp')
    	.controller('WizardCardController', WizardCardController);

    WizardCardController.$inject = ['$mdDialog'];

    function WizardCardController($mdDialog) {
		var vm = this;
		
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