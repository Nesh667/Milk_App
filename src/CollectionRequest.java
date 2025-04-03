package FarmerModule;

import java.time.LocalDateTime;

public class CollectionRequest {
    private String requestId;
    private String farmerId;
    private int quantity;
    private LocalDateTime requestDateTime;
    private String status;
    private String collectionPointId;

    public CollectionRequest(String requestId, String farmerId, int quantity, LocalDateTime requestDateTime, String collectionPointId) {
        this.requestId = requestId;
        this.farmerId = farmerId;
        this.quantity = quantity;
        this.requestDateTime = requestDateTime;
        this.status = "PENDING";
        this.collectionPointId = collectionPointId;
    }

    public void submit() {
        System.out.println("Collection request " + requestId + " submitted for " + quantity + "L on " + requestDateTime);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Request " + requestId + " status updated to: " + status);
    }

    public void notifyFarmer(String phoneNum) {
        Notification notification = new Notification(
            "N" + requestId, farmerId, phoneNum,
            "Request " + requestId + " status: " + status, LocalDateTime.now()
        );
        notification.sendSMS();  // Could also use sendInApp()
    }

    public String getRequestId() { return requestId; }
    public String getFarmerId() { return farmerId; }
    public String getStatus() { return status; }
}
