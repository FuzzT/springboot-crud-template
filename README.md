# Spring Boot CRUD Template (Java 23) 🚀

This is a **Spring Boot CRUD** project template designed for rapid development and practice.  
It supports **Java 23** and is fully compatible with **GitHub Codespaces**, allowing you to build and run Spring Boot apps without local setup.

## Features
✅ Spring Boot (Java 23)  
✅ RESTful CRUD APIs  
✅ Spring Data JPA & MySQL  
✅ Pre-configured application.properties  
✅ Cloud database support (PlanetScale, Neon, etc.)  
✅ Ready to use in **GitHub Codespaces**  

## 🛠 Setup Instructions (GitHub Codespaces)
1. **Fork this repository** to your GitHub account.  
2. Click the **Code** button and select **Open with Codespaces**.  
3. Wait for the environment to set up.  
4. Run the application using:  
   ```sh
   ./mvnw spring-boot:run
The app will be available at:- http://localhost:8080

## 📌 API Endpoints  

| Method  | Endpoint       | Description        |
|---------|--------------|--------------------|
| GET     | `/items`      | Get all items      |
| GET     | `/items/{id}` | Get item by ID     |
| POST    | `/items`      | Create new item    |
| PUT     | `/items/{id}` | Update item by ID  |
| DELETE  | `/items/{id}` | Delete item by ID  |

---

## 📄 Environment Variables (For Cloud Databases)  

Edit `src/main/resources/application.properties` to use a cloud database:  

```properties
spring.datasource.url=jdbc:mysql://your-cloud-db-url:3306/yourdb
spring.datasource.username=your-username
spring.datasource.password=your-password
