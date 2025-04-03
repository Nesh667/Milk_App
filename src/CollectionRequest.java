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

    public String getRequestId() {
        return requestId;
    }
}
