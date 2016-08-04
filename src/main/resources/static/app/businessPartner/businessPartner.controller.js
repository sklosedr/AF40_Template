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
    	
    	that.secondStep = function() {
    		alert('Second Step');
    	}
    	
    	that.cancel = function() {
    		alert('cancel');
    	}

    }
    
})();