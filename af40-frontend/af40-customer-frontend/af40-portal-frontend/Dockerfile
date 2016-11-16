FROM anapsix/alpine-java:jre8

MAINTAINER sklose@next-level-intgegration.com

ADD target/af40-portal-frontend*.jar /af40-portal-frontend.jar
RUN sh -c 'touch /af40-portal-frontend.jar'

EXPOSE 8080

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/af40-portal-frontend.jar"]
