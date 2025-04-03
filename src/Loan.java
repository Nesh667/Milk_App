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

    // Getters
    public String getLoanId() {
        return loanId;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getRepaymentSchedule() {
        return repaymentSchedule;
    }

    // Setters
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRepaymentSchedule(String repaymentSchedule) {
        this.repaymentSchedule = repaymentSchedule;
    }
}
