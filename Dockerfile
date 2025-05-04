FROM openjdk:21
EXPOSE 8181
ENV JAR_FILE=target/user_service-*-SNAPSHOT.jar
COPY ${JAR_FILE} /user_service.jar
ENTRYPOINT ["java", "-jar", "/user_service.jar"]
