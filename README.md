
# 🚗 MontadoraAPI_Java

This is a RESTful API developed in Java using Spring Boot. The application simulates a vehicle manufacturer system (*montadora*), allowing management of cars, models, brands, and other related entities.

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL or H2 (configurable)
- Maven
- Lombok
- Swagger / OpenAPI (for API documentation)

---

## 📦 Features

- CRUD operations for vehicle entities (e.g., brand, model, car)
- RESTful endpoints with JSON responses
- Validation and exception handling
- Database integration via JPA
- API documentation with Swagger

---

## ▶️ How to Run the Project

### Prerequisites

- Java 17+
- Maven
- (Optional) Docker and PostgreSQL

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/GiovanaGuedesSilva/MontadoraAPI_Java.git
   cd MontadoraAPI_Java
   ```

2. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

   Or with Docker (if configured):
   ```bash
   docker-compose up
   ```

3. Access the API at:
   ```
   http://localhost:8080
   ```

4. Access Swagger UI for testing:
   ```
   http://localhost:8080/swagger-ui.html
   ```

---

## 🗂️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.montadora/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── MontadoraApiApplication.java
│   └── resources/
│       ├── application.properties
│       └── schema.sql / data.sql (optional)
```

---

## 🧪 Tests

You can run tests with:

```bash
./mvnw test
```

> The project may include unit tests and integration tests (if implemented).

---

## 📄 License

This project is under the [MIT License](LICENSE) – feel free to use and modify it.

---

## 🙋‍♀️ Author

Developed by **Giovana Guedes**  
🔗 [GitHub Profile](https://github.com/GiovanaGuedesSilva)
