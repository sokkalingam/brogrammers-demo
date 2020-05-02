FROM maven:3.6.1-jdk-8-slim

WORKDIR /server
COPY src /server/src
COPY pom.xml /server

RUN mvn clean install -DskipTests
RUN mv ./target/*.jar ./target/app.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "./target/app.jar" ]