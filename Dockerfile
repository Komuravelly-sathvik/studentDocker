# Use OpenJDK as base image
FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file (replace 'your-app.jar' with your actual JAR name)
COPY target/fullStackProject-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
