(function ()
{
    'use strict';
    
    angular.module('fastTrackApp', ['ngMaterial', 'ngRoute', 'fastTrackApp.businessPartner']);
    
    angular.module('fastTrackApp').constant("baseUrl", "http://app3.level365.de");
//    angular.module('fastTrackApp').constant("baseUrl", "http://localhost:8080");


})();