FROM anapsix/alpine-java:8
VOLUME /tmp
ADD oms-service-api-gateway-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
EXPOSE 8484
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]