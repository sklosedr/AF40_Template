node('build-slave') {

    // Project name will be passed in as a parameter
    def project = "${GCP_PROJECT_NAME}"
    def appName = 'fast4'

    // BUILD_DATE_TIME defined as a build parameter in Jenkins
    def imageTag = "eu.gcr.io/${project}/${appName}:${BUILD_DATE_TIME}"

    // Mark the code checkout 'stage'....
    stage 'Checkout'

    // Checkout the code
    checkout scm

    // Mark the code build 'stage'....
    stage 'Compile'
    // Run the maven build
    sh "mvn clean compile"

    // Test and Package
    stage 'Test and Package'
    sh "mvn package"

    stage 'Bake Docker Image'
    sh("docker build -t ${imageTag}-nb af40-backend/af40-customer-backend/af40-nli-backend")
    sh("docker build -t ${imageTag}-pf af40-frontend/af40-customer-frontend/af40-portal-frontend")

    stage 'Push images to GCR'
    sh("gcloud auth activate-service-account --key-file /opt/config/gcloud-svc-account.json")
    sh("gcloud config set project ${project}")
    sh("gcloud docker push ${imageTag}-nb")
    sh("gcloud docker push ${imageTag}-pf")

    stage 'Deploy latest version'
    sh("sed -i.bak 's#eu.gcr.io/GCP_PROJECT/APP_NAME:1.0.0#${imageTag}#' ./k8s/deployments/app-deployment.yaml")
    sh("kubectl apply -f k8s/deployments/app-deployment.yaml")
//   sh("kubectl apply -f k8s/services/app-service.yaml")
// services über expose deployment anlegen    - nur beim allerersten Deployment. 
//    sh("kubectl expose deployment fast4-deploy  --type=LoadBalancer --name=fast4-service")

//    stage 'Extract service IP address'
    // Execute and wait for external service to become availabl
//    sh("echo 'kubectl get services'")
    // Read output from script above
//    def FRONTEND_ADDRESS=readFile('frontend_service_address').trim()

//    stage 'Output service external address'
//    sh("echo 'kubectl get services'")
}
