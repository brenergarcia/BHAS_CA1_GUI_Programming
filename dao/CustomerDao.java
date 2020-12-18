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
public class CustomerDao {
    
    private Connection connection;
    int idCustomer;
    String full_name;
    String email;
    String phone;
    String password;
    public CustomerDao(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void add(User user){ 
        String sql = "INSERT INTO customer(full_name,email,phone,password) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getFull_name());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPhone());
            stmt.setString(4, user.getPassword());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
    
}
