FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-alpine-slim
COPY build/libs/kafka-kubernetes-project-0.0.1-SNAPSHOT.jar /app
CMD ["java", "-jar", "kafka-kubernetes-project-0.0.1-SNAPSHOT.jar"]