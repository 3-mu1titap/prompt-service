
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/prompt-0.0.1-SNAPSHOT.jar prompt-service.jar

EXPOSE 9100

ENTRYPOINT ["java", "-jar", "prompt-service.jar"]

ENV TZ=Asia/Seoul