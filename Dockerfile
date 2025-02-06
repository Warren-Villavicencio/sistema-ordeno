FROM openjdk:17-jdk-slim

WORKDIR /app

COPY pom.xml .
COPY .mvnw .
COPY mvnw .
COPY src ./src
COPY application.properties .

RUN chmod +x ./mvnw
RUN ./mvnw -B -DskipTests clean install

