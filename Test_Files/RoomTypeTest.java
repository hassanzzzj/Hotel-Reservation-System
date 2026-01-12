public class RoomTypeTest {
    public static void main(String[] args) {
        // 1. Arrange
        RoomType type = RoomType.SUITE;

        // 2. Act
        String typeString = type.toString();

        // 3. Assert
        // Hum check kar rahe hain ke SUITE type exist karta hai aur uska naam sahi hai
        if (typeString.equalsIgnoreCase("SUITE")) {
            System.out.println("✅ RoomTypeTest Passed: Enum constant is correct!");
        } else {
            System.out.println("❌ RoomTypeTest Failed!");
        }
    }
}