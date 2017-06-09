FROM openjdk:8-jre
VOLUME /tmp
ADD micro-service-nutshell-configuration-1.0-SNAPSHOT.jar app.jar
ENV eurekaUri localhost
ENV JAVA_OPTS="-Dmicro.services.nutshell.eureka.uri=$eurekaUri:8761/eureka/"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]