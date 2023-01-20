package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String NAME = "root";
    private static final String PASS = "3Iula7daee!3Iula7daee!";


    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, NAME, PASS);
        //System.out.println("Connection OK");
        return connection;
    }
}
