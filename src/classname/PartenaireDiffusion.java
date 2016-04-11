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
public class PartenaireDiffusion {
    private int Id;
    private String Email;
    private String MotDePasse;
    private String Nom;
    private String Prenom;
    private String RaisonSocial;
    private int AttributionDroitId;

    public PartenaireDiffusion(int Id, String Email, String MotDePasse, String Nom, String Prenom, String RaisonSocial, int AttributionDroitId) {
        this.Id = Id;
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.RaisonSocial = RaisonSocial;
        this.AttributionDroitId = AttributionDroitId;
    }

    public PartenaireDiffusion(String Email, String MotDePasse, String Nom, String Prenom, String RaisonSocial, int AttributionDroitId) {
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.RaisonSocial = RaisonSocial;
        this.AttributionDroitId = AttributionDroitId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setMotDePasse(String MotDePasse) {
        this.MotDePasse = MotDePasse;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getRaisonSocial() {
        return RaisonSocial;
    }

    public void setRaisonSocial(String RaisonSocial) {
        this.RaisonSocial = RaisonSocial;
    }

    public int getAttributionDroitId() {
        return AttributionDroitId;
    }

    public void setAttributionDroitId(int AttributionDroitId) {
        this.AttributionDroitId = AttributionDroitId;
    }
    
    
}
