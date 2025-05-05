# Smart Canteen Management System - University of Vavuniya

This project is a **Smart Canteen Management System** built using **Spring Boot** and **MySQL**, designed for the University of Vavuniya to manage canteen operations efficiently across multiple locations on campus.

## 📌 Features

- Manage multiple **canteens** across the campus
- Maintain a master list of **food items** (name, price, weight)
- Define daily **menus** per canteen with selected food items
- Handle **student** and **employee** registrations
- Allow **students** to place food orders with multiple items
- Track **order history**, order dates, and quantities
- Assign **employees** to one or more canteens

---

## 🧱 Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**

---

## 🗂️ Project Structure
````
src/
└── main/
└── java/
└── com/backend/Backend/
├── model/
│ ├── Workshop.java
│ ├── Session.java
│ ├── Presenter.java
│ ├── Under_graduates.java
│ ├── Post_graduates.java
│ └── Person.java
└── resources/
└── application.properties
````

---

## 🧬 Entity Relationships Overview

- 🧑‍🎓 **Under_graduates** ↔️ (Many-to-Many) ↔️ **Session**
- 🎓 **Post_graduates** ↔️ (Many-to-Many) ↔️ **Session**
- 🎤 **Presenter** ↔️ (Many-to-Many) ↔️ **Session**
- 📅 **Session** → 🔗 Connected to `Workshop` via `workshop_id` (foreign key)

---

## ▶️ How to Run

```bash
# Run using Maven Wrapper
./mvnw spring-boot:run

# Or using Maven directly
mvn spring-boot:run
```

App runs at: [http://localhost:8080](http://localhost:8080)

---


## 👨‍💻 Author

Built with 💻 by **Dinuki Prarthana**  
🔗 GitHub: [@Dinuki](https://github.com/Dinuki85)

---

## 📝 License

This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

---
