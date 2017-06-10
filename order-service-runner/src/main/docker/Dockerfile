FROM openjdk:8-jre
VOLUME /tmp
ADD oms-order-service-runner-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]