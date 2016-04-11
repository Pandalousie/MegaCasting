/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classname;

/**
 *
 * @author AJOURD
 */
public class Connexion {
    private String Email;
    private String Mdp;

    public Connexion(String Email, String Mdp) {
        this.Email = Email;
        this.Mdp = Mdp;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String Mdp) {
        this.Mdp = Mdp;
    }
    
    
}
