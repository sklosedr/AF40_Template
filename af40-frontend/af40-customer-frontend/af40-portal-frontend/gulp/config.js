var rootPathConfig= 'src/main/resources/static/';
var jsPathConfig = rootPathConfig + 'js/'; 
var appConfig = rootPathConfig + 'app/';
var bowerConfig = rootPathConfig + 'bower_components/';

module.exports = {
    rootPath: rootPathConfig,
    app: appConfig,
    jsPath: jsPathConfig,
    minifyApp: [
                appConfig + 'app.module.js',
                appConfig + 'app.config.js',
                appConfig + 'app.state.js',
                
                appConfig + 'service/account.service.js',
                appConfig + 'service/auth.service.js',
                appConfig + 'service/auth.session.service.js',
                appConfig + 'service/principal.service.js',
                appConfig + 'service/template.service.js',
                
                appConfig + 'login/login.controller.js',
                
                appConfig + 'businessPartner/businessPartner.controller.js',
                appConfig + 'businessPartner/businessPartner.service.js',
                
                appConfig + 'connectionObject/connectionObject.service.js',
                
                appConfig + 'gateway/gateway.service.js',
                
                appConfig + 'meteringPoint/meteringPoint.controller.js',
                appConfig + 'meteringPoint/meteringPoint.service.js',
                ],
    injectAppProd: [
              jsPathConfig + 'vendor.min.js',
              jsPathConfig + 'app.min.js',
              appConfig + 'wizard/wizard.controller.js',
                ],
    injectAppDev: [
              jsPathConfig + 'vendor.min.js',
              
              appConfig + 'app.module.js',
              appConfig + 'app.config.js',
              appConfig + 'app.state.js',
              
              appConfig + 'service/account.service.js',
              appConfig + 'service/auth.service.js',
              appConfig + 'service/auth.session.service.js',
              appConfig + 'service/principal.service.js',
              appConfig + 'service/template.service.js',
              
              appConfig + 'login/login.controller.js',
              appConfig + 'wizard/wizard.controller.js',
              
              appConfig + 'businessPartner/businessPartner.controller.js',
              appConfig + 'businessPartner/businessPartner.service.js',
              
              appConfig + 'connectionObject/connectionObject.service.js',
              
              appConfig + 'gateway/gateway.service.js',
              
              appConfig + 'meteringPoint/meteringPoint.controller.js',
              appConfig + 'meteringPoint/meteringPoint.service.js'
                ],
    injectVendor: [
              bowerConfig + 'angular/angular.js',
              bowerConfig + 'angular-aria/angular-aria.js',
              bowerConfig + 'angular-messages/angular-messages.js',
              bowerConfig + 'angular-cookies/angular-cookies.js',
              bowerConfig + 'angular-sanitize/angular-sanitize.js',
              bowerConfig + 'angular-resource/angular-resource.js',
              bowerConfig + 'angular-translate/angular-translate.js',
              bowerConfig + 'angular-translate-loader-partial/angular-translate-loader-partial.js',
              bowerConfig + 'angular-mocks/angular-mocks.js',
              bowerConfig + 'jquery/dist/jquery.js',
              bowerConfig + 'mobile-detect/mobile-detect.js',
              bowerConfig + 'angular-ui-router/release/angular-ui-router.js',
              bowerConfig + 'perfect-scrollbar/js/perfect-scrollbar.jquery.js',
              bowerConfig + 'perfect-scrollbar/js/perfect-scrollbar.js',
              bowerConfig + 'moment/moment.js',
              bowerConfig + 'angular-animate/angular-animate.js',
              bowerConfig + 'angular-material/angular-material.js',
              bowerConfig + 'ngstorage/ngStorage.js',
              bowerConfig + 'angular-resource/angular-resource.js',
              bowerConfig + 'angular-route/angular-route.min.js',
              bowerConfig + 'angular-base64/angular-base64.js',
              bowerConfig + 'material-steppers/dist/material-steppers.js',
              bowerConfig + 'lodash/dist/lodash.min.js',
              bowerConfig + 'angular-simple-logger/dist/angular-simple-logger.js',
              bowerConfig + 'angular-google-maps/dist/angular-google-maps.js',
                ]
                
};
