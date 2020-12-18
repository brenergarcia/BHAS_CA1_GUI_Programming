/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author brener
 */
public class FirstScreen extends JFrame{
    
        public static void main(String args[]) {
      
        //Create and display the screen
        EventQueue.invokeLater(() -> {
            new FirstScreen().setVisible(true);
            
        });
    }
   
        public FirstScreen() {
        
            initComponents();
        }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel lblTitle = new JLabel();
        JLabel lblCheck = new JLabel();
        JButton btnCustomer = new JButton();
        JButton btnBarber = new JButton();
        
        lblTitle.setFont(new Font("Ubuntu", 0, 24));
        lblTitle.setText("Welcome to BHAS");
        
        lblCheck.setFont(new Font("Ubuntu", 0, 24));
        lblCheck.setText("Who are you?");
        
        btnCustomer.setText("Customer");
        btnBarber.setText("Barber");
        
        btnCustomer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    btnCustomerActionPerformed(evt);
                }

                private void btnCustomerActionPerformed(ActionEvent evt) {
                    LoginCustomer LoginCustomer = new LoginCustomer();
                    LoginCustomer.setVisible(true);
                    dispose();
                }

            });
        
         btnBarber.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    btnBarberActionPerformed(evt);
                }

                private void btnBarberActionPerformed(ActionEvent evt) {
                    LoginBarber LoginBarber = new LoginBarber();
                    LoginBarber.setVisible(true);
                    dispose();
                }

            });
        
         GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCustomer)
                        .addGap(34, 34, 34)
                        .addComponent(btnBarber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblCheck)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTitle)
                .addGap(63, 63, 63)
                .addComponent(lblCheck)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomer)
                    .addComponent(btnBarber))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );   
        
  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setSize(380,380);
        this.setTitle("Welcome to BHAS");
        setResizable(false);
        setLocationRelativeTo(null);
        
    }    
        
}
