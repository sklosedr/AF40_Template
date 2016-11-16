(function() {
    'use strict';

    angular
    	.module('fastTrackApp')
        .factory('AuthServerProvider', AuthServerProvider);
    
    AuthServerProvider.$inject = ['$http', '$localStorage'];

    function AuthServerProvider ($http, $localStorage) {
        var service = {
                getToken: getToken,
                hasValidToken: hasValidToken,
                login: login,
                logout: logout
        };
        
        return service;
        
        function getToken () {
            var token = $localStorage.authenticationToken;
            return token;
        }

        function hasValidToken () {
            var token = this.getToken();
            return !!token;
        }
        
        function login (credentials) {
            var data = 'j_username=' + encodeURIComponent(credentials.username) +
                '&j_password=' + encodeURIComponent(credentials.password) +
                '&remember-me=false&submit=Login';

            return $http.post('api/authentication', data, {
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded'
                }
            }).success(function (response) {
                return response;
            }).catch(function (error) {
            	alert('error: ' + error.data);
            });
        }

        function logout () {

            
            // logout from the server
            $http.post('logout').success(function (response) {
                delete $localStorage.authenticationToken;
                // to get a new csrf token call the api
                $http.get('user');
                return response;
            });
            
        }
        
    }
    
})();