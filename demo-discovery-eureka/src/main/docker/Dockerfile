FROM java:8
VOLUME /tmp
ADD demo-discovery-eureka-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["nohup",""java","-jar","/app.jar","&"]