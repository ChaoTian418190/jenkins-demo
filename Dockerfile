FROM openjdk:8
ADD ["target/jks.jar", "jks.jar"]
EXPOSE 8080
ENTRYPOINT ["java","-jar","jks.jar"]