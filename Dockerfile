# Use an official OpenJDK runtime as the base image
FROM openjdk:17-oracle

# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR file from the target directory to the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot app runs on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]