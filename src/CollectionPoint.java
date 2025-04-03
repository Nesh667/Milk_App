package FarmerModule;

import java.util.List;

public class CollectionPoint {
    private String pointId;
    private String name;
    private double[] geoLocation;
    private double currentPrice;
    private List<String> availableCollectors;

    public CollectionPoint(String pointId, String name, double[] geoLocation, double currentPrice, List<String> availableCollectors) {
        this.pointId = pointId;
        this.name = name;
        this.geoLocation = geoLocation;
        this.currentPrice = currentPrice;
        this.availableCollectors = availableCollectors;
    }
}
