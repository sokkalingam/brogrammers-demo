FROM ubuntu:xenial-20200326

RUN apt-get update && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y maven

WORKDIR /usr/local/brocode

COPY src        ./src
COPY pom.xml    ./

RUN mvn clean install -DskipTests

RUN mv ./target/*.jar ./target/app.jar

ENTRYPOINT [ "java", "-jar", "./target/app.jar" ]