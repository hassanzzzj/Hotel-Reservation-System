public class HotelChainTest {
    public static void main(String[] args) {
        // 1. Arrange
        Hotel_Chain myChain = new Hotel_Chain("Luxstay Group");
        Hotel hotel1 = new Hotel("Grand Karachi");
        Hotel hotel2 = new Hotel("Continental Lahore");

        // 2. Act
        myChain.addHotel(hotel1);
        myChain.addHotel(hotel2);

        // 3. Assert
        int chainSize = myChain.getHotels().size();
        if (chainSize == 2) {
            System.out.println("✅ HotelChainTest Passed: Correct number of hotels added!");
        } else {
            System.out.println("❌ HotelChainTest Failed: Expected 2, got " + chainSize);
        }
    }
}