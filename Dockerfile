FROM eclipse-temurin:21
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8081
LABEL authors="SatvikHM"

ENTRYPOINT ["java", "-jar","app.jar"]