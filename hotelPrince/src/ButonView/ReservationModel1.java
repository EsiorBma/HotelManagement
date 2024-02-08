/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ButonView;

import reservation.*;

/**
 *
 * @author prince
 */
public class ReservationModel1 {
    
    String idCli, idCh;
    String date_arrive, date_depart;

    public ReservationModel1() {
    }

    public String getIdCli() {
        return idCli;
    }

    public String getIdCh() {
        return idCh;
    }

    public String getDate_arrive() {
        return date_arrive;
    }

    public String getDate_depart() {
        return date_depart;
    }

    public void setIdCli(String idCli) {
        this.idCli = idCli;
    }

    public void setIdCh(String idCh) {
        this.idCh = idCh;
    }

    public void setDate_arrive(String date_arrive) {
        this.date_arrive = date_arrive;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }
    
}
