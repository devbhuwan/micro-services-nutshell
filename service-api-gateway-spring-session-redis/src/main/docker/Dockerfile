FROM anapsix/alpine-java:8
VOLUME /tmp
ADD oms-service-api-gateway-spring-session-redis-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]