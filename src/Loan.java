package FarmerModule;

public class Loan {
    private String loanId;
    private String farmerId;
    private double amount;
    private String status;
    private String repaymentSchedule;

    public Loan(String loanId, String farmerId, double amount, String status, String repaymentSchedule) {
        this.loanId = loanId;
        this.farmerId = farmerId;
        this.amount = amount;
        this.status = status;
        this.repaymentSchedule = repaymentSchedule;
    }
}
