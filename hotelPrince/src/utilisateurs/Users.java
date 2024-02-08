/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilisateurs;

/**
 *
 * @author prince
 */
public class Users {
    int id = 0;
    String username, passwd;

    public Users(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
