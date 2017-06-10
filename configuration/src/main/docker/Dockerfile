FROM anapsix/alpine-java:8
VOLUME /tmp
ADD oms-configuration-1.0-SNAPSHOT.jar app.jar
ENV eurekaUri localhost
EXPOSE 8888
ENV JAVA_OPTS="-Dmicro.services.nutshell.eureka.uri=$eurekaUri:8761/eureka/"
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]