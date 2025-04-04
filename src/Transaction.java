package FarmerModule;

public class Transaction {
    private String transactionId;
    private String farmerID;
    private double quantity;
    private double price;
    private String date;
    private String paymentStatus;

    public Transaction(String transactionId, String farmerID, double quantity, double price, String date, String paymentStatus) {
        this.transactionId = transactionId;
        this.farmerID = farmerID;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.paymentStatus = paymentStatus;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public String getFarmerID() {
        return farmerID;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

