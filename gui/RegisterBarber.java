/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;
import dao.BarberDao;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import model.User;

/**
 *
 * @author brener
 */

public class RegisterBarber extends JFrame {
       
        public static void main(String args[]) {
      
//        //Create and display the form
        EventQueue.invokeLater(() -> {
            new RegisterBarber().setVisible(true);
        });
    }
        
        public RegisterBarber() {
        initComponents();
        }
       
    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel lblTitle = new JLabel();
        JTextField txtFull_name = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtPhone = new JTextField();
        JTextField txtLocation = new JTextField();
        JPasswordField txtPassword = new JPasswordField();
        JButton btnRegister = new JButton();
        JLabel lblFull_name = new JLabel();
        JLabel lblEmail = new JLabel();
        JLabel lblPhone = new JLabel();
        JLabel lblLocation = new JLabel();
        JLabel lblPassword = new JLabel();
        JButton btnClear = new JButton(); 
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail)
                    .addComponent(lblFull_name)
                    .addComponent(lblLocation)
                    .addComponent(lblPassword))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGap(230, 230, 230))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFull_name, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtFull_name, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFull_name))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

    

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            this.setSize(640,480);
            this.setTitle("BHAS - Register Barber");
            setResizable(false);
            setLocationRelativeTo(null);
                        
            lblTitle.setFont(new Font("Ubuntu", 0, 24)); 
            lblTitle.setText("Register Barber");
            
            txtFull_name.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            txtEmail.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            txtPhone.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            txtLocation.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            txtPassword.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
            
            btnClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    btnClearActionPerformed(evt);
                }

                private void btnClearActionPerformed(ActionEvent evt) {
                    txtFull_name.setText("");
                    txtEmail.setText("");
                    txtPhone.setText("");       
                    txtLocation.setText("");       
                    txtPassword.setText("");  
                }
            });


            lblFull_name.setText("Full Name:");
            lblEmail.setText("Email:");
            lblPhone.setText("Phone:");
            lblLocation.setText("Location:");
            lblPassword.setText("Password:");

            btnClear.setText("Clear");
            
            btnRegister.setText("Register");
            btnRegister.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent evt) {
                    btnRegisterActionPerformed(evt);
                }

                private void btnRegisterActionPerformed(ActionEvent evt) {

                    // Creating the instance for the class User from model package and creating its object user
                    User user = new User();
                    user.setFull_name(txtFull_name.getText());
                    user.setEmail(txtEmail.getText());
                    user.setPhone(txtPhone.getText());
                    user.setLocation(txtLocation.getText());
                    user.setPassword(txtPassword.getText());

                    //validating data
                    if ((txtFull_name.getText().isEmpty()) || (txtEmail.getText().isEmpty()) || (txtPhone.getText().isEmpty()) || (txtLocation.getText().isEmpty()) || (txtPassword.getText().isEmpty())) {
                            JOptionPane.showMessageDialog(null, "All fields must be filled in!");
                    }else {

                            //  Creating the instance for the class BarberDao from dao package and creating its object dao
                            BarberDao dao = new BarberDao();
                            dao.add(user);
                            JOptionPane.showMessageDialog(null, "User "+txtFull_name.getText()+" successfully inserted! ");
                            LoginBarber LoginBarber = new LoginBarber();
                            LoginBarber.setVisible(true);
                            dispose();

                            //cleaning text fields
                            txtFull_name.setText("");
                            txtEmail.setText("");
                            txtPhone.setText("");       
                            txtLocation.setText("");       
                            txtPassword.setText(""); 
                        }
                }
                       
        });
    }        
}       
           
    
    
    
    
    
    

