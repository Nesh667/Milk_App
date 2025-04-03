package FarmerModule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Get basic farmer details from the user
        System.out.print("Enter Farmer Name: ");
        String farmerName = scanner.nextLine();

        System.out.print("Enter Farmer Phone Number: ");
        String phoneNum = scanner.nextLine();

        System.out.print("Enter Farmer Location: ");
        String location = scanner.nextLine();  // Farmer's location as a simple string

        System.out.print("Enter Cow Count: ");
        int cowCount = Integer.parseInt(scanner.nextLine());

        // Create the Farmer object
        Farmer farmer = new Farmer("", phoneNum, farmerName, new double[]{}, cowCount);
        farmer.register();

        // You can now work with the Farmer object (like submitting collection requests, etc.)

        scanner.close(); // Close the scanner object
    }
}
