FROM openjdk:8
MAINTAINER tianchao
ADD ["target/jks.jar", "jks.jar"]
EXPOSE 8080
ENTRYPOINT ["java","-jar","jks.jar"]