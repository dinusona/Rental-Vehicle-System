import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class WestminsterRentalVehicleManager implements RentelVehicalManager {

    final int MAXCOUNT = 1000;

    //create the method for add new car
    @Override
    public void addNewCar(Car car) {

        try {
            Connection conn = Controller.createConnection();

            String query = "insert into carDetails (plateNumber,carBrand,carModel,carCondition,carTransType,carSeatCapa,carStoragecCapa,carFuelType,carRatePHour,carDriverName) " + "values(?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1, car.getPlateNumber());
            preparedStatement.setString(2, car.getBrand());
            preparedStatement.setString(3, car.getModel());
            preparedStatement.setString(4, car.getCondition());
            preparedStatement.setString(5, car.getTransmissionType());
            preparedStatement.setInt(6, car.getSeatCapacity());
            preparedStatement.setInt(7, car.getStorageCapacity());
            preparedStatement.setString(8, car.getFuelType());
            preparedStatement.setDouble(9, car.getRateHour());
            preparedStatement.setString(10, car.getDriverName());

            preparedStatement.execute();
            conn.close();
            System.out.println("~ car added to DB ~");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("error" + e.getMessage());
        }
    }

    //create the method for add new bike
    @Override
    public void addNewBike(Motorbike bike) {

        try {
            Connection conn = Controller.createConnection();
            //13
            String query = "insert into bikeDetails (plateNumber,bikeBrand,bikeModel,bikeCondition,bikeTransType,bikeSeatCapa,bikeStoragecCapa,bikeFuelType,bikeRatePHour,helmetNumber,jacketNumber,cylinderCapacity) " + "values(?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = conn.prepareStatement(query);


            preparedStatement.setInt(1, bike.getPlateNumber());
            preparedStatement.setString(2, bike.getBrand());
            preparedStatement.setString(3, bike.getModel());
            preparedStatement.setString(4, bike.getCondition());
            preparedStatement.setString(5, bike.getTransmissionType());
            preparedStatement.setInt(6, bike.getSeatCapacity());
            preparedStatement.setInt(7, bike.getStorageCapacity());
            preparedStatement.setString(8, bike.getFuelType());
            preparedStatement.setDouble(9, bike.getRateHour());
            preparedStatement.setInt(10, bike.getHelmetNumber());
            preparedStatement.setInt(11, bike.getJacketNumber());
            preparedStatement.setInt(12, bike.getCylinderCapacity());

            preparedStatement.execute();
            conn.close();
            System.out.println("~ bike added to DB ~");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("error" + e.getMessage());
        }
    }

    //create the method for delete vehicel in db
    @Override
    public void deleteVehicle(String platenumber, String type) {
        if (type.equals("car")) {
            try {

                Connection conn = Controller.createConnection();

                // create the mysql delete statement.
                String query = "delete from carDetails where plateNumber = ?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, platenumber);

                preparedStmt.execute();

                conn.close();
                System.out.println("~ Car Delete from DB ~");

            } catch (Exception e) {
                err.println("Got an exception! ");
                err.println(e.getMessage());
            }
        } else {
            try {

                Connection conn = Controller.createConnection();

                // create the mysql delete statement.
                String query = "delete from bikeDetails where PlateNumber = ?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, platenumber);

                // execute the preparedstatement
                preparedStmt.execute();

                conn.close();
                System.out.println("~ Bike Delete from DB ~");

            } catch (Exception e) {
                err.println("Got an exception! ");
                err.println(e.getMessage());
            }
        }
    }


    //create the method for save the db as text file
    @Override
    public void saveToFile() {
        out.println("Car and Bike DB saved as Text file");


        try {
            String query3 = "SELECT * FROM carDetails";
            Connection conn = Controller.createConnection();
            Statement st = conn.createStatement();

            ResultSet result = st.executeQuery(query3);


            FileWriter writer = new FileWriter("CarDetails.txt", false);
            while (result.next()) {
                String fileString = "Plate Number:" + result.getInt("plateNumber")
                        + "  Car Brand:" + result.getString("carBrand")
                        + "  Car Model:" + result.getString("carModel")
                        + "  Car Condition:" + result.getString("carCondition")
                        + "  Car Transmission Type:" + result.getString("carTransType")
                        + "  Car Seat capacity:" + result.getInt("carSeatCapa")
                        + "  Car Storage capacity:" + result.getInt("carStoragecCapa")
                        + "  Car Fuel Type:" + result.getString("carFuelType")
                        + "  Car Rate per Hour:" + result.getDouble("carRatePHour")
                        + "  Car Driver Name:" + result.getString("carDriverName");
                writer.write(fileString);
                writer.write("\r\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            String query3 = "SELECT * FROM bikeDetails";
            Connection conn = Controller.createConnection();
            Statement st = conn.createStatement();

            ResultSet result = st.executeQuery(query3);


            FileWriter writer = new FileWriter("BikeDetails.txt", false);
            while (result.next()) {
                String fileString = "Plate Number:" + result.getInt("plateNumber")
                        + "  Bike Brand:" + result.getString("bikeBrand")
                        + "  Bike Model:" + result.getString("bikeModel")
                        + "  Bike Condition:" + result.getString("bikeCondition")
                        + "  Bike Transmission Type:" + result.getString("bikeTransType")
                        + "  Bike Seat capacity:" + result.getInt("bikeSeatCapa")
                        + "  Bike Storage capacity:" + result.getInt("bikeStoragecCapa")
                        + "  Bike Fuel Type:" + result.getString("bikeFuelType")
                        + "  Bike Rate per Hour:" + result.getDouble("bikeRatePHour")
                        + "  Helmet Number:" + result.getInt("helmetNumber")
                        + "  Jacket Number  :" + result.getInt("jacketNumber")
                        + "  Bike Cylinder capacity:" + result.getInt("cylinderCapacity");
                writer.write(fileString);
                writer.write("\r\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
