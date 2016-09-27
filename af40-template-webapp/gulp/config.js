var rootPathConfig= 'src/main/resources/static/';
var appConfig = 'src/main/resources/static/app/';

module.exports = {
    rootPath: rootPathConfig,
    app: appConfig,
    minifyApp: [
  	          appConfig + '**/*.js',
	          '!' + appConfig + 'app.*.js',
	          '!' + appConfig + '**/*.module.js',
	          '!' + appConfig + '**/meteringPoint.controller.js',
	          '!' + appConfig + '**/wizard.controller.js',
	          '!' + appConfig + '**/login.controller.js'    
                ],
    injectAppProd: [
              appConfig + 'app.module.js',
              appConfig + 'app.config.js',
              appConfig + 'app.state.js',
              appConfig + 'login/login.controller.js',
              appConfig + 'wizard/wizard.controller.js',
              appConfig + 'businessPartner/businessPartner.module.js',
              appConfig + 'connectionObject/connectionObject.module.js',
              appConfig + 'gateway/gateway.module.js',
              appConfig + 'meteringPoint/meteringPoint.module.js',
              appConfig + 'meteringPoint/meteringPoint.controller.js',
              rootPathConfig + 'app.min.js'
                ],
    injectAppDev: [
              appConfig + 'app.module.js',
              appConfig + 'app.config.js',
              appConfig + 'app.state.js',
              
              appConfig + 'service/account.service.js',
              appConfig + 'service/auth.service.js',
              appConfig + 'service/auth.session.service.js',
              appConfig + 'service/principal.service.js',
              
              appConfig + 'login/login.controller.js',
              appConfig + 'wizard/wizard.controller.js',
              
              appConfig + 'businessPartner/businessPartner.module.js',
              appConfig + 'businessPartner/businessPartner.controller.js',
              appConfig + 'businessPartner/businessPartner.service.js',
              
              appConfig + 'connectionObject/connectionObject.module.js',
              appConfig + 'connectionObject/connectionObject.service.js',
              
              appConfig + 'gateway/gateway.module.js',
              appConfig + 'gateway/gateway.service.js',
              
              appConfig + 'meteringPoint/meteringPoint.module.js',
              appConfig + 'meteringPoint/meteringPoint.controller.js',
              appConfig + 'meteringPoint/meteringPoint.service.js',
                ]

                
};
