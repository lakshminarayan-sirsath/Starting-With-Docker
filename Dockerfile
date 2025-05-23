#FROM ubuntu:latest
#LABEL authors="Admin"
#
#ENTRYPOINT ["top", "-b"]
FROM openjdk:21-jdk

WORKDIR /app

COPY target/docker-demo-0.0.1-SNAPSHOT.jar /app/demotest.jar

EXPOSE 8080

CMD ["java", "-jar", "demotest.jar"]