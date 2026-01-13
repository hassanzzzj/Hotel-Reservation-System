# 🏨 Hotel Reservation System (CCP)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

## 📜 Project Overview
This project is a **Complex Computing Problem (CCP)** focused on developing a scalable Hotel Reservation System. The core objective is to translate a detailed **UML Class Diagram** into high-quality Java code, ensuring that all architectural relationships (Aggregation, Composition, and Association) are accurately represented.



---

## 🚀 Key Features
- **UML-to-Code Fidelity:** Precise implementation of classes like `Hotel_Chain`, `Room`, `Reservation`, and `ReserverPayer`.
- **Defensive Programming:** Robust validation logic to prevent illegal states (e.g., negative costs, null objects).
- **Unit Testing:** 100% verification of domain logic using **JUnit 5** and the **AAA (Arrange-Act-Assert)** pattern.
- **Relationship Management:** Handles complex interactions between guest occupancy, room types, and chain-level reservations.

---

## 📂 Project Structure
```text
Hotel-Reservation-System/
├── src/
│   ├── CCP/                 # Root Package
│   │   ├── Main.java        # Entry Point
│   │   ├── Hotel_Chain.java # Controller Class
│   │   ├── Hotel.java
│   │   ├── Room.java
│   │   ├── RoomType.java
│   │   ├── Reservation.java
│   │   ├── ReserverPayer.java
│   │   └── How_Many.java    # Value Object
├── tests/                   # JUnit Test Suite
│   └── ... (Test classes for each domain object)
└── README.md