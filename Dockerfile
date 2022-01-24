FROM openjdk:8-jdk-alpine
MAINTAINER rajservices
VOLUME /tmp
EXPOSE 8000
ADD target/raj-config-service.jar raj-config-service.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /raj-config-service.jar" ]