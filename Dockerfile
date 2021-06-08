FROM index.docker.io/openjdk:15-jdk-alpine     
ADD target/hellotekton-0.0.1-SNAPSHOT.jar hellotekton.jar
ENTRYPOINT ["java", "-jar", "/hellotekton.jar"]     
EXPOSE 80 
