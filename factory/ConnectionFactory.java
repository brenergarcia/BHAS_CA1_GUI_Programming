/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author brener
 */

// class to do the exceptions treatment
public class ConnectionFactory {
    
    public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://52.50.23.197:3306/Brener_2019330?useSSL=false","Brener_2019330","2019330");
		 }         
		 catch(SQLException exception) {
			throw new RuntimeException(exception);
		 }
     }
    
    
    
}
