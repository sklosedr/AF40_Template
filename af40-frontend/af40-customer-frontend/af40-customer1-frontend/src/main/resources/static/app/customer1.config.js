(function ()
{
    'use strict';
    
    angular.module('fastTrackApp').run(configTemplate);
    
    configTemplate.$inject = ['TemplateService'];
    
    function configTemplate(TemplateService) {
    	TemplateService.setCallback(function(wizardCards) {
    		wizardCards[1].template = "app/businessPartner/c_businessPartner.html";
    		TemplateService.setCards(wizardCards);
    	});
    }
    
})();