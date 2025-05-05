# E-Commerce Platform (Backend API)

This is a backend-only E-Commerce application built using **Spring Boot**, **REST APIs**, and **MySQL**. The project enables core .
features like user management, product listing, cart handling, order processing, and smart recommendations using rule-based logic.

---

# Tech Stack

- **Java**
- **Spring Boot**
- **Spring MVC & REST**
- **JPA / Hibernate**
- **MySQL**
- **JSP / Thymeleaf** (if UI used)
- **Lombok**

---

# Features

-  User Registration & Login
-  Product CRUD (Add, View, Edit, Delete)
-  Cart Management
-  Order Placement
-  Payment Gateway Integration (stubbed/dummy for now)
-  Rule-Based AI Recommendation System (bonus)
-  REST API Structure (Controller, Service, Repository)

---

# Folder Structure

src/
└── main/
├── java/
│ └── com/yourname/ecommerce/
│ ├── controller/
│ ├── service/
│ ├── repository/
│ ├── model/
│ └── EcommerceApplication.java
└── resources/
├── application.properties
└── templates/ (if using JSP/Thymeleaf)


--------------------------------------------------------------

# Setup Instructions

1. **Clone the repo**:
   ```bash
   git clone https://github.com/Siddhant-S25/E-Commerce.git
   cd E-Commerce

2. Set up MySQL:

Create a DB called ecommerce_db

Update credentials in application.properties

3. Run the app:

Use Spring Tool Suite or:

mvn spring-boot:run
---------------------------------------------------------------
* Rule-Based Recommendation Logic (Example)
if (user.getPurchaseHistory().contains("SUV")) {
   recommend("Jeep Compass", "Tata Harrier");
}
---------------------------------------------------------------
# API Endpoints Overview

| Method | Endpoint         | Description            |
|--------|------------------|------------------------|
| GET    | /products        | View all products      |
| POST   | /users/register  | Register new user      |
| POST   | /cart/add        | Add to cart            |
| POST   | /orders/checkout | Place order            |
| GET    | /recommendations | Smart suggestions      |

# Author

**Siddhant Singh**  
GitHub: [@Siddhant-S25](https://github.com/Siddhant-S25)
---------------------------------------------------------------
# License

MIT License
This project is open-source and available under the MIT License.
