FROM openjdk:17.0.2
VOLUME /tmp
ADD time-series-wonderware-edge-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]