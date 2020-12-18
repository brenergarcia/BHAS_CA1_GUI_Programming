    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author brener
 */
public class BarberDao {
    
    private Connection connection;
    int idBarber;
    String full_name;
    String email;
    String phone;
    String location;
    String password;
    public BarberDao(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void add(User user){ 
        String sql = "INSERT INTO barber(full_name,email,phone,location,password) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getFull_name());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPhone());
            stmt.setString(4, user.getLocation());
            stmt.setString(5, user.getPassword());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 

    }
          
}    
