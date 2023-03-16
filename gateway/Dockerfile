FROM openjdk:17-alpine
COPY ./target/gateway-0.0.1-SNAPSHOT.jar /usr/src/feed/
WORKDIR /usr/src/feed
EXPOSE 9020
CMD ["java", "-jar", "gateway-0.0.1-SNAPSHOT.jar"]
