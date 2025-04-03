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
}
