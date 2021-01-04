package lk.ijse.ViskoRental.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection dbconnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/viskoRental", "root", "1234");

    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        return (null == dbconnection) ? (dbconnection = new DBConnection()) : (dbconnection);

    }

    public Connection getConnection() {
        return connection;
    }
}
