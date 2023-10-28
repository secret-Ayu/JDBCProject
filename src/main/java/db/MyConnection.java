package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "ayushi");
            System.out.println("connection is done");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(){

    }



}
