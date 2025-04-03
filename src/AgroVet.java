package FarmerModule;

public class AgroVet {
    private String serviceId;
    private String name;
    private double cost;
    private String description;

    public AgroVet(String serviceId, String name, double cost, String description) {
        this.serviceId = serviceId;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    // Getters
    public String getServiceId() {
        return serviceId;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
