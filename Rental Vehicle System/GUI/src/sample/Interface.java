package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;


import javafx.scene.control.Button;


import java.sql.*;
import java.time.LocalDate;

public class Interface extends Application {
//    public pickUpDate2 from =null;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Westminster Rental Vehicle Manager");

        //creat the main pane
        Pane rootforMain = new Pane();

        //create the label for show Name
        Label mainName = new Label("Westminster Rental Vehicle Manager");
        mainName.setId("mainLablecss");
        rootforMain.getChildren().add(mainName);
        mainName.setLayoutX(20);
        mainName.setLayoutY(120);


        //book a car button in main window
        Button bBikeButscn1 = new Button();
        bBikeButscn1.setId("bBikeButscn1css");
        bBikeButscn1.setText("Book a Car");
        bBikeButscn1.setLayoutX(80);
        bBikeButscn1.setLayoutY(220);
        rootforMain.getChildren().add(bBikeButscn1);


        //book a bike button in main window
        Button bCarButscn1 = new Button();
        bCarButscn1.setText("Book a Bike");
        bCarButscn1.setId("bCarButscn1css");
        bCarButscn1.setLayoutX(290);
        bCarButscn1.setLayoutY(220);
        rootforMain.getChildren().add(bCarButscn1);

        //view button in main window
        Button viewVehicleList = new Button();
        viewVehicleList.setText("View Vehicle Lists");
        viewVehicleList.setId("viewVehicleListcss");
        viewVehicleList.setLayoutX(160);
        viewVehicleList.setLayoutY(260);
        rootforMain.getChildren().add(viewVehicleList);

//------------------------------------------------------------------------------------------------------------------------------

//01 Book a Car

        Pane rootforBookCar = new Pane();
        Scene sceneforBookBike = new Scene(rootforBookCar, 450, 500);
        String cssFile3 = this.getClass().getResource("Style.css").toExternalForm();
        sceneforBookBike.getStylesheets().add(cssFile3);

        bBikeButscn1.setOnAction(e -> primaryStage.setScene(sceneforBookBike));


        Button bAddItem = new Button();
        bAddItem.setText("Check Availability");
        bAddItem.setId("bAddItemcss");
        bAddItem.setLayoutX(120);
        bAddItem.setLayoutY(460);
        rootforBookCar.getChildren().add(bAddItem);


        Button backBu1 = new Button();
        backBu1.setText("Back to Home");
        backBu1.setId("backBu1css");
        backBu1.setLayoutX(250);
        backBu1.setLayoutY(460);
        rootforBookCar.getChildren().add(backBu1);

        //label for show enter PichUp date
        Label labelForPickUp = new Label("Select Pick Up Date");
        labelForPickUp.setId("labelForPickUpcss");
        rootforBookCar.getChildren().add(labelForPickUp);
        labelForPickUp.setLayoutX(45);
        labelForPickUp.setLayoutY(75);

        //label for show drop off date
        Label labelForDropOff = new Label("Select Drop Off Date");
        labelForDropOff.setId("labelForDropOffcss");
        rootforBookCar.getChildren().add(labelForDropOff);
        labelForDropOff.setLayoutX(250);
        labelForDropOff.setLayoutY(75);


        DatePicker pickUpDate = new DatePicker();
        HBox hboxForPickUp = new HBox(pickUpDate);
        rootforBookCar.getChildren().add(hboxForPickUp);
        hboxForPickUp.setLayoutX(25);
        hboxForPickUp.setLayoutY(100);



        DatePicker dropOffDate = new DatePicker();
        HBox hboxForDrop = new HBox(dropOffDate);
        rootforBookCar.getChildren().add(hboxForDrop);
        hboxForDrop.setLayoutX(235);
        hboxForDrop.setLayoutY(100);




        //create lable for ask plate number
        Label askInputForPlateNumber = new Label("Enter the plate number to reserve ");
        askInputForPlateNumber.setId("askInputForPlateNumbercss");
        rootforBookCar.getChildren().add(askInputForPlateNumber);
        askInputForPlateNumber.setLayoutX(50);
        askInputForPlateNumber.setLayoutY(150);

        //create textboox for take plate number
        TextField textFieldPlateNumber = new TextField();
        textFieldPlateNumber.setLayoutX(80);
        textFieldPlateNumber.setLayoutY(180);
        rootforBookCar.getChildren().add(textFieldPlateNumber);

        //create the button for add this
        Button bAddResToDb = new Button();
        bAddResToDb.setText("Add");
        bAddResToDb.setId("addcss");
        bAddResToDb.setLayoutX(65);
        bAddResToDb.setLayoutY(460);
        rootforBookCar.getChildren().add(bAddResToDb);

//        bAddItem.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
////            public void handle(ActionEvent arg0) {
//
//                //convert int to string
//                int textFieldPlateNumber1 = Integer.parseInt(textFieldPlateNumber.getText());
//
//                try {
//                    Connection conn = Controller.createConnection();
//
//
//                        // the mysql insert statement
//                        String query = " insert into reservationDetails (plateNumber, pickUpDate, dropOffDate)"
//                                + " values (?, ?, ?)";
//
//                        // create the mysql insert preparedstatement
//                        PreparedStatement preparedStmt = conn.prepareStatement(query);
//                        preparedStmt.setInt(1, textFieldPlateNumber1);
//                        preparedStmt.setDate(2, Date.valueOf(pickUpDate2));
//                        preparedStmt.setDate(3, Date.valueOf(dropOffDate2));
//
//                        System.out.println("DATA ENTERED");
//
//                        //execute the preparedstatement
//                        preparedStmt.execute();
//
//
//                    conn.close();
//                } catch (Exception e) {
//                    System.err.println("Got an exception!");
//                    System.err.println(e.getMessage());
//                }
//
//
//
//
//            }
//        });


        //------------------------------------------------------------------------------------------------------------------------------


//02 Book a Bike
        Pane rootforBookBike = new Pane();
        Scene sceneforBookCar = new Scene(rootforBookBike, 450, 500);
        String cssFile2 = this.getClass().getResource("Style.css").toExternalForm();
        sceneforBookCar.getStylesheets().add(cssFile2);

        bCarButscn1.setOnAction(e -> primaryStage.setScene(sceneforBookCar));


        Button bDeleteItem = new Button();
        bDeleteItem.setText("Check Availability");
        bDeleteItem.setId("bDeleteItemcss");
        bDeleteItem.setLayoutX(120);
        bDeleteItem.setLayoutY(460);
        rootforBookBike.getChildren().add(bDeleteItem);

        Button backBu2 = new Button();
        backBu2.setText("Back to Home");
        backBu2.setId("backBu2css");
        backBu2.setLayoutY(460);
        backBu2.setLayoutX(250);
        rootforBookBike.getChildren().add(backBu2);
//        backBu2.setOnAction(e -> primaryStage.setScene(scene2));

//label for show enter PichUp date
        Label labelForBikePickUp = new Label("Select Pick Up Date");
        labelForBikePickUp.setId("labelForBikePickUpcss");
        rootforBookBike.getChildren().add(labelForBikePickUp);
        labelForBikePickUp.setLayoutX(45);
        labelForBikePickUp.setLayoutY(75);

        //label for show drop off date
        Label labelForBikeDropOff = new Label("Select Drop Off Date");
        labelForBikeDropOff.setId("labelForBikeDropOffcss");
        rootforBookBike.getChildren().add(labelForBikeDropOff);
        labelForBikeDropOff.setLayoutX(250);
        labelForBikeDropOff.setLayoutY(75);

        DatePicker bikePickUpDate = new DatePicker();
        HBox hboxForBikePickUp = new HBox(bikePickUpDate);
        rootforBookBike.getChildren().add(hboxForBikePickUp);
        hboxForBikePickUp.setLayoutX(25);
        hboxForBikePickUp.setLayoutY(100);

        DatePicker bikeDropOffDate = new DatePicker();
        HBox hboxForBikeDrop = new HBox(bikeDropOffDate);
        rootforBookBike.getChildren().add(hboxForBikeDrop);
        hboxForBikeDrop.setLayoutX(235);
        hboxForBikeDrop.setLayoutY(100);

        //create lable for ask plate number
        Label askInputForBikePlateNumber = new Label("Enter the plate number to reserve ");
        askInputForBikePlateNumber.setId("askInputForBikePlateNumbercss");
        rootforBookBike.getChildren().add(askInputForBikePlateNumber);
        askInputForBikePlateNumber.setLayoutX(50);
        askInputForBikePlateNumber.setLayoutY(150);

        //create textboox for take plate number
        TextField textFieldBikePlateNumber = new TextField();
        textFieldBikePlateNumber.setLayoutX(80);
        textFieldBikePlateNumber.setLayoutY(180);
        rootforBookBike.getChildren().add(textFieldBikePlateNumber);

        //create the button for add this
        Button bAddBikeResToDb = new Button();
        bAddBikeResToDb.setText("Add");
        bAddBikeResToDb.setId("bAddBikeResToDbcss");
        bAddBikeResToDb.setLayoutX(65);
        bAddBikeResToDb.setLayoutY(460);
        rootforBookBike.getChildren().add(bAddBikeResToDb);


//------------------------------------------------------------------------------------------------------------------------------


//03 VIEW table

        Pane rootViewTable = new Pane();
        rootViewTable.setId("rootViewTablecss");
        Scene sceneforViewTable = new Scene(rootViewTable, 1275, 600);
        String cssFile4 = this.getClass().getResource("Style.css").toExternalForm();
        rootViewTable.getStylesheets().add(cssFile4);


        viewVehicleList.setOnAction(e -> primaryStage.setScene(sceneforViewTable));

        //Car table
        TableView carTableView = new TableView();
        carTableView.setMaxWidth(600);
        carTableView.setMaxHeight(900);
        carTableView.setLayoutX(30);
        carTableView.setLayoutY(30);

        TableColumn<String, Car> column1 = new TableColumn<>("plateNumber");
        column1.setMinWidth(50);
        column1.setCellValueFactory(new PropertyValueFactory<>("plateNumber"));


        TableColumn<String, Car> column2 = new TableColumn<>("carBrand");
        column2.setMinWidth(50);
        column2.setCellValueFactory(new PropertyValueFactory<>("labelForPickUp"));


        TableColumn<String, Car> column3 = new TableColumn<>("carModel");
        column3.setMinWidth(50);
        column3.setCellValueFactory(new PropertyValueFactory<>("model"));


        TableColumn<String, Car> column4 = new TableColumn<>("carCondition");
        column4.setMinWidth(50);
        column4.setCellValueFactory(new PropertyValueFactory<>("condition"));


        TableColumn<String, Car> column5 = new TableColumn<>("carTransType");
        column5.setMinWidth(50);
        column5.setCellValueFactory(new PropertyValueFactory<>("transmissionType"));


        TableColumn<String, Car> column6 = new TableColumn<>("carSeatCapa");
        column6.setMinWidth(50);
        column6.setCellValueFactory(new PropertyValueFactory<>("seatCapacity"));


        TableColumn<String, Car> column7 = new TableColumn<>("carStoragecCapa");
        column7.setMinWidth(50);
        column7.setCellValueFactory(new PropertyValueFactory<>("storageCapacity"));


        TableColumn<String, Car> column8 = new TableColumn<>("carFuelType");
        column8.setMinWidth(50);
        column8.setCellValueFactory(new PropertyValueFactory<>("fuelType"));


        TableColumn<String, Car> column9 = new TableColumn<>("carRatePHour");
        column9.setMinWidth(50);
        column9.setCellValueFactory(new PropertyValueFactory<>("rateHour"));


        TableColumn<String, Car> column10 = new TableColumn<>("carDriverName");
        column10.setMinWidth(50);
        column10.setCellValueFactory(new PropertyValueFactory<>("driverName"));

        carTableView.getColumns().add(column1);
        carTableView.getColumns().add(column2);
        carTableView.getColumns().add(column3);
        carTableView.getColumns().add(column4);
        carTableView.getColumns().add(column5);
        carTableView.getColumns().add(column6);
        carTableView.getColumns().add(column7);
        carTableView.getColumns().add(column8);
        carTableView.getColumns().add(column9);
        carTableView.getColumns().add(column10);

        Connection conn = Controller.createConnection();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM carDetails");

        while (rs.next()) {
            carTableView.getItems().add(new Car(rs.getInt("plateNumber"),
                    rs.getString("carBrand"),
                    rs.getString("carModel"),
                    rs.getString("carCondition"),
                    rs.getString("carTransType"),
                    rs.getInt("carSeatCapa"),
                    rs.getInt("carStoragecCapa"),
                    rs.getString("carFuelType"),
                    rs.getDouble("carRatePHour"),
                    rs.getString("carDriverName")));
        }
        rootViewTable.getChildren().add(carTableView);

        //------------------------------------------------------------------------------------------------------------------------------

        //bike table

        TableView bikeTableView = new TableView();
        bikeTableView.setMaxWidth(600);
        bikeTableView.setMaxHeight(900);
        bikeTableView.setLayoutX(650);
        bikeTableView.setLayoutY(30);

        TableColumn<String, Motorbike> column01 = new TableColumn<>("plateNumber");
        column01.setMinWidth(50);
        column01.setCellValueFactory(new PropertyValueFactory<>("plateNumber"));


        TableColumn<String, Motorbike> column02 = new TableColumn<>("bikeBrand");
        column02.setMinWidth(50);
        column02.setCellValueFactory(new PropertyValueFactory<>("labelForPickUp"));


        TableColumn<String, Motorbike> column03 = new TableColumn<>("bikeModel");
        column03.setMinWidth(50);
        column03.setCellValueFactory(new PropertyValueFactory<>("model"));


        TableColumn<String, Motorbike> column04 = new TableColumn<>("bikeCondition");
        column04.setMinWidth(50);
        column04.setCellValueFactory(new PropertyValueFactory<>("condition"));


        TableColumn<String, Motorbike> column05 = new TableColumn<>("bikeTransType");
        column05.setMinWidth(50);
        column05.setCellValueFactory(new PropertyValueFactory<>("transmissionType"));


        TableColumn<String, Motorbike> column06 = new TableColumn<>("bikeSeatCapa");
        column06.setMinWidth(50);
        column06.setCellValueFactory(new PropertyValueFactory<>("seatCapacity"));


        TableColumn<String, Motorbike> column07 = new TableColumn<>("bikeStoragecCapa");
        column07.setMinWidth(50);
        column07.setCellValueFactory(new PropertyValueFactory<>("storageCapacity"));


        TableColumn<String, Motorbike> column08 = new TableColumn<>("bikeFuelType");
        column08.setMinWidth(50);
        column08.setCellValueFactory(new PropertyValueFactory<>("fuelType"));


        TableColumn<String, Motorbike> column09 = new TableColumn<>("bikeRatePHour");
        column09.setMinWidth(50);
        column09.setCellValueFactory(new PropertyValueFactory<>("rateHour"));


        TableColumn<String, Motorbike> column010 = new TableColumn<>("helmetNumber");
        column010.setMinWidth(50);
        column010.setCellValueFactory(new PropertyValueFactory<>("helmetNumber"));


        TableColumn<String, Motorbike> column011 = new TableColumn<>("jacketNumber");
        column011.setMinWidth(50);
        column011.setCellValueFactory(new PropertyValueFactory<>("jacketNumber"));


        TableColumn<String, Motorbike> column012 = new TableColumn<>("cylinderCapacity");
        column012.setMinWidth(50);
        column012.setCellValueFactory(new PropertyValueFactory<>("cylinderCapacity"));


        bikeTableView.getColumns().add(column01);
        bikeTableView.getColumns().add(column02);
        bikeTableView.getColumns().add(column03);
        bikeTableView.getColumns().add(column04);
        bikeTableView.getColumns().add(column05);
        bikeTableView.getColumns().add(column06);
        bikeTableView.getColumns().add(column07);
        bikeTableView.getColumns().add(column08);
        bikeTableView.getColumns().add(column9);
        bikeTableView.getColumns().add(column010);
        bikeTableView.getColumns().add(column011);
        bikeTableView.getColumns().add(column012);

        ResultSet rs1 = conn.createStatement().executeQuery("SELECT * FROM bikeDetails");

        while (rs1.next()) {
            bikeTableView.getItems().add(new Motorbike(rs1.getInt("plateNumber"),
                    rs1.getString("bikeBrand"),
                    rs1.getString("bikeModel"),
                    rs1.getString("bikeCondition"),
                    rs1.getString("bikeTransType"),
                    rs1.getInt("bikeSeatCapa"),
                    rs1.getInt("bikeStoragecCapa"),
                    rs1.getString("bikeFuelType"),
                    rs1.getDouble("bikeRatePHour"),
                    rs1.getInt("helmetNumber"),
                    rs1.getInt("jacketNumber"),
                    rs1.getInt("cylinderCapacity")));
        }
        rootViewTable.getChildren().add(bikeTableView);

        // ------------------------------------------------------------------------------------------------------------------------------

        //filtering acording one thing

        Label askInputForChoose = new Label("Enter car or bike:");
        rootViewTable.getChildren().add(askInputForChoose);
        askInputForChoose.setLayoutX(50);
        askInputForChoose.setLayoutY(450);

        TextField textFieldforChoose = new TextField();
        textFieldforChoose.setLayoutX(200);
        textFieldforChoose.setLayoutY(450);
        rootViewTable.getChildren().add(textFieldforChoose);

        Label askInputForModel = new Label("Enter Condition:");
        rootViewTable.getChildren().add(askInputForModel);
        askInputForModel.setLayoutX(50);
        askInputForModel.setLayoutY(500);

        TextField textFieldModel = new TextField();
        textFieldModel.setLayoutX(200);
        textFieldModel.setLayoutY(500);
        rootViewTable.getChildren().add(textFieldModel);



        Button bView = new Button();
        bView.setText("View");
        bView.setId("bViewcss");
        bView.setLayoutX(120);
        bView.setLayoutY(550);
        rootViewTable.getChildren().add(bView);


        Button backBu3 = new Button();
        backBu3.setText("Back to Home");
        backBu3.setId("backBu3css");
        backBu3.setLayoutX(200);
        backBu3.setLayoutY(550);
        rootViewTable.getChildren().add(backBu3);

        Pane rootFilterBikeTable = new Pane();
        Scene sceneforFilterBikeTable = new Scene(rootFilterBikeTable, 1275, 600);

        Pane rootFilterCarTable = new Pane();
        Scene sceneforCarFilterTable = new Scene(rootFilterCarTable, 1275, 600);


        bView.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                String textFieldforChoose1 = (textFieldforChoose.getText());
                String textFieldModel1 = (textFieldModel.getText());

                if (textFieldforChoose1.equals("car")) {


                    bView.setOnAction(e -> primaryStage.setScene(sceneforCarFilterTable));


                    TableView carFilterTableView = new TableView();
                    carFilterTableView.setMaxWidth(600);
                    carFilterTableView.setMaxHeight(900);
                    carFilterTableView.setLayoutX(30);
                    carFilterTableView.setLayoutY(30);

                    TableColumn<String, Car> column1 = new TableColumn<>("plateNumber");
                    column1.setMinWidth(50);
                    column1.setCellValueFactory(new PropertyValueFactory<>("plateNumber"));


                    TableColumn<String, Car> column2 = new TableColumn<>("carBrand");
                    column2.setMinWidth(50);
                    column2.setCellValueFactory(new PropertyValueFactory<>("labelForPickUp"));


                    TableColumn<String, Car> column3 = new TableColumn<>("carModel");
                    column3.setMinWidth(50);
                    column3.setCellValueFactory(new PropertyValueFactory<>("model"));


                    TableColumn<String, Car> column4 = new TableColumn<>("carCondition");
                    column4.setMinWidth(50);
                    column4.setCellValueFactory(new PropertyValueFactory<>("condition"));


                    TableColumn<String, Car> column5 = new TableColumn<>("carTransType");
                    column5.setMinWidth(50);
                    column5.setCellValueFactory(new PropertyValueFactory<>("transmissionType"));


                    TableColumn<String, Car> column6 = new TableColumn<>("carSeatCapa");
                    column6.setMinWidth(50);
                    column6.setCellValueFactory(new PropertyValueFactory<>("seatCapacity"));


                    TableColumn<String, Car> column7 = new TableColumn<>("carStoragecCapa");
                    column7.setMinWidth(50);
                    column7.setCellValueFactory(new PropertyValueFactory<>("storageCapacity"));


                    TableColumn<String, Car> column8 = new TableColumn<>("carFuelType");
                    column8.setMinWidth(50);
                    column8.setCellValueFactory(new PropertyValueFactory<>("fuelType"));


                    TableColumn<String, Car> column9 = new TableColumn<>("carRatePHour");
                    column9.setMinWidth(50);
                    column9.setCellValueFactory(new PropertyValueFactory<>("rateHour"));


                    carFilterTableView.getColumns().add(column1);
                    carFilterTableView.getColumns().add(column2);
                    carFilterTableView.getColumns().add(column3);
                    carFilterTableView.getColumns().add(column4);
                    carFilterTableView.getColumns().add(column5);
                    carFilterTableView.getColumns().add(column6);
                    carFilterTableView.getColumns().add(column7);
                    carFilterTableView.getColumns().add(column8);
                    carFilterTableView.getColumns().add(column9);

                    Connection conn = null;
                    try {
                        conn = Controller.createConnection();
                        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM carDetails WHERE  carCondition = '" + textFieldModel1 + "' ");

                        while (rs.next()) {
                            carFilterTableView.getItems().add(new Car(rs.getInt("plateNumber"),
                                    rs.getString("carBrand"),
                                    rs.getString("carModel"),
                                    rs.getString("carCondition"),
                                    rs.getString("carTransType"),
                                    rs.getInt("carSeatCapa"),
                                    rs.getInt("carStoragecCapa"),
                                    rs.getString("carFuelType"),
                                    rs.getDouble("carRatePHour"),
                                    rs.getString("carDriverName")));
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rootFilterCarTable.getChildren().add(carFilterTableView);


                } else if (textFieldforChoose1.equals("bike")) {

                    bView.setOnAction(e -> primaryStage.setScene(sceneforFilterBikeTable));

                    TableView bikeFilterTableView = new TableView();
                    bikeFilterTableView.setMaxWidth(600);
                    bikeFilterTableView.setMaxHeight(900);
                    bikeFilterTableView.setLayoutX(30);
                    bikeFilterTableView.setLayoutY(30);

                    TableColumn<String, Motorbike> column01 = new TableColumn<>("plateNumber");
                    column01.setMinWidth(50);
                    column01.setCellValueFactory(new PropertyValueFactory<>("plateNumber"));


                    TableColumn<String, Motorbike> column02 = new TableColumn<>("bikeBrand");
                    column02.setMinWidth(50);
                    column02.setCellValueFactory(new PropertyValueFactory<>("labelForPickUp"));


                    TableColumn<String, Motorbike> column03 = new TableColumn<>("bikeModel");
                    column03.setMinWidth(50);
                    column03.setCellValueFactory(new PropertyValueFactory<>("model"));


                    TableColumn<String, Motorbike> column04 = new TableColumn<>("bikeCondition");
                    column04.setMinWidth(50);
                    column04.setCellValueFactory(new PropertyValueFactory<>("condition"));


                    TableColumn<String, Motorbike> column05 = new TableColumn<>("bikeTransType");
                    column05.setMinWidth(50);
                    column05.setCellValueFactory(new PropertyValueFactory<>("transmissionType"));


                    TableColumn<String, Motorbike> column06 = new TableColumn<>("bikeSeatCapa");
                    column06.setMinWidth(50);
                    column06.setCellValueFactory(new PropertyValueFactory<>("seatCapacity"));


                    TableColumn<String, Motorbike> column07 = new TableColumn<>("bikeStoragecCapa");
                    column07.setMinWidth(50);
                    column07.setCellValueFactory(new PropertyValueFactory<>("storageCapacity"));


                    TableColumn<String, Motorbike> column08 = new TableColumn<>("bikeFuelType");
                    column08.setMinWidth(50);
                    column08.setCellValueFactory(new PropertyValueFactory<>("fuelType"));


                    TableColumn<String, Motorbike> column09 = new TableColumn<>("bikeRatePHour");
                    column09.setMinWidth(50);
                    column09.setCellValueFactory(new PropertyValueFactory<>("rateHour"));


                    TableColumn<String, Motorbike> column010 = new TableColumn<>("helmetNumber");
                    column010.setMinWidth(50);
                    column010.setCellValueFactory(new PropertyValueFactory<>("helmetNumber"));


                    TableColumn<String, Motorbike> column011 = new TableColumn<>("jacketNumber");
                    column011.setMinWidth(50);
                    column011.setCellValueFactory(new PropertyValueFactory<>("jacketNumber"));


                    TableColumn<String, Motorbike> column012 = new TableColumn<>("cylinderCapacity");
                    column012.setMinWidth(50);
                    column012.setCellValueFactory(new PropertyValueFactory<>("cylinderCapacity"));


                    bikeFilterTableView.getColumns().add(column01);
                    bikeFilterTableView.getColumns().add(column02);
                    bikeFilterTableView.getColumns().add(column03);
                    bikeFilterTableView.getColumns().add(column04);
                    bikeFilterTableView.getColumns().add(column05);
                    bikeFilterTableView.getColumns().add(column06);
                    bikeFilterTableView.getColumns().add(column07);
                    bikeFilterTableView.getColumns().add(column08);
                    bikeFilterTableView.getColumns().add(column09);
                    bikeFilterTableView.getColumns().add(column010);
                    bikeFilterTableView.getColumns().add(column011);
                    bikeFilterTableView.getColumns().add(column012);


                    Connection conn = null;
                    try {
                        conn = Controller.createConnection();
                        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM bikeDetails WHERE  bikeCondition = '" + textFieldModel1 + "' ");

                        while (rs.next()) {
                            bikeFilterTableView.getItems().add(new Motorbike(rs1.getInt("plateNumber"),
                                    rs1.getString("bikeBrand"),
                                    rs1.getString("bikeModel"),
                                    rs1.getString("bikeCondition"),
                                    rs1.getString("bikeTransType"),
                                    rs1.getInt("bikeSeatCapa"),
                                    rs1.getInt("bikeStoragecCapa"),
                                    rs1.getString("bikeFuelType"),
                                    rs1.getDouble("bikeRatePHour"),
                                    rs1.getInt("helmetNumber"),
                                    rs1.getInt("jacketNumber"),
                                    rs1.getInt("cylinderCapacity")));
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rootFilterBikeTable.getChildren().add(bikeFilterTableView);


                }

            }
        });

//------------------------------------------------------------------------------------------------------------------------------


        //creat main Scene
        Scene scene1 = new Scene(rootforMain, 450, 300);
        String cssFile1 = this.getClass().getResource("Style.css").toExternalForm();
        scene1.getStylesheets().add(cssFile1);

        primaryStage.setScene(scene1);
        primaryStage.show();
        //call all back to menu button
        backBu1.setOnAction(e -> primaryStage.setScene(scene1));
        backBu2.setOnAction(e -> primaryStage.setScene(scene1));
        backBu3.setOnAction(e -> primaryStage.setScene(scene1));


    }
}

