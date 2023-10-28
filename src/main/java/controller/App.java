package controller;
import dao.UserDAO;
import model.user;
import db.MyConnection;
import java.util.List;
import java.sql.SQLException;

public class App {
    public static void main(String args[]){
        try {
            List<user> users = UserDAO.getAllUsers();
            for(user u : users){
                System.out.println(u.getId() + "\t" + u.getName());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
