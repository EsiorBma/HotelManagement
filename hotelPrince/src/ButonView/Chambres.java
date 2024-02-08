/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ButonView;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static DataBase.ConnectionBd.*;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author prince
 */
public class Chambres extends javax.swing.JInternalFrame {

    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form Chambres
     */
    public Chambres() {
        initComponents();
        Connect();
        Table();
        txt_etat.setEditable(false);
        remove_title_bar();
        coloumnWidth();
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
        txt_telChambre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddRoom = new javax.swing.JButton();
        DeleteRoom = new javax.swing.JButton();
        Update_room = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        roomSearch = new javax.swing.JTextField();
        txt_type = new javax.swing.JComboBox<>();
        txt_situation = new javax.swing.JComboBox<>();
        txt_carac = new javax.swing.JComboBox<>();
        PrintRoomList = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_etat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_tarif = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 229, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 600));

        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("C059", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clients/yellow_double-room_icon-icons.com_59563.png"))); // NOI18N
        jLabel1.setText("INFORMATIONS SUR LES CHAMBRES!!!");
        jLabel1.setOpaque(true);

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(153, 153, 153));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txt_telChambre.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        txt_telChambre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_telChambre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_telChambreKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TELEPHONE");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SITUATION");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TYPE");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CARACTÉRISTIQUE");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddRoom.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        AddRoom.setText("AJOUTER");
        AddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomActionPerformed(evt);
            }
        });

        DeleteRoom.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        DeleteRoom.setText("SUPPRIMER");
        DeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRoomActionPerformed(evt);
            }
        });

        Update_room.setFont(new java.awt.Font("P052", 0, 18)); // NOI18N
        Update_room.setText("MODIFIER");
        Update_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_roomActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chambre/room_img/analysis_analytics_magnifier_search_locate_magnifyng_glass_icon_153884.png"))); // NOI18N
        jLabel8.setText("RECHERCHER");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        roomSearch.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        roomSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        roomSearch.setToolTipText("type,situation,tarif");
        roomSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roomSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                roomSearchKeyReleased(evt);
            }
        });

        txt_type.setFont(new java.awt.Font("P052", 1, 18)); // NOI18N
        txt_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unique", "Double", "Triple", "Quadruple", "Autres..." }));
        txt_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_typeActionPerformed(evt);
            }
        });

        txt_situation.setFont(new java.awt.Font("P052", 1, 18)); // NOI18N
        txt_situation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intérieur", "à vue de mer", "vue de jardin", "vue de rue", "vue de montagne" }));

        txt_carac.setFont(new java.awt.Font("P052", 1, 18)); // NOI18N
        txt_carac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventilées", "Climatisées", "" }));

        PrintRoomList.setFont(new java.awt.Font("URW Bookman", 0, 18)); // NOI18N
        PrintRoomList.setForeground(new java.awt.Color(0, 51, 102));
        PrintRoomList.setIcon(new javax.swing.ImageIcon("/home/prince/Téléchargements/3925426-print-printer-printing-icon_111556.png")); // NOI18N
        PrintRoomList.setText("Print");
        PrintRoomList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintRoomListActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ETAT");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_etat.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        txt_etat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_etat.setText("Libre");

        jLabel9.setFont(new java.awt.Font("Noto Serif CJK TC Black", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TARIF");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_tarif.setFont(new java.awt.Font("Noto Serif CJK HK Black", 0, 14)); // NOI18N
        txt_tarif.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txt_telChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_type, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_situation, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_carac, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tarif, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(roomSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Update_room)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txt_etat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PrintRoomList, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_telChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_type, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txt_situation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txt_carac, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(txt_tarif, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(roomSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_etat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintRoomList, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_room, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void remove_title_bar(){
        putClientProperty("Clients.isPalette",Boolean.TRUE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
    }
    public void coloumnWidth() {
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(18);
        columnModel.getColumn(1).setPreferredWidth(82);
        columnModel.getColumn(2).setPreferredWidth(63);
        columnModel.getColumn(3).setPreferredWidth(80);
        columnModel.getColumn(4).setPreferredWidth(81);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(6).setPreferredWidth(70);
    }
    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();// index stock l'indice de la ligne sélectionné du tableau !!!
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();

        txt_telChambre.setText(mod.getValueAt(index, 1).toString());
        txt_type.setSelectedItem(mod.getValueAt(index, 2).toString());
        txt_situation.setSelectedItem(mod.getValueAt(index, 3).toString());
        txt_carac.setSelectedItem(mod.getValueAt(index, 4).toString());
        txt_tarif.setText(mod.getValueAt(index, 5).toString());
        txt_etat.setText(mod.getValueAt(index, 6).toString());

    }//GEN-LAST:event_jTable1MouseReleased

    private void txt_telChambreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telChambreKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_type.requestFocus();

        }
    }//GEN-LAST:event_txt_telChambreKeyPressed

    private void AddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomActionPerformed
        // TODO add your handling code here:

        String chambre_tel = txt_telChambre.getText();
        String chambre_type = txt_type.getSelectedItem().toString();
        String chambre_situation = txt_situation.getSelectedItem().toString();
        String chambre_carac = txt_carac.getSelectedItem().toString();
        String chambre_tarif = txt_tarif.getText();

        if (txt_telChambre.getText().length() > 18) {
            JOptionPane.showMessageDialog(null, "Le numéro de téléphone doit comporter au maximum 18 chiffres.");
            return; // Annuler l'insertion
        } else if ("".equals(chambre_tel) && "".equals(chambre_tarif)) {

            JOptionPane.showMessageDialog(null, "\n Informations incomplètes !");

        } else {

            try {

                pst = con.prepareStatement("INSERT INTO chambres VALUES (null, ?, ?, ?, ?, ?, 'Libre');");
                pst.setString(1, chambre_tel);
                pst.setString(2, chambre_type);
                pst.setString(3, chambre_situation);
                pst.setString(4, chambre_carac);
                pst.setString(5, chambre_tarif);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "\n Chambre ajoutée avec succès !");
                Table();
                pst.close();
                txt_telChambre.setText("");
                txt_tarif.setText("");
                txt_type.setSelectedItem(null);
                txt_situation.setSelectedItem(null);
                txt_carac.setSelectedItem(null);

            } catch (HeadlessException | SQLException e) {

                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erreur: " + e.getMessage());

            }
        }
    }//GEN-LAST:event_AddRoomActionPerformed

    private void DeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRoomActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();// index stock l'indice de la ligne sélectionné du tableau !!!
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Veuillez d'abord sélectionner une chambre !");
        } else {
            int id = Integer.parseInt(mod.getValueAt(index, 0).toString());

            try {
                Connect();
                pst = con.prepareStatement("DELETE FROM chambres WHERE chambre_id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();
                pst = con.prepareStatement("ALTER TABLE chambres AUTO_INCREMENT = 0;");
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "\n Chambre supprimée !");
                Table();
                pst.close();

                txt_telChambre.setText("");
                txt_tarif.setText("");
                txt_type.setSelectedItem(null);
                txt_situation.setSelectedItem(null);
                txt_carac.setSelectedItem(null);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " " + e.getMessage());
            }
        }
    }//GEN-LAST:event_DeleteRoomActionPerformed

    private void Update_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_roomActionPerformed
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();// index stock l'indice de la ligne sélectionné du tableau !!!
        DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Veuilez d'abord sélectionner une chambre !");
        } else {
            int id = Integer.parseInt(mod.getValueAt(index, 0).toString());
            try {
                Connect();

                pst = con.prepareStatement("UPDATE chambres SET  tel_chambre = ?, type = ?,situation = ?, caracteristique = ? , tarif = ?  WHERE chambre_id = ? ;");

                pst.setString(1, txt_telChambre.getText());
                pst.setString(2, txt_type.getSelectedItem().toString());
                pst.setString(3, txt_situation.getSelectedItem().toString());
                pst.setString(4, txt_carac.getSelectedItem().toString());
                pst.setString(5, txt_tarif.getText());
                pst.setInt(6, id);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "MODIFICATION RÉUSSIE !!!");
                Table();
                txt_telChambre.setText("");
                txt_tarif.setText("");
                txt_type.setSelectedItem(null);
                txt_situation.setSelectedItem(null);
                txt_carac.setSelectedItem(null);

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erreur: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_Update_roomActionPerformed

    private void roomSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomSearchKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_roomSearchKeyPressed

    private void txt_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_typeActionPerformed

    private void PrintRoomListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintRoomListActionPerformed
        // TODO add your handling code here:
//        MessageFormat header = new MessageFormat(" \n Liste des chambres: \n");
//        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
//        try {
//            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
//            set.add(OrientationRequested.PORTRAIT);
//            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
//            JOptionPane.showMessageDialog(null, "\n Printed successfully !");
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "\n Erreur d'impression \n" + e.getMessage());
//            e.printStackTrace();
//
//        }

        try {
            JasperDesign jdesign = JRXmlLoader.load("/home/prince/hotelReports/liste_chambre.jrxml");
            JasperReport ireport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jPrint = JasperFillManager.fillReport(ireport, null, con);
            JasperViewer.viewReport(jPrint, false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_PrintRoomListActionPerformed

    private void roomSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomSearchKeyReleased
        // TODO add your handling code here:
        Table2();
    }//GEN-LAST:event_roomSearchKeyReleased

    private void Table2() {
        String[] chambres = {"N°", "Téléphone", "Type", "Situation", "Caractéristique", "Tarif", "Etat"};// tableau string pour afficher le noms des colonnes du Tableau jTable à l'écran
        String[] afficher = new String[8];
        String room_search = roomSearch.getText();
        DefaultTableModel mod = new DefaultTableModel(null, chambres);

        if ("-1".equals(room_search)) {
            try {
                Statement st = con.createStatement();
                ResultSet rt = st.executeQuery("SELECT * FROM chambres ORDER BY chambre_id DESC ;");
                while (rt.next()) {
                    afficher[0] = rt.getString("chambre_id");
                    afficher[1] = rt.getString("tel_chambre");
                    afficher[2] = rt.getString("type");
                    afficher[3] = rt.getString("situation");
                    afficher[4] = rt.getString("caracteristique");
                    afficher[5] = rt.getString("tarif");
                    afficher[6] = rt.getString("etat");

                    mod.addRow(afficher);
                }
                jTable1.setModel(mod);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Oups \n" + e.getMessage(), "Error", JOptionPane.OK_OPTION);
                e.printStackTrace();
            }

        } else {

            try {
                pst = con.prepareStatement("SELECT * FROM chambres WHERE (type LIKE ?) OR (caracteristique LIKE ?) OR (tarif LIKE ?) OR (etat LIKE ?);");

                for (int i = 1; i <= 4; i++) {
                    pst.setString(i, "%" + room_search + "%");
                }
                ResultSet rt = pst.executeQuery();
                while (rt.next()) {
                    afficher[0] = rt.getString("chambre_id");
                    afficher[1] = rt.getString("tel_chambre");
                    afficher[2] = rt.getString("type");
                    afficher[3] = rt.getString("situation");
                    afficher[4] = rt.getString("caracteristique");
                    afficher[5] = rt.getString("tarif");
                    afficher[6] = rt.getString("etat");

                    mod.addRow(afficher);
                }
                jTable1.setModel(mod);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erreur lors de la recherche des chambres : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
        }
    }

    private void Table() {
        String[] chambres = {"N°", "Téléphone", "Type", "Situation", "Caractéristique", "Tarif", "Etat"};// tableau string pour afficher le noms des colonnes du Tableau jTable à l'écran
        String[] afficher = new String[8]; // Tableau "afficher" pour servir à stocker les informations de la tableau utilisateurs
        DefaultTableModel mod = new DefaultTableModel(null, chambres);

        try {
            Connect();
            Statement st = con.createStatement();// variable statement pour intéragir avec la base de donées !!!

            rs = st.executeQuery("SELECT * FROM chambres");// on stocke le résultat de la requête dans le resultStatement

            while (rs.next()) {
                afficher[0] = rs.getString("chambre_id");
                afficher[1] = rs.getString("tel_chambre");
                afficher[2] = rs.getString("type");
                afficher[3] = rs.getString("situation");
                afficher[4] = rs.getString("caracteristique");
                afficher[5] = rs.getString("tarif");
                afficher[6] = rs.getString("etat");

                mod.addRow(afficher);
            }

            jTable1.setModel(mod);
            //con.close();

        } catch (Exception e) {
            e.printStackTrace();// Affiche l'erreur retourné dans le terminal si le try n'a pas pu être éxécuté 
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton AddRoom;
    private javax.swing.JButton DeleteRoom;
    private javax.swing.JButton PrintRoomList;
    private javax.swing.JButton Update_room;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField roomSearch;
    private javax.swing.JComboBox<String> txt_carac;
    private javax.swing.JTextField txt_etat;
    private javax.swing.JComboBox<String> txt_situation;
    private javax.swing.JTextField txt_tarif;
    private javax.swing.JTextField txt_telChambre;
    private javax.swing.JComboBox<String> txt_type;
    // End of variables declaration//GEN-END:variables
}