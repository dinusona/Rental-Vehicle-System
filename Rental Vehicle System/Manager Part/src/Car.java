public class Car extends Vehicle {
    private String driverName;


    public Car(int plateNumber, String brand, String model , String condition, String transmissionType, int seatCapacity, int storageCapacity, String fuelType, double rateHour, String driverName) {
        super(plateNumber,brand, model , condition, transmissionType, seatCapacity, storageCapacity, fuelType, rateHour);
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    @Override
    public String toString() {
        return "Car{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}
