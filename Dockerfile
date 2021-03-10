FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY target/hex-arch-demo-0.0.1-SNAPSHOT.jar hex-arch-demo.jar
ENTRYPOINT ["java","-jar","/hex-arch-demo.jar"]