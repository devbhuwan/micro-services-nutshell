FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD micro-service-nutshell-service-discovery-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]