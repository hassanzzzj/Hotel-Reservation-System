import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testRoomAvailabilityUpdate() {
        // 1. Arrange
        Room room = new Room(101, RoomType.SINGLE);
        boolean initialStatus = room.isAvailable(); // Maan lete hain default true hai

        // 2. Act
        room.setAvailable(false);

        // 3. Assert
        assertFalse(room.isAvailable(), "Room availability should be false after booking.");
    }
}