/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

/**
 *
 * @author prince
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionBd {

   public static Connection con;

    public ConnectionBd() {

      
    }
    
    public static Connection Connect(){
       try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelManagement", "root", "");
            System.out.println("Connection réussie");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "\n Connection échouée" + e.getMessage());
        }
       return con;
    }
}
