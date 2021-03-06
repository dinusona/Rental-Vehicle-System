public class Motorbike extends Vehicle {
    private int helmetNumber;
    private int jacketNumber;
    private int cylinderCapacity;

    public Motorbike(int plateNumber, String brand, String model, String condition, String transmissionType, int seatCapacity, int storageCapacity, String fuelType, double rateHour, int helmetNumber, int jacketNumber, int cylinderCapacity) {
        super(plateNumber, brand, model, condition, transmissionType, seatCapacity, storageCapacity, fuelType, rateHour);
        this.helmetNumber = helmetNumber;
        this.jacketNumber = jacketNumber;
        this.cylinderCapacity = cylinderCapacity;
    }





    public int getHelmetNumber() {
        return helmetNumber;
    }

    public void setHelmetNumber(int helmetNumber) {
        this.helmetNumber = helmetNumber;
    }

    public int getJacketNumber() {
        return jacketNumber;
    }

    public void setJacketNumber(int jacketNumber) {
        this.jacketNumber = jacketNumber;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }



    @Override
    public String toString() {
        return "Motorbike{" +
                "helmetNumber=" + helmetNumber +
                ", jacketNumber=" + jacketNumber +
                ", cylinderCapacity=" + cylinderCapacity +
                '}';
    }
}
