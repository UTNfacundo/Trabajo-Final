/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import AppPackage.AnimationClass;
import java.awt.Component;
import java.util.ArrayList;
import ui.GraphicControl;

/**
 *
 * @author natal
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
       
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBack = new javax.swing.JPanel();
        jPanelLogIn = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        jLabelForgotPass = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        kButtonsignIn = new keeptoo.KButton();
        kButtonLogIn = new keeptoo.KButton();
        jLabelTitle3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelImageBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLogIn.setOpaque(false);
        jPanelLogIn.setPreferredSize(new java.awt.Dimension(471, 554));
        jPanelLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 60)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("Caribbean");
        jPanelLogIn.add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 310, 90));

        jLabelForgotPass.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 20)); // NOI18N
        jLabelForgotPass.setForeground(new java.awt.Color(255, 255, 255));
        jLabelForgotPass.setText("¿Olvidaste tu contraseña?");
        jLabelForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelLogIn.add(jLabelForgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 260, -1));

        jTextFieldUser.setFont(new java.awt.Font("Segoe UI Light", 0, 28)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.setText("Email...");
        jTextFieldUser.setBorder(null);
        jTextFieldUser.setOpaque(false);
        jTextFieldUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUserFocusLost(evt);
            }
        });
        jTextFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldUserMouseExited(evt);
            }
        });
        jPanelLogIn.add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 280, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelLogIn.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 20, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons/lock-48.png"))); // NOI18N
        jPanelLogIn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 50, 50));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanelLogIn.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 280, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelLogIn.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 20, 60));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanelLogIn.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 280, 30));

        kButtonsignIn.setText("Registrarse");
        kButtonsignIn.setBorderPainted(false);
        kButtonsignIn.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        kButtonsignIn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButtonsignIn.setkBorderRadius(50);
        kButtonsignIn.setkEndColor(new java.awt.Color(121, 213, 215));
        kButtonsignIn.setkHoverEndColor(new java.awt.Color(61, 255, 255));
        kButtonsignIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButtonsignIn.setkHoverStartColor(new java.awt.Color(0, 198, 198));
        kButtonsignIn.setkPressedColor(new java.awt.Color(255, 0, 0));
        kButtonsignIn.setkSelectedColor(new java.awt.Color(77, 141, 169));
        kButtonsignIn.setkStartColor(new java.awt.Color(0, 132, 132));
        kButtonsignIn.setOpaque(false);
        kButtonsignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kButtonsignInMouseClicked(evt);
            }
        });
        jPanelLogIn.add(kButtonsignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 150, -1));

        kButtonLogIn.setText("Ingresar");
        kButtonLogIn.setBorderPainted(false);
        kButtonLogIn.setFont(new java.awt.Font("Segoe UI Light", 0, 26)); // NOI18N
        kButtonLogIn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        kButtonLogIn.setkBorderRadius(50);
        kButtonLogIn.setkEndColor(new java.awt.Color(121, 213, 215));
        kButtonLogIn.setkHoverEndColor(new java.awt.Color(61, 255, 255));
        kButtonLogIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButtonLogIn.setkHoverStartColor(new java.awt.Color(0, 198, 198));
        kButtonLogIn.setkPressedColor(new java.awt.Color(255, 0, 0));
        kButtonLogIn.setkSelectedColor(new java.awt.Color(77, 141, 169));
        kButtonLogIn.setkStartColor(new java.awt.Color(0, 132, 132));
        kButtonLogIn.setOpaque(false);
        jPanelLogIn.add(kButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 150, -1));

        jLabelTitle3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 60)); // NOI18N
        jLabelTitle3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle3.setText("Travel");
        jPanelLogIn.add(jLabelTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/icons/user - 48.png"))); // NOI18N
        jPanelLogIn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, 50));

        jPasswordField1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField");
        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseExited(evt);
            }
        });
        jPanelLogIn.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 280, 50));

        jPanelBack.add(jPanelLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelImageBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/fondoLogin.jpg"))); // NOI18N
        jPanelBack.add(jLabelImageBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUserMouseEntered

        GraphicControl.animationJTextField( 230, (230-9), 10, 1, jTextFieldUser,1);
    }//GEN-LAST:event_jTextFieldUserMouseEntered

    private void jTextFieldUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUserMouseExited
        
        GraphicControl.animationJTextField( (230-9), 230, 8, 1, jTextFieldUser,2);
    }//GEN-LAST:event_jTextFieldUserMouseExited

    private void kButtonsignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kButtonsignInMouseClicked
       // loadComponentList();
        
        /*for(int i=0;i<(components.length-1);i++){ //en menos uno porque el label de fondo es el ultimo componente
            jPanelBack.remove(components[i]);
            
        }*/
        
        this.setVisible(false);
        this.dispose();
        
        SigIn sigin = new SigIn();
        sigin.setVisible(true);
    }//GEN-LAST:event_kButtonsignInMouseClicked

    private void jTextFieldUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUserMouseClicked
        GraphicControl.changeJTextField(jTextFieldUser, "Email...", "");
    }//GEN-LAST:event_jTextFieldUserMouseClicked

    private void jTextFieldUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserFocusLost
        GraphicControl.changeJTextField(jTextFieldUser, "", "Email...");
    }//GEN-LAST:event_jTextFieldUserFocusLost

    private void jPasswordField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseEntered
        GraphicControl.animationJTextField( 360, (360-9), 10, 1, jPasswordField1,1);
    }//GEN-LAST:event_jPasswordField1MouseEntered

    private void jPasswordField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseExited
        GraphicControl.animationJTextField( (360-9), 360, 8, 1, jPasswordField1,2);
    }//GEN-LAST:event_jPasswordField1MouseExited

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        GraphicControl.changeJTextField(jTextFieldUser, "jPasswordField", "");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        GraphicControl.changeJTextField(jTextFieldUser, "", "jPasswordField");
    }//GEN-LAST:event_jPasswordField1FocusLost


    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private AnimationClass animation = new AnimationClass();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelForgotPass;
    private javax.swing.JLabel jLabelImageBack;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle3;
    private javax.swing.JPanel jPanelBack;
    private javax.swing.JPanel jPanelLogIn;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldUser;
    private keeptoo.KButton kButtonLogIn;
    private keeptoo.KButton kButtonsignIn;
    // End of variables declaration//GEN-END:variables
}
