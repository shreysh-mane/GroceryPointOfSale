FROM openjdk:8
EXPOSE 8761
ADD target/spring-server.jar spring-server.jar
ENTRYPOINT ["java","-jar","/spring-server.jar"]