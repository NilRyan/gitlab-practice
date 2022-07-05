FROM openjdk:17.0.2-jdk-slim as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN chmod +x mvnw && ./mvnw install -DskipTests

FROM openjdk:17.0.2-jdk-slim
VOLUME /tmp
ARG BIG_FAT_JAR=/workspace/app/target/*.jar
COPY --from=build ${BIG_FAT_JAR} app.jar
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=default","/app.jar"]