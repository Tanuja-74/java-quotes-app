# Use OpenJDK 17 lightweight image
FROM alpine/java:22-jdk

# Set working directory
WORKDIR /app

# Copy source code
COPY src/ /app/

# Copy HTML file
COPY quotes.html /app/

# Compile Java file
RUN javac Main.java

# Expose port
EXPOSE 8000

# Run application
CMD ["java", "Main"]
