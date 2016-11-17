(function() {
    'use strict';

    angular
        .module('fastTrackApp')
        .factory('TemplateService', TemplateService);
    
    TemplateService.$inject = ['$http', '$log'];
    
    function TemplateService ($http, $log) {
    	
    	var vm = this;
    	
    	vm.wizardCards = [];
    	
    	function getCards() {
    		return vm.wizardCards;
    	}
    	
    	$http.get('app/template.json')
			.success(function (result) {
				var cards = result.main.wizard.cards;
				$log.info('init ' + cards.length + ' wizard cards');
	        	for (var i = 0; i < cards.length; i++) {
	        		vm.wizardCards.push(cards[i]);
	        	}
			}).catch(function (result) {
				$log.error('Error ' +  result.status + ' ' + result.statusText);
    		} );

    	var service = {
    		getCards: getCards	
    	}
    	return service;
    }
})();