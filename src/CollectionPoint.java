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

    // Getters
    public String getPointId() {
        return pointId;
    }

    public String getName() {
        return name;
    }

    public double[] getGeoLocation() {
        return geoLocation;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public List<String> getAvailableCollectors() {
        return availableCollectors;
    }

    // Setters
    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeoLocation(double[] geoLocation) {
        this.geoLocation = geoLocation;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setAvailableCollectors(List<String> availableCollectors) {
        this.availableCollectors = availableCollectors;
    }
}
