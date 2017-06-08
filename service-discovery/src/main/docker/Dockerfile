FROM openjdk:8-jre
VOLUME /tmp
ADD micro-service-nutshell-service-discovery-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]