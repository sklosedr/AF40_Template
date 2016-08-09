(function ()
{
    'use strict';

    angular
        .module('fastTrackApp')
        .controller('WizardController', WizardController);

    /** @ngInject */
    function WizardController($mdDialog)
    {
    	var vm = this;
    	
    	vm.showPopupForm = function($event) {

            $mdDialog.show({
                parent: angular.element(document.body),
                targetEvent: $event,
                templateUrl: 'app/businessPartner/businessPartner.html' ,
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