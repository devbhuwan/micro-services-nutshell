FROM anapsix/alpine-java:8
VOLUME /tmp
ADD oms-order-service-runner-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS="-Xms128m -Xmx512m"
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]