import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    @Test
    public void testReservationCreation() {
        // 1. Arrange
        Guest guest = new Guest("Ali", "ali@example.com");
        Room room = new Room(202, RoomType.DOUBLE);
        
        // 2. Act
        Reservation reservation = new Reservation(guest, room, "2023-12-01", "2023-12-05");

        // 3. Assert
        assertNotNull(reservation, "Reservation object should not be null.");
        assertEquals("Ali", reservation.getGuest().getName(), "Guest name should match.");
        assertEquals(202, reservation.getRoom().getRoomNumber(), "Room number should match.");
    }
}