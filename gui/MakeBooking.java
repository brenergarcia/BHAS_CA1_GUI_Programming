/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.BookingDao;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.User;

/**
 *
 * @author brener
 */
public class MakeBooking {
    
        
    static private JFrame frame;
    private JPanel panel;
    static private JTextField txtFirst_name;
    static private JTextField txtLast_name;
    static private JTextField txtTime;
    static private JTextField txtDate;
    private Label lblFirstName;
    private Label lblLastName;
    private Label lblTime;
    private Label lbldate;
    static String idBarber;
    private JButton btnBooking;
    static private JComboBox comboBoxBarber; 
    private Label lblBarber;
    static String barbers[] ={"","Brener", "Mateus"};
 
    public MakeBooking(){
   
        frame = new JFrame();
        panel = new JPanel();
        txtFirst_name = new JTextField(20);
        txtLast_name = new JTextField(20);
        txtTime = new JTextField(20);
        txtDate = new JTextField(20);
        comboBoxBarber = new JComboBox(barbers);
        lblFirstName = new Label();
        lblLastName = new Label();
        lbldate = new Label();
        lblTime = new Label();
        lblBarber = new Label();
        btnBooking = new JButton();
        
        frame.setSize(350,250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Make a Booking");
        frame.add(panel);
        
        panel.setLayout(null);
        
        lblFirstName.setText("First Name: ");
        lblFirstName.setBounds(10,20,80,25);
        panel.add(lblFirstName);
        
        txtFirst_name.setBounds(100,20,165,25);
        panel.add(txtFirst_name);
        
        lblLastName.setText("Last Name: ");
        lblLastName.setBounds(10,50,80,25);
        panel.add(lblLastName);
        
        txtLast_name.setBounds(100,50,165,25);
        panel.add(txtLast_name);
        
        lblTime.setText("Time: ");
        lblTime.setBounds(10,80,80,25);
        panel.add(lblTime);
        
        txtTime.setBounds(100,80,165,25);
        txtTime.setText("HH:MM");
        txtTime.addFocusListener(new FocusListener(){
	       
	    public void focusGained(FocusEvent e){
	        if(txtTime.getText().equals("HH:MM")) {
	        	txtTime.setText("");
                    }
	        }

            @Override
            public void focusLost(FocusEvent fe) {
                if(txtTime.getText().equals("")) {
                   txtTime.setText("HH:MM");
                }  

            }
            
        });  
        panel.add(txtTime);
        
        lbldate.setText("Date: ");
        lbldate.setBounds(10,110,80,25);
        panel.add(lbldate);
        
        txtDate.setBounds(100,110,165,25);
        txtDate.setText("DD/MM/YYYY");
        txtDate.addFocusListener(new FocusListener(){
	       
	    public void focusGained(FocusEvent e){
	        if(txtDate.getText().equals("DD/MM/YYYY")) {
	        	txtDate.setText("");
                    }
	        }

            @Override
            public void focusLost(FocusEvent fe) {
                if(txtDate.getText().equals("")) {
                   txtDate.setText("DD/MM/YYYY");
                }  

            }
            
        });  
        panel.add(txtDate);
        
        lblBarber.setText("Barber: ");
        lblBarber.setBounds(10,140,80,25);
        panel.add(lblBarber);
        
        comboBoxBarber.setBounds(100,140,165,25);
        panel.add(comboBoxBarber);
        
        comboBoxBarber.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
              if(ie.getSource()== comboBoxBarber){
                  if(comboBoxBarber.getSelectedItem().toString().equals("Brener")){
                      idBarber = "1";
                     
                     
                     
                  }else{
                      idBarber = "2";
                     
                     
                    
                  }
              }   
            }
        });
        
        btnBooking.setText("Booking");
        btnBooking.setBounds(100,170,165,25);
        panel.add(btnBooking);
        
        btnBooking.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                  btnBookingActionPerformed(evt);
            }

            private void btnBookingActionPerformed(ActionEvent evt) {
               // Creating the instance for the class User from model package and creating its object user
                    User user = new User();
                    user.setFirst_Name(txtFirst_name.getText());
                    user.setLast_Name(txtLast_name.getText());
                    user.setTime(txtTime.getText());
                    user.setDate(txtDate.getText());
                    
                    
                    

                    //validating data
                    if ((txtFirst_name.getText().isEmpty()) || (txtLast_name.getText().isEmpty()) || (txtTime.getText().isEmpty()) || (txtDate.getText().isEmpty())) {
                            JOptionPane.showMessageDialog(null, "All fields must be filled in!");
                    }else {

                            //  Creating the instance for the class BookingDao from dao package and creating its object dao
                            BookingDao dao = new BookingDao();
                            dao.add(user);
                            JOptionPane.showMessageDialog(null, "Book successfull! ");
                            LoginBarber LoginBarber = new LoginBarber();
                            LoginBarber.setVisible(true);
                            

                            //cleaning text fields
                            txtFirst_name.setText("");
                            txtLast_name.setText("");
                            txtTime.setText("");       
                            txtDate.setText("");   
                            
                            
                        }
                
            }

   
         });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
  
    }
  
    
}
    
    
