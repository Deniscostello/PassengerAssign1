FROM openjdk:11
COPY target/PassengerAssign1-*jar /Passenger.jar
CMD ["java", "-jar", "/PassengerAssign1.jar"]