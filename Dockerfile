FROM maven:3.8.5-openjdk-17-slim AS build

COPY /src /app/src

COPY /pom.xml /app

RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip

FROM openjdk:17

LABEL key="core.ics"

WORKDIR /usr/src/app

COPY --from=build /app/target/*.jar credit.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "credit.jar"]