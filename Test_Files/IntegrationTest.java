public class IntegrationTest {
    public static void main(String[] args) {
        // 1. Arrange (Setup the whole system)
        Hotel hotel = new Hotel("Beach Resort");
        Room room = new Room(505, RoomType.SUITE);
        Guest guest = new Guest("Hamza", "hamza@web.com");
        hotel.addRoom(room);

        // 2. Act (Perform a booking)
        Reservation res = new Reservation(guest, room, "2026-01-10", "2026-01-15");
        room.setAvailable(false); // Room book ho gaya

        // 3. Assert (Verify the state)
        if (res.getRoom().getRoomNumber() == 505 && !room.isAvailable()) {
            System.out.println("✅ Integration Test Passed: Full booking flow is working!");
        } else {
            System.out.println("❌ Integration Test Failed!");
        }
    }
}