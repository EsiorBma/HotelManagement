/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ButonView;

import reservation.*;
import static DataBase.ConnectionBd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prince
 */
public class Abstract_reservation1 {

    PreparedStatement pst;
    PreparedStatement ps;
    ResultSet rs;
    ReservationModel rm = new ReservationModel();
    private JTable jTable2;

    /*reservation r = new reservation();
    rm.idCli  = r.txtclient.getText();
    rm.idCh  = r.txtchambre.getText();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    rm.date_arrive  = dateFormat.format(r.date_ariv.getDate());
    rm.date_depart  = dateFormat.format(r.date_dep.getDate());*/
    public Abstract_reservation1() {
        this.jTable2 = new JTable();

    }

    public void addReservation(String id_client, String id_chambre, String date_arrive, String date_depart, JTable MyjTable) {
        /*id_cli = rm.idCli;
        id_ch = rm.idCh;
        date_arriv = rm.getDate_arrive();
        date_dep = rm.getDate_depart();*/
 /*id_client = "";
        id_chambre = "";
        date_arrive = "";
        date_depart = "";*/

        if ("".equals(id_client) || "".equals(id_chambre) /*|| date_arrive == null || date_depart == null*/) {
            JOptionPane.showMessageDialog(null, "\n Informations incomplètes");

        } else {
            try {
                pst = con.prepareStatement("INSERT INTO reservations VALUES(null,?, ?, ?, ?);");
                

                pst.setString(1, id_client);
                pst.setString(2, id_chambre);
                pst.setString(3, date_arrive);
                pst.setString(4, date_depart);
                
                pst.executeUpdate();// Pour éxécuter la requête sql .
                
                ps = con.prepareStatement("UPDATE chambres SET etat = 'Réservée' WHERE chambre_id = ? ;");
                ps.setString(1, id_chambre);
                ps.executeUpdate();// Pour éxécuter la requête sql .

                Table(MyjTable);// Ajouter les données dans la Table
                JOptionPane.showMessageDialog(null, "\n Opération éfectuée avec succès !");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " Action echouée \n" + e.getMessage());
            }
        }

    }

    public void DeleteReservation(int id, JTable MyjTable, int id_chambre) {

        try {
            pst = con.prepareStatement("DELETE FROM  reservations WHERE reservation_id = ? ;");

            pst.setInt(1, id);
            pst.executeUpdate();// Pour éxécuter la requête sql.
            pst = con.prepareStatement("ALTER TABLE reservations AUTO_INCREMENT = 0;");
            pst.executeUpdate();
            ps = con.prepareStatement("UPDATE chambres SET etat = 'Libre' WHERE chambre_id = ? ;");
            ps.setInt(1, id_chambre);
            ps.executeUpdate();// Pour éxécuter la requête sql .
            Table(MyjTable);// Ajouter les données dans la Table
            JOptionPane.showMessageDialog(null, "\n  Suppression réussie !!!");

            pst.close();
            //con.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }

    }

    public void ModifyReservation(int id, String id_client, String id_chambre, String date_arrive, String date_depart, JTable MyjTable) {

        try {

            pst = con.prepareStatement("UPDATE reservations SET client_id = ?, chambre_id = ?, date_arrivee = ?, date_depart = ? WHERE reservation_id = ? ;");

            pst.setString(1, id_client);
            pst.setString(2, id_chambre);
            pst.setString(3, date_arrive);
            pst.setString(4, date_depart);
            pst.setInt(5, id);
            pst.executeUpdate();// Pour éxécuter la requête sql .
            pst.close();

            Table(MyjTable);
            JOptionPane.showMessageDialog(null, "\n Modification réusssie !!!");

            //con.close();// referme la base donnée !
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }

    }

    public void Table(JTable Tableau) {

        String[] reservations = {"Reservation_N°", "Matricule_Client", "Chambre_N°", "Date d'arrivé", "Date de départ"};// tableau string pour afficher le noms des colonnes du Tableau jTable à l'écran
        String[] afficher = new String[5]; // Tableau "afficher" pour servir à stocker les informations de la tableau utilisateurs
        DefaultTableModel mod = new DefaultTableModel(null, reservations);

        try {

            Statement st = con.createStatement();// variable statement pour intéragir avec la base de donées !!!

            rs = st.executeQuery("SELECT * FROM reservations");// on stocke le résultat de la requête dans le resultStatement
            // Formate la date d'arrivée
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            while (rs.next()) {
                afficher[0] = rs.getString("reservation_id");
                afficher[1] = rs.getString("client_id");
                afficher[2] = rs.getString("chambre_id");
                //afficher[3] = rs.getString("date_arrivee");
                afficher[4] = rs.getString("date_depart");
                //formate  la date d'arrivée
                String dateArrivee = sdf.format(rs.getDate("date_arrivee"));
                afficher[3] = dateArrivee;
                //Formate la date de départ 
                String dateDepart = sdf.format(rs.getDate("date_depart"));
                afficher[4] = dateDepart;

              
                mod.addRow(afficher);
            }

            if (Tableau != null) {
                Tableau.setModel(mod);
            } else {
                System.out.println("La variable Tableau est nulle.");
            }

        } catch (SQLException e) {
            e.printStackTrace();// Affiche l'erreur retourné dans le terminal si le try n'a pas pu être éxécuté 
            JOptionPane.showMessageDialog(null, " " + e.getMessage());
        }

    }

}
