package FarmerModule;

import java.util.ArrayList;
import java.util.List;

public class Cooperative {
    private String cooperativeId;
    private String name;
    private String businessNumber;
    private List<Transaction> transactionReports;

    public Cooperative(String cooperativeId, String name, String businessNumber) {
        this.cooperativeId = cooperativeId;
        this.name = name;
        this.businessNumber = businessNumber;
        this.transactionReports = new ArrayList<>();
    }

    // Getters
    public String getCooperativeId() {
        return cooperativeId;
    }

    public String getName() {
        return name;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public List<Transaction> getTransactionReports() {
        return transactionReports;
    }

    // Setters
    public void setCooperativeId(String cooperativeId) {
        this.cooperativeId = cooperativeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public void setTransactionReports(List<Transaction> transactionReports) {
        this.transactionReports = transactionReports;
    }
}
