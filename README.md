# 🏨 Hotel Reservation System (OOP Logic)

A comprehensive **Object-Oriented Programming (OOP)** implementation of a Hotel Management System. This project is built using **Java** and focuses on the logical structure of managing hotel chains, room allocations, and guest bookings using in-memory data structures.

---

## 📖 Project Overview
Unlike typical database-driven apps, this project demonstrates how to structure complex real-world systems using Java classes and relationships. It manages everything from individual rooms to entire hotel chains.

---

## 🚀 Key Features
* **Hierarchical Management:** Manages multiple hotels under a single `Hotel_Chain`.
* **Room Classification:** Support for various `RoomTypes` (Single, Double, Suite, etc.).
* **Guest & Payer Tracking:** Separate logic for `Guest` details and the `ReserverPayer` responsible for billing.
* **Reservation System:** Core engine to link guests with specific rooms and dates.
* **Dynamic Capacity:** Uses Java Collections to handle data during the application lifecycle.

---

## 🛠️ Technical Deep Dive

### **OOP Principles Applied:**
* **Encapsulation:** Data is protected within classes like `Room` and `Guest`.
* **Abstraction:** Complex reservation logic is hidden behind simple method calls.
* **Association:** Strong relationships between `Hotel`, `Room`, and `Reservation` objects.

### **Class Breakdown:**
| Class File | Responsibility |
| :--- | :--- |
| `Hotel_Chain.java` | Acts as the parent container for multiple hotels. |
| `Hotel.java` | Contains room lists and hotel-specific metadata. |
| `Room.java` | Defines individual room attributes (Number, Status, Type). |
| `Guest.java` | Stores personal information of the visitors. |
| `Reservation.java` | The bridge that connects a Guest to a Room. |
| `ReserverPayer.java` | Handles the financial/booking entity details. |

---

## 📂 Project Structure
```text
Hotel-Reservation-System/
├── Guest.java
├── Hotel.java
├── Hotel_Chain.java
├── How_Many.java
├── Main.java          <-- Entry Point
├── Reservation.java
├── ReserverPayer.java
├── Room.java
└── RoomType.java
```
⚙️ How to Run
Clone the repository:



git clone [https://github.com/hassanzzzj/Hotel-Reservation-System.git](https://github.com/hassanzzzj/Hotel-Reservation-System.git)
Navigate to the folder:



cd Hotel-Reservation-System
Compile the Java files:

javac *.java
Run the application:



java Main

