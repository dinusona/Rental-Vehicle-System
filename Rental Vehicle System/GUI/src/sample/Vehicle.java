package sample;

public class Vehicle {
    private int plateNumber;
    private String brand;
    private String model;
    private String condition;
    private String transmissionType;
    private int seatCapacity;
    private int storageCapacity;
    private String fuelType;
    private double rateHour;



    public Vehicle(int plateNumber, String brand, String model, String condition, String transmissionType, int seatCapacity, int storageCapacity, String fuelType, double rateHour) {
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.condition = condition;
        this.transmissionType = transmissionType;
        this.seatCapacity = seatCapacity;
        this.storageCapacity = storageCapacity;
        this.fuelType = fuelType;
        this.rateHour = rateHour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getRateHour() {
        return rateHour;
    }

    public void setRateHour(double rateHour) {
        this.rateHour = rateHour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", plateNumber=" + plateNumber +
                ", condition='" + condition + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", storageCapacity=" + storageCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", rateHour=" + rateHour +
                '}';
    }
}
