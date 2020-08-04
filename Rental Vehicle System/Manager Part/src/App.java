import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import static java.lang.System.*;

public class App {

    public static void main(String[] args) {
        out.println("Welcome to Basic Vehicle Rental System\n");
        runMenu();
    }

    public static void runMenu() {
        int choise1;
        do {
            out.println("\nTo Add a new Vehicle to press 1");
            out.println("To delete a Vehicle to press 2");
            out.println("To view list of Vehicle to press 3");
            out.println("To save database to press 4");
            out.println("To exit press 5");
            out.print("> ");
            Scanner s = new Scanner(System.in);
            choise1 = s.nextInt();

            switch (choise1) {
                case 1:
                    out.println("Press 1 if you want to add a Car");
                    out.println("Press 2 if you want to add a MotorBike");
                    int choise2 = s.nextInt();

                    switch (choise2) {
                        case 1:
                            out.println("enter Car Plate Number");
                            int inputCPNumber = s.nextInt();

                            System.out.println("enter Car Brand:");
                            String inputCBrand = s.next();

                            System.out.println("enter Car Model");
                            String inputCModel = s.next();

                            System.out.println("enter Car Condition");
                            String inputCCondition = s.next();

                            System.out.println("enter Car transmission type");
                            String inputCTransType = s.next();

                            out.println("enter Car Fuel Type");
                            String inputCFuelType = s.next();

                            out.println("enter Car Seat Capacity");
                            int inputCScapa = s.nextInt();

                            out.println("enter Car Storage Capacity");
                            int inputCStoCapa = s.nextInt();

                            out.println("enter Car Rate per hour");
                            double inputCRPerHour = s.nextDouble();

                            out.println("enter Car Driver Name");
                            String inputCDriverName = s.next();


                            Car vehicleCar = new Car(inputCPNumber, inputCBrand, inputCModel, inputCCondition, inputCTransType, inputCScapa, inputCStoCapa, inputCFuelType, inputCRPerHour, inputCDriverName);
                            WestminsterRentalVehicleManager manager1 = new WestminsterRentalVehicleManager();
                            manager1.addNewCar(vehicleCar);

                            break;
                        case 2:


                            out.println("enter Bike Plate Number:");
                            int inputBPlateNumber = s.nextInt();

                            out.println("enter Bike Brand:");
                            String inputBBrand = s.next();

                            out.println("enter Bike Model:");
                            String inputBBModel = s.next();

                            out.println("enter Bike Condition:");
                            String inputBCondition = s.next();

                            out.println("enter Bike Transmission Type:");
                            String inputBTransType = s.next();

                            out.println("enter Bike Seat Capacity");
                            int inputBScapa = s.nextInt();

                            out.println("enter Bike Storage Capacity");
                            int inputBStoCapa = s.nextInt();

                            out.println("enter Bike Fuel Type:");
                            String inputBFuelType = s.next();

                            out.println("enter Bike Rate Per Hour:");
                            double inputBRatePerH = s.nextDouble();

                            out.println("enter helmet Number");
                            int inputBHelmetNumber = s.nextInt();

                            out.println("enter jacket Number");
                            int inputBjacketNumber = s.nextInt();

                            out.println("enter cylinder Capacity");
                            int inputBCylinderCapa = s.nextInt();


                            out.println("----------");
                            out.println(inputBBrand);

                            Motorbike vehicleBike = new Motorbike(inputBPlateNumber, inputBBrand, inputBBModel, inputBCondition, inputBTransType, inputBScapa, inputBStoCapa, inputBFuelType, inputBRatePerH, inputBHelmetNumber, inputBjacketNumber, inputBCylinderCapa);
                            WestminsterRentalVehicleManager manager2 = new WestminsterRentalVehicleManager();
                            out.println("..........." + vehicleBike.getBrand());
                            manager2.addNewBike(vehicleBike);

                            break;

                    }
                    break;
                case 2:
                    out.println("Press 1 if you want to delete a Car");
                    out.println("Press 2 if you want to delete a MotorBike");
                    int choise3 = s.nextInt();
                    s.nextLine();

                    switch (choise3) {
                        case 1:

                            out.println("enter Car Plate Number you want to delete");
                            String carDelPlateNumber = s.nextLine();

                            WestminsterRentalVehicleManager wm = new WestminsterRentalVehicleManager();
                            wm.deleteVehicle(carDelPlateNumber, "car");

                            break;
                        case 2:

                            out.println("enter Bike Plate Number you want to delete");
                            String BikeDelPlateNumber = s.nextLine();

                            WestminsterRentalVehicleManager wm1 = new WestminsterRentalVehicleManager();
                            wm1.deleteVehicle(BikeDelPlateNumber, "bike");

                            break;
                    }

                    break;
                case 3:
                    out.println("Press 1 if you want to view Car table");
                    out.println("Press 2 if you want to view MotorBike table");
                    int choise4 = s.nextInt();
                    s.nextLine();

                    switch (choise4) {
                        case 1:
                            //view cars
                            try {
                                try {

                                    String query2 = "SELECT * FROM carDetails";
                                    Connection conn = Controller.createConnection();

                                    Statement st = conn.createStatement();


                                    ResultSet getFromDB1 = st.executeQuery(query2);
                                    System.out.println("Car Table : ");
                                    System.out.println("--------");
                                    while (getFromDB1.next()) {
                                        System.out.println("Car Plate Number : " + getFromDB1.getInt("plateNumber"));
                                        System.out.println("Car Brand : " + getFromDB1.getString("carBrand"));
                                        System.out.println("Car Model : " + getFromDB1.getString("carModel"));
                                        System.out.println("Car Condition : " + getFromDB1.getString("carCondition"));
                                        System.out.println("Car Transmission Type : " + getFromDB1.getString("carTransType"));
                                        System.out.println("Car Seat capacity : " + getFromDB1.getInt("carSeatCapa"));
                                        System.out.println("Car Storage capacity : " + getFromDB1.getInt("carStoragecCapa"));
                                        System.out.println("Car Fuel Type : " + getFromDB1.getString("carFuelType"));
                                        System.out.println("Car Rate per Hour : " + getFromDB1.getDouble("carRatePHour"));
                                        System.out.println("Car Driver Name  : " + getFromDB1.getString("carDriverName"));

                                        System.out.println("-----------");
                                    }

                                } catch (Exception e) {
                                    System.err.println("Got an exception!(wrong inputs)");
                                    System.err.println(e.getMessage());
                                }

                            } catch (Exception e) {
                                err.println("Got an exception! ");
                                err.println(e.getMessage());
                            }
                            break;
                        case 2:
                            //view motorBike
                            try {
                                try {

                                    String query2 = "SELECT * FROM bikeDetails";
                                    Connection conn = Controller.createConnection();

                                    Statement st = conn.createStatement();


                                    ResultSet getFromDB2 = st.executeQuery(query2);
                                    System.out.println("MotorBike Table : ");
                                    System.out.println("--------");
                                    while (getFromDB2.next()) {
                                        System.out.println("Bike Plate Number : " + getFromDB2.getInt("plateNumber"));
                                        System.out.println("Bike Brand : " + getFromDB2.getString("bikeBrand"));
                                        System.out.println("Bike Model : " + getFromDB2.getString("bikeModel"));
                                        System.out.println("Bike Condition : " + getFromDB2.getString("bikeCondition"));
                                        System.out.println("Bike Transmission Type : " + getFromDB2.getString("bikeTransType"));
                                        System.out.println("Bike Seat capacity : " + getFromDB2.getInt("bikeSeatCapa"));
                                        System.out.println("Bike Storage capacity : " + getFromDB2.getInt("bikeStoragecCapa"));
                                        System.out.println("Bike Fuel Type : " + getFromDB2.getString("bikeFuelType"));
                                        System.out.println("Bike Rate per Hour : " + getFromDB2.getDouble("bikeRatePHour"));
                                        System.out.println("Helmet Number : " + getFromDB2.getInt("helmetNumber"));
                                        System.out.println("Jacket Number  : " + getFromDB2.getInt("jacketNumber"));
                                        System.out.println("Bike Cylinder Capacity   : " + getFromDB2.getInt("cylinderCapacity"));

                                        System.out.println("-----------");
                                    }

                                } catch (Exception e) {
                                    System.err.println("Got an exception!(wrong inputs)");
                                    System.err.println(e.getMessage());
                                }

                            } catch (Exception e) {
                                err.println("Got an exception! ");
                                err.println(e.getMessage());
                            }


                            break;
                    }
                case 4:

                    WestminsterRentalVehicleManager wm2 = new WestminsterRentalVehicleManager();
                    wm2.saveToFile();

                    break;
                case 5:
                    out.println("you successfully exited ");
                    System.exit(0);
                    break;

            }

        } while (choise1 > 1 || choise1 < 4);
    }

}
