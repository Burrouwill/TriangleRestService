FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/TriangleApi-0.0.1.jar triangleApi.jar
ENTRYPOINT ["java", "-jar", "/triangleApi.jar"]

