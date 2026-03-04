# 🚀 DevOps & AWS Motivational Quotes App

A lightweight Java-based HTTP server that serves an attractive DevOps & AWS motivational quotes webpage.

This project demonstrates:
- Core Java HTTP Server
- Docker containerization
- Static HTML serving
- Clean project structure

---

## 📁 Project Structure

```
quotes-app/
│
├── Dockerfile
├── quotes.html
└── src/
    └── Main.java
```

---

## 🛠️ Technologies Used

- Java 17
- Docker
- OpenJDK Alpine Image
- HTML & CSS

---

## 📌 How It Works

- The Java application creates a lightweight HTTP server on port **8000**.
- When a user accesses the root URL (`/`), the server serves the `quotes.html` file.
- The application is containerized using Docker for portability and consistency.

---

## 🐳 Docker Setup

### 1️⃣ Build Docker Image

```bash
docker build -t devops-quotes .
```

### 2️⃣ Run Docker Container

```bash
docker run -p 8000:8000 devops-quotes
```

### 3️⃣ Access Application

Open browser and visit:

```
http://localhost:8000
```

---

## 🌟 Features

- Attractive Glass UI design
- DevOps & AWS motivational quotes
- Lightweight HTTP server (no external frameworks)
- Fully Dockerized
- Interview-friendly project

---

## 💡 Future Enhancements

- Random quote generator
- REST API endpoint (`/api`)
- Dark/Light mode toggle
- Deployment on AWS EC2
- CI/CD integration

---

## 👨‍💻 Author

Vedant Tambe  
DevOps & AWS Enthusiast  
Cloud & DevOps Engineer
