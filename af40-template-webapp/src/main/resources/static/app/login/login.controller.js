(function ()
{
    'use strict';

    angular
        .module('fastTrackApp')
        .controller('LoginController', LoginController);

    /** @ngInject */
    function LoginController($rootScope, Auth)
    {
    	var vm = this;
    	vm.authenticationError = false;
    	vm.credentials = {};
    	vm.login = login;
    	vm.credentials.username = null;

    	function login($event) {
    		Auth.login({
                username: vm.credentials.username,
                password: vm.credentials.password
            }).then(function () {
            	vm.authenticationError = false;
            }).catch(function () {
            	vm.authenticationError = true;
            });
    	}
    	
    }
    
})();