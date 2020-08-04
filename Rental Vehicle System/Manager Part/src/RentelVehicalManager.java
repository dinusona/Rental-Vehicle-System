public interface RentelVehicalManager {

    void deleteVehicle(String polatenumber, String type);


    public abstract void addNewCar(Car car);

    public abstract void addNewBike(Motorbike bike);

    public abstract void saveToFile();
}
