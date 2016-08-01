FROM anapsix/alpine-java:jre8

MAINTAINER sklose@next-level-intgegration.com

ADD target/AF40Tpl*.jar /AF40Tpl.jar
RUN sh -c 'touch /AF40Tpl.jar'

EXPOSE 8080

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/AF40Tpl.jar"]
