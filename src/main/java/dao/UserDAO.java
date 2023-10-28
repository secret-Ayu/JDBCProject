package dao;

import model.user;
import db.MyConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;


public class UserDAO {
    public static List<user> getAllUsers()throws SQLException{
        List<user> users = new ArrayList<>();
        Connection conn  = MyConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from user");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String email = rs.getString(3);
            user u = new user(id, name,email);
            users.add(u);
        }
        return users;

    }
}
