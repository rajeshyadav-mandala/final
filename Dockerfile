# Use the official OpenJDK 17 image from Docker Hub
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the compiled Spring Boot JAR file into the container
COPY target/Testing1-0.0.1-SNAPSHOT.jar /app/app.jar

# Copy the webapp directory to ensure JSP files are included
COPY src/main/webapp /app/src/main/webapp

# Expose the port the Spring Boot application will run on
EXPOSE 4041

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
