/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainpageJava;

import ButonView.*;
import Login.Login;

/**
 *
 * @author prince
 */
public class MyMenu extends javax.swing.JFrame {

    /**
     * Creates new form MyMenu
     */
    public MyMenu() {
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

        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnclient = new javax.swing.JButton();
        btnchambre = new javax.swing.JButton();
        btnreservation = new javax.swing.JButton();
        btnservice = new javax.swing.JButton();
        btnpaiement = new javax.swing.JButton();
        btnutilisateur = new javax.swing.JButton();
        btnfacture = new javax.swing.JButton();
        btnconsommation = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mere = new javax.swing.JDesktopPane();
        labelphoto = new javax.swing.JLabel();

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        jButton9.setText("jButton1");

        jButton10.setBackground(new java.awt.Color(51, 102, 255));
        jButton10.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        jButton10.setText("jButton1");

        jButton11.setBackground(new java.awt.Color(51, 102, 255));
        jButton11.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        jButton11.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclient.setBackground(new java.awt.Color(51, 102, 255));
        btnclient.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnclient.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/customer.png")); // NOI18N
        btnclient.setText("Clients");
        btnclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientActionPerformed(evt);
            }
        });
        jPanel1.add(btnclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 38));

        btnchambre.setBackground(new java.awt.Color(51, 102, 255));
        btnchambre.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnchambre.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/bed.png")); // NOI18N
        btnchambre.setText("Chambres");
        btnchambre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchambreActionPerformed(evt);
            }
        });
        jPanel1.add(btnchambre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 38));

        btnreservation.setBackground(new java.awt.Color(51, 102, 255));
        btnreservation.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnreservation.setIcon(new javax.swing.ImageIcon("/home/prince/Téléchargements/booking_hotel_icon_141823.png")); // NOI18N
        btnreservation.setText("Réservations");
        btnreservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservationActionPerformed(evt);
            }
        });
        jPanel1.add(btnreservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 38));

        btnservice.setBackground(new java.awt.Color(51, 102, 255));
        btnservice.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnservice.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/service.png")); // NOI18N
        btnservice.setText("Services");
        btnservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserviceActionPerformed(evt);
            }
        });
        jPanel1.add(btnservice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 38));

        btnpaiement.setBackground(new java.awt.Color(51, 102, 255));
        btnpaiement.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnpaiement.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/debit-card.png")); // NOI18N
        btnpaiement.setText("Paiements");
        btnpaiement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaiementActionPerformed(evt);
            }
        });
        jPanel1.add(btnpaiement, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 190, 38));

        btnutilisateur.setBackground(new java.awt.Color(51, 102, 255));
        btnutilisateur.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnutilisateur.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/security.png")); // NOI18N
        btnutilisateur.setText("Utilisateurs");
        btnutilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnutilisateurActionPerformed(evt);
            }
        });
        jPanel1.add(btnutilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, 38));

        btnfacture.setBackground(new java.awt.Color(51, 102, 255));
        btnfacture.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnfacture.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/validating-ticket.png")); // NOI18N
        btnfacture.setText("Factures");
        btnfacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfactureActionPerformed(evt);
            }
        });
        jPanel1.add(btnfacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 190, 38));

        btnconsommation.setBackground(new java.awt.Color(51, 102, 255));
        btnconsommation.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        btnconsommation.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/food-service.png")); // NOI18N
        btnconsommation.setText("Consommations");
        btnconsommation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsommationActionPerformed(evt);
            }
        });
        jPanel1.add(btnconsommation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 190, 38));

        jButton12.setBackground(new java.awt.Color(102, 0, 102));
        jButton12.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("/home/prince/NetBeansProjects/HotelPrince/hotelPrince/src/MainpageJava/ImageIcon/signin_login_out_log_icon_256019.png")); // NOI18N
        jButton12.setText("Deconnexion");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 190, 38));

        jButton13.setBackground(new java.awt.Color(255, 0, 0));
        jButton13.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        jButton13.setText("FERMER");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 160, 38));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainpageJava/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 180));

        javax.swing.GroupLayout mereLayout = new javax.swing.GroupLayout(mere);
        mere.setLayout(mereLayout);
        mereLayout.setHorizontalGroup(
            mereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mereLayout.setVerticalGroup(
            mereLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        labelphoto.setIcon(new javax.swing.ImageIcon("/home/prince/Téléchargements/azalai-hotel-cotonou.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mere)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mere)
                .addContainerGap())
            .addComponent(labelphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1347, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnreservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservationActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        this.mere.removeAll();
        this.mere.repaint();
        Reservations re = new Reservations();
        this.mere.add(re);
        try {
            re.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        re.show();
    }//GEN-LAST:event_btnreservationActionPerformed

    private void btnclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();

        this.mere.removeAll();
        this.mere.repaint();
        Clients cl = new Clients();
        this.mere.add(cl);
        try {
            cl.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        cl.show();
    }//GEN-LAST:event_btnclientActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnchambreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchambreActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();
        this.mere.removeAll();
        this.mere.repaint();
        Chambres ch = new Chambres();
        this.mere.add(ch);
        try {
            ch.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ch.show();
    }//GEN-LAST:event_btnchambreActionPerformed

    private void btnserviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserviceActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();
        //btnservice.setForeground(Color.green);

        this.mere.removeAll();
        this.mere.repaint();
        Services se = new Services();
        this.mere.add(se);
        try {
            se.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        se.show();

    }//GEN-LAST:event_btnserviceActionPerformed

    private void btnconsommationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsommationActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();
        this.mere.removeAll();
        this.mere.repaint();
        Consommations se = new Consommations();
        this.mere.add(se);
        try {
            se.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        se.show();
    }//GEN-LAST:event_btnconsommationActionPerformed

    private void btnutilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnutilisateurActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();
        this.mere.removeAll();
        this.mere.repaint();
        Utilisateurs se = new Utilisateurs();
        this.mere.add(se);
        try {
            se.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        se.show();
    }//GEN-LAST:event_btnutilisateurActionPerformed

    private void btnpaiementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaiementActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();

        this.mere.removeAll();
        this.mere.repaint();
        Paiements ps = new Paiements();
        this.mere.add(ps);
        try {
            ps.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ps.show();
    }//GEN-LAST:event_btnpaiementActionPerformed

    private void btnfactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfactureActionPerformed
        // TODO add your handling code here:
        labelphoto.setIcon(null);
        labelphoto.setEnabled(false);
        labelphoto.hide();

        this.mere.removeAll();
        this.mere.repaint();
        Factures fs = new Factures();
        this.mere.add(fs);
        try {
            fs.setMaximum(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fs.show();

    }//GEN-LAST:event_btnfactureActionPerformed

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
            java.util.logging.Logger.getLogger(MyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnchambre;
    public javax.swing.JButton btnclient;
    public javax.swing.JButton btnconsommation;
    public javax.swing.JButton btnfacture;
    public javax.swing.JButton btnpaiement;
    public javax.swing.JButton btnreservation;
    public javax.swing.JButton btnservice;
    public javax.swing.JButton btnutilisateur;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelphoto;
    private javax.swing.JDesktopPane mere;
    // End of variables declaration//GEN-END:variables
}