package CCP;

public class Guest {
    private String name; 
    private String addressDetails;  

    // Constructor (UML: create()) 
    private Guest(String name, String addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }
    
    public static Guest create(String name, String addressDetails) {
        return new Guest(name, addressDetails);
    }
}
