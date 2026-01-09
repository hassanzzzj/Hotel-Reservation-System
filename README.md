# 🏨 Hotel Reservation System

A desktop-based **Hotel Management System** built using **Java**, **Swing**, and **MySQL**. This application helps hotel staff manage room bookings, customer details, and room availability efficiently.

---

## 🚀 Features
* **User Login:** Secure login for admin/staff.
* **Add Rooms:** Capability to add new rooms with details (Price, Type, Cleaning Status).
* **Customer Registration:** Register new guests with their ID and contact info.
* **Check-In/Check-Out:** Manage guest arrivals and departures.
* **Room Management:** Update room status (Available/Occupied).
* **Database Integration:** Persistent storage using MySQL.

---

## 🛠️ Tech Stack
* **Language:** Java (JDK 8 or above)
* **GUI:** Java Swing & AWT
* **Database:** MySQL
* **Drivers:** MySQL Connector/J

---

## 📁 Project Structure
* `src/`: Contains all Java source files.
    * `Conn.java`: Database connection logic.
    * `Login.java`: Authentication screen.
    * `Dashboard.java`: Main navigation menu.
    * `AddRooms.java` / `CustomerInfo.java`: Management forms.
* `icons/`: Images used in the UI.

---

## ⚙️ Setup & Installation

### 1. Database Setup
1. Open MySQL and create a database named `hotelmanagementsystem`.
2. Run the SQL queries (provided in the project or create tables for `login`, `room`, `driver`, and `customer`).

### 2. Configure Connection
Open `src/Conn.java` and update your MySQL credentials:
```java
c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "YOUR_PASSWORD");