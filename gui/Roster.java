/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author brener
 */
public class Roster {

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
    private JButton btnClose;
    static private JComboBox comboBoxBarber; 
    private Label lblBarber;
    static String barbers[] ={"","Brener", "Mateus"};
 
    public Roster(){
   
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
        btnClose = new JButton();
        
        frame.setSize(350,250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Appointments");
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
        
        btnClose.setText("Close");
        btnClose.setBounds(100,170,165,25);
        panel.add(btnClose);
        
        btnClose.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                  btnBookingActionPerformed(evt);
            }

            private void btnBookingActionPerformed(ActionEvent evt) {
                    System.exit(0);
            }
                
        });
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true); 
}






}