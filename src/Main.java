package FarmerModule;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Get farmer details from the user
        System.out.print("Enter Farmer ID: ");
        String farmerID = scanner.nextLine();
        
        System.out.print("Enter Farmer Phone Number: ");
        String phoneNum = scanner.nextLine();

        System.out.print("Enter Farmer Name: ");
        String farmerName = scanner.nextLine();

        System.out.print("Enter Farmer Location (latitude,longitude): ");
        String[] locationInput = scanner.nextLine().split(",");
        double latitude = Double.parseDouble(locationInput[0]);
        double longitude = Double.parseDouble(locationInput[1]);
        double[] geoLocation = new double[]{latitude, longitude};

        System.out.print("Enter Cow Count: ");
        int cowCount = Integer.parseInt(scanner.nextLine());

        // Create the Farmer object
        Farmer farmer = new Farmer(farmerID, phoneNum, farmerName, geoLocation, cowCount);
        farmer.register();

        // Get collection request details from the user
        System.out.print("Enter Collection Request ID: ");
        String requestId = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Collection Point ID: ");
        String collectionPointId = scanner.nextLine();

        // Create a CollectionRequest
        CollectionRequest request = new CollectionRequest(requestId, farmerID, quantity, LocalDateTime.now(), collectionPointId);
        farmer.submitCollectionRequest(request);

        // Get AgroVet details from the user
        System.out.print("Enter AgroVet Service ID: ");
        String serviceId = scanner.nextLine();

        System.out.print("Enter AgroVet Service Name: ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter AgroVet Service Cost: ");
        double cost = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter AgroVet Service Description: ");
        String description = scanner.nextLine();

        // Create AgroVet Service
        AgroVet agroVet = new AgroVet(serviceId, serviceName, cost, description);
        System.out.println("AgroVet Service: " + agroVet);

        // Get Cooperative details from the user
        System.out.print("Enter Cooperative ID: ");
        String coopId = scanner.nextLine();

        System.out.print("Enter Cooperative Name: ");
        String coopName = scanner.nextLine();

        System.out.print("Enter Cooperative Business Number: ");
        String businessNumber = scanner.nextLine();

        // Create Cooperative
        Cooperative coop = new Cooperative(coopId, coopName, businessNumber);
        System.out.println("Cooperative Created: " + coop);

        scanner.close(); // Close the scanner object
    }
}
