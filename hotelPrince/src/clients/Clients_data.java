/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clients;


/**
 *
 * @author prince
 */
public class Clients_data {
    private clients c;
    private String nom = c.txtnom.getText();
    private String prenom = c.txtprenom.getText();
    private String telephone = c.txttel.getText();
    private String[] nationalite = new String[200];
    private String[] categorie = new String[4];

    public Clients_data(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public clients getC() {
        return c;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String[] getNationalite() {
        return nationalite;
    }

    public String[] getCategorie() {
        return categorie;
    }

    public void setC(clients c) {
        this.c = c;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNationalite(String[] nationalite) {
        this.nationalite = nationalite;
    }

    public void setCategorie(String[] categorie) {
        this.categorie = categorie;
    }

    
}
