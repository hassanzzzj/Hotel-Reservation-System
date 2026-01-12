import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {

    @Test
    public void testAddRoomToHotel() {
        // 1. Arrange
        Hotel hotel = new Hotel("Serena Hotel");
        Room room = new Room(303, RoomType.SUITE);

        // 2. Act
        hotel.addRoom(room);

        // 3. Assert
        assertEquals(1, hotel.getRooms().size(), "Hotel should have 1 room after addition.");
        assertTrue(hotel.getRooms().contains(room), "Room list should contain the added room.");
    }
}