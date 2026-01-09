# 🏨 Hotel Reservation System (Java OOP with AAA Testing)

A structured **Object-Oriented Programming (OOP)** project that simulates a Hotel Management System. This repository focuses on clean code principles, class relationships, and robust testing using the **AAA (Arrange, Act, Assert)** methodology.

---

## 🚀 Key Features
* **Full Booking Lifecycle:** Manage hotels, rooms, and guest reservations.
* **OOP Architecture:** Uses Encapsulation, Enums, and Collections.
* **In-Memory Data:** Fast and efficient handling of data objects during runtime.
* **Testing Suite:** Comprehensive unit and integration tests for all core modules.

---

## 🛠️ Tech Stack & Methodology
* **Language:** Java (JDK 8+)
* **Testing Pattern:** AAA (Arrange, Act, Assert)
* **Data Structures:** Java Collections (ArrayList, Enums)

---

## 📁 File Structure
```text
Hotel-Reservation-System/
├── src/ (Core Logic)
│   ├── Guest.java, Hotel.java, Hotel_Chain.java
│   ├── Room.java, RoomType.java, Reservation.java
│   └── Main.java
├── tests/ (AAA Testing Suite)
│   ├── GuestTest.java, RoomTest.java
│   ├── HotelChainTest.java, ReserverPayerTest.java
│   ├── RoomTypeTest.java, How_ManyTest.java
│   └── IntegrationTest.java
└── README.md
```
🧪 Testing (AAA Methodology)
Har functionality ko test karne ke liye teen steps follow kiye gaye hain:

Arrange: Test ke liye environment aur objects tayyar karna.

Act: Specific functionality ko execute karna.

Assert: Result ko verify karna ke wo expected output ke mutabiq hai ya nahi.

How to Run Tests:
Apne terminal mein folder open karein.

Compile karein: javac *Test.java

Run karein: java IntegrationTest (Ya koi bhi specific test file)

⚙️ Setup & Execution
Clone the Repo:

Bash

git clone [https://github.com/hassanzzzj/Hotel-Reservation-System.git](https://github.com/hassanzzzj/Hotel-Reservation-System.git)
Compile Core Files:


javac Main.java
Run Application:


java Main
📊 Class Relationships
Hotel_Chain ➡️ contains multiple Hotels

Hotel ➡️ contains multiple Rooms

Reservation ➡️ links a Guest to a Room
