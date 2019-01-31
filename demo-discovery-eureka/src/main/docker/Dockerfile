FROM java:8
VOLUME /tmp
ADD /home/sourcecode/springcloud/demo-discovery-eureka/target/demo-discovery-eureka-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["nohup",""java","-jar","/app.jar","&"]