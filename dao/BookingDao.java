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
public class BookingDao {
    
    private Connection connection;
    int idBooking;
    String first_name;
    String last_name;
    String time;
    String date;
    
    
    
    public BookingDao(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void add(User user){ 
        String sql = "INSERT INTO booking(first_name,last_name,time,date) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getFirst_Name());
            stmt.setString(2, user.getLast_Name());
            stmt.setString(3, user.getTime());
            stmt.setString(4, user.getDate());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 

    }
    
    
}
