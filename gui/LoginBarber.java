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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import model.User;

/**
 *
 * @author brener
 */
public class LoginBarber extends JFrame{

        public LoginBarber() {
        initComponents();
    }
    
    public static void main(String args[]) {
      
        //Create and display the login screen
        EventQueue.invokeLater(() -> {
            new LoginCustomer().setVisible(true);
        });
    }

    private void initComponents() {
        
        
        JPanel jPanel1 = new JPanel();
        JLabel lblTitle = new JLabel();
        JLabel lblEmail = new JLabel();
        JLabel lblPassword = new JLabel();
        JTextField txtEmail = new JTextField();
        JPasswordField txtPassword = new JPasswordField();
        JButton btnLogin = new JButton();
        JLabel lblAccount = new JLabel();
        JButton btnSignUP = new JButton();
        
        lblTitle.setFont(new Font("Ubuntu", 0, 24));
        lblTitle.setText("Sign In");
        lblEmail.setText("Email:");
        lblPassword.setText("Password:");

        txtEmail.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        txtPassword.setBorder(new BevelBorder(BevelBorder.RAISED));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent evt) {
                btnLoginActionPerformed(evt);
            } 

            private void btnLoginActionPerformed(ActionEvent evt) {
                Roster Roster = new Roster();
                dispose();
                
            }
            });
                    

        lblAccount.setText("Don't have an account? ");

        btnSignUP.setText("Sign UP");
        btnSignUP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSignUPActionPerformed(evt);
            }

            private void btnSignUPActionPerformed(ActionEvent evt) {
                RegisterBarber RegisterBarber = new RegisterBarber();
                RegisterBarber.setVisible(true);
                dispose();
            }
        });
        
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(lblTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccount)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnSignUP))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPassword)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassword))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblEmail)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(lblAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignUP))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        this.setTitle("BHAS - Barber Login");
        setResizable(false);
        setLocationRelativeTo(null);
        
    }

  
}
