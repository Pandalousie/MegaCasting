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
public class Artiste {
    private int Id;
    private String Email;
    private String MotDePasse;
    private String Nom;
    private String Prenom;
    private int Age;
    private String DateInscription;
    private int PermisDeConduire;
    private String ImageUrl;
    private String Cv;
    private int AttributionDroitId;

    public Artiste(int Id, String Email, String MotDePasse, String Nom, String Prenom, int Age, String DateInscription, int PermisDeConduire, String ImageUrl, String Cv, int AttributionDroitId) {
        this.Id = Id;
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.DateInscription = DateInscription;
        this.PermisDeConduire = PermisDeConduire;
        this.ImageUrl = ImageUrl;
        this.Cv = Cv;
        this.AttributionDroitId = AttributionDroitId;
    }

    public Artiste(String Email, String MotDePasse, String Nom, String Prenom, int Age, String DateInscription, int PermisDeConduire, int AttributionDroitId) {
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.DateInscription = DateInscription;
        this.PermisDeConduire = PermisDeConduire;
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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDateInscription() {
        return DateInscription;
    }

    public void setDateInscription(String DateInscription) {
        this.DateInscription = DateInscription;
    }

    public int getPermisDeConduire() {
        return PermisDeConduire;
    }

    public void setPermisDeConduire(int PermisDeConduire) {
        this.PermisDeConduire = PermisDeConduire;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public String getCv() {
        return Cv;
    }

    public void setCv(String Cv) {
        this.Cv = Cv;
    }

    public int getAttributionDroitId() {
        return AttributionDroitId;
    }

    public void setAttributionDroitId(int AttributionDroitId) {
        this.AttributionDroitId = AttributionDroitId;
    }

    
}
