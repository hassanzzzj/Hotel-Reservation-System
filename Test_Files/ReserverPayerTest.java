public class ReserverPayerTest {
    public static void main(String[] args) {
        // 1. Arrange
        Guest guest = new Guest("Zain", "zain@test.com");
        String paymentMethod = "Credit Card";

        // 2. Act
        ReserverPayer payer = new ReserverPayer(guest, paymentMethod);

        // 3. Assert
        if (payer.getPaymentType().equals("Credit Card")) {
            System.out.println("✅ PayerTest Passed: Payment method is correct!");
        } else {
            System.out.println("❌ PayerTest Failed!");
        }
    }
}