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

    // Getters
    public String getFarmerID() {
        return farmerID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }

    public double[] getGeoLocation() {
        return geoLocation;
    }

    public int getCowCount() {
        return cowCount;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    // Setters
    public void setFarmerID(String farmerID) {
        this.farmerID = farmerID;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeoLocation(double[] geoLocation) {
        this.geoLocation = geoLocation;
    }

    public void setCowCount(int cowCount) {
        this.cowCount = cowCount;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
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
