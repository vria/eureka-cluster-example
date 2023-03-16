FROM openjdk:17-alpine
COPY ./target/eureka-server-0.0.1-SNAPSHOT.jar /usr/src/eureka/
WORKDIR /usr/src/eureka
EXPOSE 9001-9002
RUN apk --no-cache add curl
CMD ["java", "-jar", "-Dspring.profiles.active=cluster", "eureka-server-0.0.1-SNAPSHOT.jar"]
