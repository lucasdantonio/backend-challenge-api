FROM openjdk:8
EXPOSE 8080
ADD target/movie-challenge-api.jar movie-challenge-api.jar
ENTRYPOINT ["java", "-jar", "/movie-challenge-api.jar"]