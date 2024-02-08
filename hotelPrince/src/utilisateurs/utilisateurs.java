/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package utilisateurs;

import Menu.Menu;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static DataBase.ConnectionBd.*;
import Login.Login;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
//import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author prince
 */
public class utilisateurs extends javax.swing.JFrame implements UserInterface {

    /**
     * Creates new form clients
     */
    PreparedStatement pst;
    ResultSet rs;
    String username;
    String passwd;

    public utilisateurs() {
        initComponents();
        Connect();
       // Table();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtnom_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        updateUser = new javax.swing.JButton();
        jLabel8research = new javax.swing.JLabel();
        research = new javax.swing.JTextField();
        btnmenu = new javax.swing.JButton();
        txtpasswd_user = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        postebox = new javax.swing.JComboBox<>();
        deleteUser1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("C059", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilisateurs/Users256_25013.png"))); // NOI18N
        jLabel1.setText("INFORMATIONS UTILISATEURS !!!");
        jLabel1.setOpaque(true);

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(204, 102, 255));
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOM");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtnom_user.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        txtnom_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnom_user.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                txtnom_userAncestorRemoved(evt);
            }
        });
        txtnom_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnom_userKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MOT DE PASSE");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));

        AddUser.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        AddUser.setText("AJOUTER");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        deleteUser.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        deleteUser.setText("SUPPRIMER");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        updateUser.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        updateUser.setText("MODIFIER");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });

        jLabel8research.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        jLabel8research.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8research.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilisateurs/iamges_users/find_users_applications_search_2908.png"))); // NOI18N
        jLabel8research.setText("RECHERCHER");
        jLabel8research.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        research.setFont(new java.awt.Font("Noto Serif CJK HK Black", 2, 14)); // NOI18N
        research.setForeground(new java.awt.Color(153, 153, 153));
        research.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        research.setText("Rechercher par nom");
        research.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                researchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                researchFocusLost(evt);
            }
        });
        research.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researchActionPerformed(evt);
            }
        });
        research.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                researchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                researchKeyReleased(evt);
            }
        });

        btnmenu.setBackground(new java.awt.Color(204, 204, 204));
        btnmenu.setFont(new java.awt.Font("URW Bookman", 0, 18)); // NOI18N
        btnmenu.setForeground(new java.awt.Color(0, 102, 0));
        btnmenu.setText("MENU");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        txtpasswd_user.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        txtpasswd_user.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POSTE");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        postebox.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        postebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réceptionniste", "Personnel Bar", "Personnel Restaurant", " ", " " }));

        deleteUser1.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        deleteUser1.setText("RETOUR");
        deleteUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(50, 50, 50)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtnom_user, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                .addComponent(txtpasswd_user)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50)
                                            .addComponent(postebox, 0, 206, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel8research, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(research, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnom_user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8research, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(research, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(txtpasswd_user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postebox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(deleteUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1202, 682);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
        // Si l'utilisateur clique sur le bouton "MENUE" , il sera automatiquement renvoyé sur le menue
        utilisateurs.super.dispose();
        Menu m = new Menu();
        m.setVisible(true);

        /* La méthode dispose de la classe clients pour libérer les ressources  utilisés par la fenêtre, notamment la fermer  !!!
        Ensuite, une nouvelle instance de la classe "Menu" est créée et rendue visible avec la ligne
        "Menu m = new Menu(); m.setVisible(true);".
         */
    }//GEN-LAST:event_btnmenuActionPerformed

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        // TODO add your handling code here:

        // BOUTON  AJOUTER
        AddUser(); // description de la méthode un peu plus bas !

    }//GEN-LAST:event_AddUserActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
        // Bouton modifier
        ModifyUser();

    }//GEN-LAST:event_updateUserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        // TODO add your handling code here:
        // Bouton supprimer
        DeleteUser();
    }//GEN-LAST:event_deleteUserActionPerformed

    private void txtnom_userAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtnom_userAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_userAncestorRemoved

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:

        int index = jTable1.getSelectedRow();// index stock l'indice de la ligne sélectionné du tableau !!!
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        txtnom_user.setText(mod.getValueAt(index, 1).toString());
        //txtpasswd_user.setText(mod.getValueAt(index, 2).toString());
        postebox.setSelectedItem(mod.getValueAt(index, 2).toString());

    }//GEN-LAST:event_jTable1MouseReleased

    private void researchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_researchActionPerformed

    private void researchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_researchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Table2();
        }
    }//GEN-LAST:event_researchKeyPressed

    private void researchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_researchFocusGained
        // TODO add your handling code here:
        if (research.getText().equals("Rechercher par nom")) {
            research.setText("");
            research.setForeground(Color.black);
        }
    }//GEN-LAST:event_researchFocusGained

    private void researchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_researchFocusLost
        // TODO add your handling code here:
        if (research.getText().equals("")) {
            research.setText("Rechercher par nom");
            research.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_researchFocusLost

    private void txtnom_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom_userKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpasswd_user.requestFocus();

        }
    }//GEN-LAST:event_txtnom_userKeyPressed

    private void researchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_researchKeyReleased
        // TODO add your handling code here:
        Table2();
    }//GEN-LAST:event_researchKeyReleased

    private void deleteUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUser1ActionPerformed
        // TODO add your handling code here:
       utilisateurs.super.dispose();
       new Login().setVisible(true);
    }//GEN-LAST:event_deleteUser1ActionPerformed

    private void Table2() {
        String[] utilisateurs = {"N°", "NOM", "POSTE"};// tableau string pour afficher le noms des colonnes du Tableau jTable à l'écran
        String[] afficher = new String[4]; // Tableau "afficher" pour servir à stocker les informations de la tableau utilisateurs
        DefaultTableModel mod = new DefaultTableModel(null, utilisateurs);
        String search = research.getText();

        if ("-1".equals(search)) {
            try {

                Statement st = con.createStatement();// variable statement pour intéragir avec la base de donées !!!

                rs = st.executeQuery("SELECT * FROM utilisateurs ORDER BY utilisateur_id DESC;");// on stocke le résultat de la requête dans le resultStatement
                while (rs.next()) {
                    afficher[0] = rs.getString("utilisateur_id");
                    afficher[1] = rs.getString("nom_utilisateur");
                    afficher[2] = rs.getString("poste");
                    afficher[3] = rs.getString("mot_de_passe");

                    mod.addRow(afficher);
                }

                jTable1.setModel(mod);
                //con.close();

            } catch (SQLException e) {
                e.printStackTrace();// Affiche l'erreur retourné dans le terminal si le try n'a pas pu être éxécuté 
                JOptionPane.showMessageDialog(null, " " + e.getMessage());
            }
        } else {

            try {
                pst = con.prepareStatement("SELECT * FROM utilisateurs WHERE nom_utilisateur LIKE ?;");
                pst.setString(1, "%" + search + "%");
                ResultSet rt = pst.executeQuery();

                while (rt.next()) {
                    afficher[0] = rt.getString("utilisateur_id");
                    afficher[1] = rt.getString("nom_utilisateur");
                    afficher[2] = rt.getString("poste");
                    afficher[3] = rt.getString("mot_de_passe");

                    mod.addRow(afficher);
                }
                jTable1.setModel(mod);
            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, " " + e.getMessage());
                e.printStackTrace();

            }
        }

    }

    private void Table() {
        String[] utilisateurs = {"N°", "NOM", "POSTE"};// tableau string pour afficher le noms des colonnes du Tableau jTable à l'écran
        String[] afficher = new String[4]; // Tableau "afficher" pour servir à stocker les informations de la tableau utilisateurs
        DefaultTableModel mod = new DefaultTableModel(null, utilisateurs);

        try {

            Statement st = con.createStatement();// variable statement pour intéragir avec la base de donées !!!

            rs = st.executeQuery("SELECT * FROM utilisateurs");// on stocke le résultat de la requête dans le resultStatement

            while (rs.next()) {
                afficher[0] = rs.getString("utilisateur_id");
                afficher[1] = rs.getString("nom_utilisateur");
                afficher[2] = rs.getString("poste");
                afficher[3] = rs.getString("mot_de_passe");

                mod.addRow(afficher);
            }

            jTable1.setModel(mod);
            //con.close();

        } catch (SQLException e) {
            e.printStackTrace();// Affiche l'erreur retourné dans le terminal si le try n'a pas pu être éxécuté 
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utilisateurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utilisateurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AddUser;
    public javax.swing.JButton btnmenu;
    public javax.swing.JButton deleteUser;
    public javax.swing.JButton deleteUser1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel8research;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> postebox;
    public javax.swing.JTextField research;
    private javax.swing.JTextField txtnom_user;
    private javax.swing.JPasswordField txtpasswd_user;
    public javax.swing.JButton updateUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void AddUser() {

        username = txtnom_user.getText();
        passwd = txtpasswd_user.getText();
        try {
            pst = con.prepareStatement("INSERT INTO utilisateurs VALUES(null, ?, ?, ?)");
            pst.setString(1, username);
            pst.setString(2, passwd);
            pst.setString(3, postebox.getSelectedItem().toString());
            if ("".equals(username) || "".equals(passwd)) {
                JOptionPane.showMessageDialog(null, "\n Informations incomplètes");

            } else {
                pst.executeUpdate();// Pour éxécuter la requête sql .
                Table();
                JOptionPane.showMessageDialog(null, "\n Votre utilisaateur " + username + " a été  bien ajouté.e");
                //affiche une boîte de dialogue avec le message "VOTRE CLIENT A BIEN ÉTÉ AJOUTÉ !" pour indiquer que l'opération a réussi
                txtnom_user.setText("");
                txtpasswd_user.setText("");
                pst.close();
                con.close();
            }
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, " Action echouée \n" + e.getMessage());
        }

    }

    @Override
    public void DeleteUser() {
        int index = jTable1.getSelectedRow();// index stock l'indice de la ligne sélectionné du tableau !!!
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "\n Veuillez d'abord sélectionner un utilisateur !");
            System.out.println("" + index);
        } else {
            DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
            int id = Integer.parseInt(mod.getValueAt(index, 0).toString());
            username = txtnom_user.getText();
            int dialogResult = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer cette donnée ?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    pst = con.prepareStatement("DELETE FROM  utilisateurs WHERE utilisateur_id = ?");
                    pst.setInt(1, id);
                    pst.executeUpdate();// Pour éxécuter la requête sql.
                    pst = con.prepareStatement("ALTER TABLE utilisateurs AUTO_INCREMENT = 0;");
                    pst.executeUpdate();
                    Table();
                    JOptionPane.showMessageDialog(null, "\n VOTRE UTILISATEUR " + username + " A BIEN ÉTÉ SUPPRIMÉ !");
                    txtnom_user.setText("");
                    txtpasswd_user.setText("");
                    pst.close();
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, " " + e.getMessage());
                }
            }
        }
    }

    @Override
    public void ModifyUser() {

        int index = jTable1.getSelectedRow();// index stock l'indice de la ligne sélectionné du tableau !!!
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
        int id = Integer.parseInt(mod.getValueAt(index, 0).toString());

        try {

            pst = con.prepareStatement("UPDATE utilisateurs SET nom_utilisateur = ?, mot_de_passe = ?, poste = ? WHERE utilisateur_id = ?");

            if (index < 1) {
                JOptionPane.showMessageDialog(null, "\n Veuillez d'abord sélectionner un utilisateur !");
            } else {
                pst.setString(1, txtnom_user.getText());
                pst.setString(2, txtpasswd_user.getText());
                pst.setString(3, postebox.getSelectedItem().toString());
                pst.setInt(4, id);
                pst.executeUpdate();// Pour éxécuter la requête sql .
                pst.close();

                Table();
                JOptionPane.showMessageDialog(null, "\n VOTRE UTILISATEUR A BIEN ÉTÉ MODIFIÉ !");
                txtnom_user.setText("");
                txtpasswd_user.setText("");

            }
            con.close();// referme la base donnée !

        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }
    }
}