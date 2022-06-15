FROM maven:3.8.5-openjdk-11 as builder

WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim
ENV LANG en_US.UTF-8
COPY --from=builder /app/target/java-container-exception-generator-*.jar /java-container-exception-generator.jar
CMD ["java","-jar","/java-container-exception-generator.jar"]
