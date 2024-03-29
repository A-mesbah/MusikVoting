package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatenbankConnection {

    private static DatenbankConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/musikvoting";
    private String username = "root";
    private String password = ""; //your password for yours database

    private DatenbankConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        } finally {
            System.out.println("Database Connection Creation succeeded");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatenbankConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatenbankConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatenbankConnection();
        }

        return instance;
    }
}
