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

    // Getters
    public String getRequestId() {
        return requestId;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getRequestDateTime() {
        return requestDateTime;
    }

    public String getStatus() {
        return status;
    }

    public String getCollectionPointId() {
        return collectionPointId;
    }

    // Setters
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRequestDateTime(LocalDateTime requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCollectionPointId(String collectionPointId) {
        this.collectionPointId = collectionPointId;
    }
}
