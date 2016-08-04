(function ()
{
    'use strict';

    angular
        .module('fastTrackApp.businessPartner')
        .controller('BusinessPartnerController', BusinessPartnerController);
    
    /** @ngInject */
    function BusinessPartnerController($scope)
    {
    	var that = this;
    	
    	that.myMethod = function() {
    		alert('yeah BusinessPartnerController');
    	}
    }
    
})();