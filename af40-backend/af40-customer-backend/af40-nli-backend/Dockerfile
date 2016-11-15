FROM anapsix/alpine-java:jre8

MAINTAINER sklose@next-level-intgegration.com

ADD target/af40-nli-backend*.jar /af40-nli-backend.jar
RUN sh -c 'touch /af40-nli-backend.jar'

EXPOSE 8081

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/af40-nli-backend.jar"]
