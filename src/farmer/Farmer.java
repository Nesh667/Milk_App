package FarmerModule;

import FarmerModule.CollectionRequest;
import FarmerModule.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    private String farmerID;
    private String phoneNum;
    private String Name;
    private double[] geoLocation;
    private int cowCount;
    private List<Transaction> transactionHistory;

    public Farmer(String farmerID,String phoneNum,String Name,double[] geoLocation,int cowCount){
        this.farmerID = farmerID;
        this.phoneNum = phoneNum;
        this.Name = Name;
        this.geoLocation = geoLocation;
        this.cowCount = cowCount;
        this.transactionHistory = new ArrayList<>();
    }
    public void register(){
        System.out.println("Farmer" +Name+ "registered successfully");
    }
    public void submitCollectionRequest(CollectionRequest){
        System.out.println("Collection request submitted:" + request.getRequestId());
    }
    public void checkTransactionHistory(){
        for(Transaction t:transactionHistory){
            System.out.println(t);
        }
    }

}
