package FarmerModule;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Creating a farmer
        Farmer farmer = new Farmer(":F001", ":0712345678", ":Doc Juicy", new double[]{-1.2921, 36.8219}, 5);
        farmer.register();

        // Creating a collection request
        CollectionRequest request = new CollectionRequest("R001", "F001", 10, LocalDateTime.now(), "CP001");
        farmer.submitCollectionRequest(request);

        // Creating an AgroVet Service
        AgroVet agroVet = new AgroVet("AG001", "Deworming Service", 500.0, "Provides deworming for cows.");
        System.out.println("AgroVet Service: " + agroVet);

        // Creating a cooperative
        Cooperative coop = new Cooperative("C001", "Milk Farmers Coop", "BN123456");
        System.out.println("Cooperative Created: " + coop);
    }
}
