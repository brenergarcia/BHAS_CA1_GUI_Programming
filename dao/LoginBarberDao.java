/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author brener
 */
public class LoginBarberDao {
   
    private Connection connection;
    String email;
    String password;
        
    public boolean LoginBarberDao(String email, String password){ 
        //this.connection = new ConnectionFactory().getConnection();
        
        boolean auth = false;
        String sql;
        try {
            this.connection = new ConnectionFactory().getConnection();

            sql = "SELECT email, password FROM barber WHERE email = ? and password = ?";
            PreparedStatement ps;
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs;
            rs = ps.executeQuery();

            if (rs.next()) {
                email = rs.getString("email");
                password = rs.getString("password");
                auth = true;
            } else {
                ps.close();
                return auth;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return auth;
           
        
        
    } 
    
//    public void check(User user){
//        String query = "SELECT email, password FROM barber where email = ? and password = ?";
//        try {
//             PreparedStatement stmt = connection.prepareStatement(query);
//             stmt.setString(1, user.email);
//             stmt.setString(2, user.password);
//             stmt.execute();
//             stmt.close();
//             ResultSet rs = stmt.executeQuery(query);
//             while (rs.next()) {
//                 JOptionPane.showMessageDialog(null, "User not found!");             
//             }
//             rs.close();
//                
//        }
//        catch (SQLException u) { 
//        throw new RuntimeException(u);
//    
//        }
//    }
    
    
//    public boolean check (String login, String passwd) throws SQLException{
//// Manda como parametro para ele duas variaveis para ele procurar no banco de dados!
// 
//            boolean auth = false;
//            String sql;
//            sql = "SELECT email, password FROM barber where email = ? and password = ?";
//            PreparedStatement ps;
// 
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, login);
//            ps.setString(2, passwd);
// 
//            ResultSet rs;
//            rs = ps.executeQuery();
// 
//            if (rs.next()) {
//                String loginDB = rs.getString("email");
//                String passwdDB = rs.getString("password");
//            auth = true;
//            }
// 
//            ps.close();
//   
// 
//            return auth;
// 
// 
//        }
//          
            
    }


