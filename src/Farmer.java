package FarmerModule;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    private String farmerID;
    private String phoneNum;
    private String name;
    private double[] geoLocation;
    private int cowCount;
    private List<Transaction> transactionHistory;

    public Farmer(String farmerID, String phoneNum, String name, double[] geoLocation, int cowCount) {
        this.farmerID = farmerID;
        this.phoneNum = phoneNum;
        this.name = name;
        this.geoLocation = geoLocation;
        this.cowCount = cowCount;
        this.transactionHistory = new ArrayList<>();
    }

    public void register() {
        System.out.println("Farmer " + name + " registered successfully.");
    }

    public void submitCollectionRequest(CollectionRequest request) {
        System.out.println("Collection request submitted: " + request.getRequestId());
    }

    public void checkTransactionHistory() {
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}
