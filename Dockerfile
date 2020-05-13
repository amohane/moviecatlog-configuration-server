FROM openjdk:8
EXPOSE 8888
ARG JAR_FILE=/target/*.jar
ADD ${JAR_FILE} moviecatlog-configuration-server.jar
ENTRYPOINT ["java","-jar","moviecatlog-configuration-server.jar"]