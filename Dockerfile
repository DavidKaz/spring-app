FROM maven:latest as builder
ADD . /src
WORKDIR /src/spring
RUN mvn package
# EXPORT /src/spring/target/simple-date-time-0.1.0.jar simple-date-time-0.1.0.jar

FROM openjdk:jre
RUN mkdir /app
CMD ["/usr/bin/java", "-jar", "/app/simple-date-time-0.1.0.jar"]
EXPOSE 8080
COPY --from=builder /src/spring/target/simple-date-time-0.1.0.jar /app/simple-date-time-0.1.0.jar
