# 🦜 Budgetee

A personal project for a finance tracking web application to manage income and expenses. 💰 

## 💻 Tech Stack 

* Backend: Java, Spring Boot, Thymeleaf
* Database: PostgreSQL
* Build Tool: Maven
* Frontend (WIP): TypeScript, React


## 🚀 Getting Started

### 📦 Prerequisites

- Java 17+
- Maven
- PostgreSQL
- Node.js

### 🔙 Backend Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/budgetee.git
   cd budgetee
   ```

2. **Configure your database:**
Create a PostgreSQL database and update the `backend/src/main/resources/application.properties` file:

    ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/budgetee_db
    spring.datasource.username=<YOUR_POSTGRESQL_USER_NAME>
    spring.datasource.password=<YOUR_POSTGRESQL_PASSWORD>
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Run the application:**

    ```bash
    ./mvnw clean
    ./mvnw spring-boot:run
    ```

4. **Access the app:**

Visit: http://localhost:8080/transactions

### 🔜 Frontend Setup

WIP

## Project structure

```
src/main/
├── java/com/tracker/budgetee
│   ├── controller
│   ├── model
│   ├── repository
│   └── service
├── resources/
│   ├── templates/
│   ├── static/
│   └── application.properties
```
