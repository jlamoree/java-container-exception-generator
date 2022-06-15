This project creates a container with a Java program that throws an exception and prints a stack trace to STDERR for the purpose of tuning multiline logging support in Fluent Bit when running in a Kubernetes cluster. 

The Dockerfile uses a Maven container ([maven:3.8.5-openjdk-11](https://hub.docker.com/_/maven?tab=tags&name=3.8.5-openjdk-11)) to build the JAR, and then prepares a container from OpenJDK 11 ([openjdk:11-jre-slim](https://hub.docker.com/_/openjdk?tab=tags&name=11-jre-slim)) to run the JAR, producing the desired exception output.  

The build is performed for amd64 and arm64 using buildx. See [docker-builder](https://github.com/jlamoree/docker-builder) for the setup of the local/remote builders.
```shell
docker buildx build --push \
  --platform=linux/amd64 --platform=linux/arm64/v8 \
  --tag jlamoree/java-container-exception-generator:testX \
  --tag jlamoree/java-container-exception-generator:latest \
  .
```
