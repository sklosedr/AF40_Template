FROM anapsix/alpine-java:jre8

MAINTAINER sklose@next-level-intgegration.com

ADD target/app2*.jar /app2.jar
RUN sh -c 'touch /app2.jar'

EXPOSE 8081

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app2.jar"]
