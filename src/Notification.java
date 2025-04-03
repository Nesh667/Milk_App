package FarmerModule;

import java.time.LocalDateTime;

public class Notification {
    private String notificationId;
    private String farmerId;
    private String message;
    private String phoneNum;
    private LocalDateTime timestamp;

    public Notification(String notificationId, String farmerId, String phoneNum, String message, LocalDateTime timestamp) {
        this.notificationId = notificationId;
        this.farmerId = farmerId;
        this.phoneNum = phoneNum;
        this.message = message;
        this.timestamp = timestamp;
    }
}
