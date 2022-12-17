FROM openjdk:11
COPY target/*.jar assignment.jar
CMD ["java", "-jar", "/assignment.jar"]
