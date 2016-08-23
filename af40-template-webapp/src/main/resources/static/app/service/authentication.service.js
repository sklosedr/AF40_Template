(function() {
    'use strict';

    angular
        .module('fastTrackApp')
        .factory('AuthenticationService', AuthenticationService);
    
    /** @ngInject */
    function AuthenticationService ($http, baseUrl, $rootScope) {
    	var service = {
    			isAuthenticated: isAuthenticated, 
    			isUser: isUser
    			
    	}
    	return service;
    	
    	function isAuthenticated() {
    		return $rootScope.authenticated = true;
    	}
    	
    	function isUser() {
    		$http.get(baseUrl + '/authentication/isUser', {})
    			.success(function (data) {
    				alert('name: ' + data.name);
    				if (data.name) {
    			        $rootScope.authenticated = true;
    			      } else {
    			        $rootScope.authenticated = false;
    			      }
    			})
    			.error(function () {
    				$rootScope.authenticated = false;
    				alert('Fehler!');
    			});
    	}
    	
    	
    }
    
    
})();