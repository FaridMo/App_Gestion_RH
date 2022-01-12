/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

import static BDD.Configuration.*;
import Model.Colors;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali Abdoulkader Ali
 */
public class Bienvenue extends javax.swing.JFrame {

    ;
    /**
     * Creates new form Bienvenue
     */
    public Bienvenue() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel1.setBackground(Colors.INSTANCE.menuColor());
        copyright.setForeground(Colors.INSTANCE.CopyrightTextColor());
        logout.setBackground(Colors.INSTANCE.primaryColor());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accueil = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titreMenu = new javax.swing.JLabel();
        boutonEmployes = new javax.swing.JButton();
        boutonPromo = new javax.swing.JButton();
        boutonConge = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accueil");
        setResizable(false);

        accueil.setBackground(new java.awt.Color(41, 94, 81));
        accueil.setToolTipText("");
        accueil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(41, 94, 81));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        accueil.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 50, 60));

        jPanel1.setBackground(new java.awt.Color(44, 58, 71));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        titreMenu.setBackground(new java.awt.Color(204, 204, 255));
        titreMenu.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        titreMenu.setForeground(new java.awt.Color(236, 204, 104));
        titreMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-ressources-humaines-48.png"))); // NOI18N
        titreMenu.setText(" Système de Gestion des Ressources Humaines");
        titreMenu.setToolTipText("");
        titreMenu.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        accueil.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 13, -1, -1));

        boutonEmployes.setBackground(new java.awt.Color(72, 219, 251));
        boutonEmployes.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        boutonEmployes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-employee-64.png"))); // NOI18N
        boutonEmployes.setText("Employés");
        boutonEmployes.setToolTipText("Gestion des employés");
        boutonEmployes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEmployesActionPerformed(evt);
            }
        });
        accueil.add(boutonEmployes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 189, -1));

        boutonPromo.setBackground(new java.awt.Color(0, 204, 51));
        boutonPromo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        boutonPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-promotion-64.png"))); // NOI18N
        boutonPromo.setText("Promotions");
        boutonPromo.setToolTipText("Gestion des promotions");
        boutonPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonPromoActionPerformed(evt);
            }
        });
        accueil.add(boutonPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 279, 190, -1));

        boutonConge.setBackground(new java.awt.Color(255, 204, 0));
        boutonConge.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        boutonConge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-vacation-64.png"))); // NOI18N
        boutonConge.setText("Congés");
        boutonConge.setToolTipText("Gestion des congés");
        boutonConge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonCongeActionPerformed(evt);
            }
        });
        accueil.add(boutonConge, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 378, 189, -1));

        copyright.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        copyright.setForeground(new java.awt.Color(255, 204, 102));
        copyright.setText("Copyright © 2021 | Ali Abdoulkader Ali - Helem Houmed - Aboubaker Ainan| All rights reserved");
        accueil.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 563, -1, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/human-resources (2).png"))); // NOI18N
        accueil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 390, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Êtes-vous sûr de vous déconnecter ?");
        if (input == 0) {
            this.dispose();
            new Login().setVisible(true);
        }

    }//GEN-LAST:event_logoutActionPerformed

    private void boutonEmployesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonEmployesActionPerformed

        this.dispose();
        new Employe().setVisible(true);

    }//GEN-LAST:event_boutonEmployesActionPerformed

    private void boutonPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonPromoActionPerformed
        this.dispose();
        new Promotion().setVisible(true);
    }//GEN-LAST:event_boutonPromoActionPerformed

    private void boutonCongeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonCongeActionPerformed
        this.dispose();
        new Conges().setVisible(true);
    }//GEN-LAST:event_boutonCongeActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accueil;
    private javax.swing.JButton boutonConge;
    private javax.swing.JButton boutonEmployes;
    private javax.swing.JButton boutonPromo;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel titreMenu;
    // End of variables declaration//GEN-END:variables
}