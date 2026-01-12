public class How_ManyTest {
    public static void main(String[] args) {
        // 1. Arrange
        Hotel hotel = new Hotel("City Center Hotel");
        hotel.addRoom(new Room(101, RoomType.SINGLE));
        hotel.addRoom(new Room(102, RoomType.DOUBLE));
        hotel.addRoom(new Room(103, RoomType.SUITE));

        // 2. Act
        int totalRooms = How_Many.countRooms(hotel);

        // 3. Assert
        if (totalRooms == 3) {
            System.out.println("✅ How_ManyTest Passed: Room counting logic is perfect!");
        } else {
            System.out.println("❌ How_ManyTest Failed: Expected 3, but got " + totalRooms);
        }
    }
}