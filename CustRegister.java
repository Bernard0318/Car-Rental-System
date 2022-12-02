package Customer;



import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import Customer.Customer;
import java.util.List;
import java.io.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 *//**
 *
 * @author Acer
 */
public class CustRegister extends javax.swing.JFrame {
    private Customer customer;
    private static List<Customer> customers = new ArrayList<Customer>();
    /**
     * Creates new form CustRegister
     */
    public CustRegister() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtCustName1 = new javax.swing.JTextField();
        txtCustEmail1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCustPass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RegisterBack = new javax.swing.JButton();
        CustRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnMale = new javax.swing.JRadioButton();
        BtnFemale = new javax.swing.JRadioButton();
        txtCustAge = new javax.swing.JTextField();
        txtCustPhone = new javax.swing.JTextField();
        txtCustEmail = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("Name :");

        txtCustName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustName1ActionPerformed(evt);
            }
        });

        txtCustEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustEmail1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 202, 135));
        jPanel1.setForeground(new java.awt.Color(255, 255, 153));

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Customer Register");

        jLabel2.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Username");

        txtCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Age");

        txtCustPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustPassActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Password");

        RegisterBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterBack.setText("BACK");
        RegisterBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBackActionPerformed(evt);
            }
        });

        CustRegister.setBackground(new java.awt.Color(255, 153, 153));
        CustRegister.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        CustRegister.setText("Register");
        CustRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustRegisterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("Phone No.");

        jLabel10.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("Email");

        buttonGroup1.add(BtnMale);
        BtnMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnMale.setText("Male");

        buttonGroup1.add(BtnFemale);
        BtnFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnFemale.setText("Female");

        txtCustAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustAgeActionPerformed(evt);
            }
        });

        txtCustPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustPhoneActionPerformed(evt);
            }
        });

        txtCustEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(CustRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(BtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCustPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustAge, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(271, 271, 271))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCustPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCustAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BtnMale)
                    .addComponent(BtnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCustPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCustEmail))
                .addGap(27, 27, 27)
                .addComponent(CustRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(RegisterBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustNameActionPerformed

    private void txtCustName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustName1ActionPerformed

    private void txtCustEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustEmail1ActionPerformed

    private void txtCustPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustPassActionPerformed

    private void RegisterBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBackActionPerformed
        dispose();
    }//GEN-LAST:event_RegisterBackActionPerformed

    private void CustRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustRegisterActionPerformed
        String CustName = txtCustName.getText();
        String CustPass = txtCustPass.getText();
        int CustAge = Integer.parseInt(txtCustAge.getText());
        String CustGender = "";
        if (BtnMale.isSelected()){
            CustGender = "Male";
        }else if (BtnFemale.isSelected()){
            CustGender = "Female";
        }
        String CustPhone = txtCustPhone.getText();
        String CustEmail = txtCustEmail.getText();
        customer = new Customer (CustName,CustPass,CustAge,CustGender,CustPhone,CustEmail);
        customers.add(customer);
        int CustID = customer.getcustID();
        
        
        try{
            customer.Writefile();
            JOptionPane.showMessageDialog(this,"Registered");
        }catch(Exception E){
            
        }
    }//GEN-LAST:event_CustRegisterActionPerformed

    private void txtCustAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustAgeActionPerformed

    private void txtCustPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustPhoneActionPerformed

    private void txtCustEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnFemale;
    private javax.swing.JRadioButton BtnMale;
    private javax.swing.JButton CustRegister;
    private javax.swing.JButton RegisterBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCustAge;
    private javax.swing.JTextField txtCustEmail;
    private javax.swing.JTextField txtCustEmail1;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustName1;
    private javax.swing.JTextField txtCustPass;
    private javax.swing.JTextField txtCustPhone;
    // End of variables declaration//GEN-END:variables
}
