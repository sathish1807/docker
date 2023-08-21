FROM openjdk:17
EXPOSE 8098
ADD target/dockertest.jar dockertest.jar
ENTRYPOINT ["java","-jar","dockertest.jar"]
