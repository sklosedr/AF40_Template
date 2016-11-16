(function() {
    'use strict';

    angular
        .module('fastTrackApp')
        .factory('Auth', Auth);
    
    Auth.$inject = ['$q', '$location', 'Principal', 'AuthServerProvider'];
    
    function Auth ($q, $location, Principal, AuthServerProvider) {
    	var service = {
    			login: login,
                logout: logout
    	};
    	
    	return service;
    	
        function login (credentials, callback) {
            var cb = callback || angular.noop;
            var deferred = $q.defer();

            AuthServerProvider.login(credentials)
                .then(loginThen)
                .catch(function (err) {
                    this.logout();
                    deferred.reject(err);
                    return cb(err);
                }.bind(this));

            function loginThen (data) {
                Principal.identity(true).then(function(account) {
                    deferred.resolve(data);
                    $location.path('/');
                });
                return cb();
            }

            return deferred.promise;
        }
        
        function logout () {
            AuthServerProvider.logout();
            Principal.authenticate(null);
        }
        
        
        
    }
    
})();