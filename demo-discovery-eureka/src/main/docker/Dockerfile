FROM java:8
VOLUME /tmp
ADD demo-discovery-eureka-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-j
ar","/app.jar"]