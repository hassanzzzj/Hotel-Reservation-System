🏨 Hotel Reservation System - Project Documentation
📜 Project Overview
This project is a Complex Computing Problem (CCP) focused on developing a medium-sized Hotel Reservation System. The system is built by translating a detailed UML class diagram into high-quality Java code while adhering to strict software engineering standards.


🚀 Key Features & Implementation

UML Implementation: All classes, attributes, and methods (like makeReservation, checkInGuest) are implemented exactly as specified.


Clean Code: Follows industry standards with meaningful naming, focused methods, and zero code smells. 🧹



Defensive Programming: Includes robust input validation and exception handling to prevent illegal object states. 🛡️



Unit Testing: Comprehensive test suite using JUnit 5 with the AAA (Arrange-Act-Assert) pattern. ✅


🛠️ How to Build and Run the Project
Follow these steps to get the system running on your local machine:

Step 1: Clone the Repository 📂
Open your terminal or command prompt and run:

Bash

git clone https://github.com/hassanzzzj/Hotel-Reservation-System.git
Step 2: Open in IDE 💻
Open VS Code, IntelliJ IDEA, or Eclipse.

Import the project as a Java Project.

Ensure JDK 11 (or higher) is configured in your IDE settings.

Step 3: Add JUnit Library 🧪
Since the project uses unit tests, make sure JUnit 5 is added to your project's build path (usually handled automatically if it's a Maven/Gradle project).

Step 4: Run the Main Program ▶️
Locate the file containing the public static void main(String[] args) method (usually in Main.java).

Right-click the file and select Run.

The console will show object creation, room bookings, and system interactions.

Step 5: Execute Tests 🔍
Navigate to the Test folder.

Right-click and select "Run All Tests".

Ensure the "Test Results" panel shows all tests passed successfully.


📊 Report Content (Brief Explanations for Screenshots)
Jab aap report mein screenshots lagayein, to unke niche ye choti explanations likh sakte hain:


Main Method Screenshot: "This screenshot shows the entry point of the application where we initialize the HotelChain, create Hotel instances, and set up various Room types."


Execution Output Screenshot: "The console output demonstrates a successful use case: creating a customer, checking room availability, and finalizing a reservation."



Test Results Screenshot: "This confirms that all domain classes are verified against boundary conditions and invalid inputs, ensuring 100% functional correctness."
