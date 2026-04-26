# Financial Audit & Compliance Management System

## 🚀 Overview

A backend system developed using Spring Boot to automate financial audit workflows, including audit management, risk assessment, and compliance tracking. The application exposes RESTful APIs for efficient data handling and is designed following layered architecture principles.

---

## 🛠 Tech Stack

* **Backend:** Java, Spring Boot
* **Frameworks:** Spring Web, Spring Data JPA, Spring Security
* **Database:** H2 (development), PostgreSQL (planned)
* **Build Tool:** Maven

---

## 🔥 Features

* Create, update, and retrieve audit records
* Risk classification (LOW, MEDIUM, HIGH)
* RESTful API design for audit operations
* Layered architecture (Controller, Service, Repository)
* In-memory database integration for quick development

---

## 📌 API Endpoints

| Method | Endpoint | Description         |
| ------ | -------- | ------------------- |
| GET    | /audits  | Retrieve all audits |
| POST   | /audits  | Create a new audit  |

---

## ▶️ Getting Started

### Prerequisites

* Java 17+
* Maven

### Run the application

```bash
mvn spring-boot:run
```

### Access API

```
http://localhost:8080/audits
```

---

## 🧪 Sample Request

```json
{
  "title": "Financial Audit 2026",
  "description": "Compliance check",
  "riskLevel": "HIGH",
  "status": "OPEN"
}
```

---

## 📁 Project Structure

```
com.kopai.auditsystem
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── AuditSystemApplication.java
```

---

## 📈 Future Enhancements

* JWT-based authentication & authorization
* Role-based access control (Auditor, Client)
* PostgreSQL integration for production
* API documentation using Swagger
* React-based frontend dashboard

---

## 👨‍💻 Author

**Kopai Manna**
B.Tech CSE | Aspiring Software Engineer

---

## 📌 Note

This project is part of a learning initiative to build real-world enterprise backend systems aligned with industry practices.
