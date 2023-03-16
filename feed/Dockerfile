FROM openjdk:17-alpine
COPY ./target/feed-0.0.1-SNAPSHOT.jar /usr/src/feed/
WORKDIR /usr/src/feed
EXPOSE $PORT
CMD ["java", "-jar", "feed-0.0.1-SNAPSHOT.jar"]
