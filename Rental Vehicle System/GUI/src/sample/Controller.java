package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {

    public static Connection createConnection() throws ClassNotFoundException {
        // create the connection for db
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost:8889/WestminsterRentalVehicleSystem?useSSL=false";
        try {
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
