/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classname;

import java.sql.Date;

/**
 *
 * @author AJOURD
 */
public class Client {
    private int Id;
    private String Email;
    private String MotDePasse;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String CodePostal;
    private String Ville;
    private String RaisonSocial;
    private String DescriptionRaisonSocial;
    private String Siret;
    private Date DateInscription;
    private String ImageUrl;
    private String SiteUrl;
    private int OffresPacksCasting;
    private int AttributionDroitId;

    public Client(int Id, String Email, String MotDePasse, String Nom, String Prenom, String Adresse, String CodePostal, String Ville, String RaisonSocial, String DescriptionRaisonSocial, String Siret, Date DateInscription, String ImageUrl, String SiteUrl, int OffresPacksCasting, int AttributionDroitId) {
        this.Id = Id;
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.CodePostal = CodePostal;
        this.Ville = Ville;
        this.RaisonSocial = RaisonSocial;
        this.DescriptionRaisonSocial = DescriptionRaisonSocial;
        this.Siret = Siret;
        this.DateInscription = DateInscription;
        this.ImageUrl = ImageUrl;
        this.SiteUrl = SiteUrl;
        this.OffresPacksCasting = OffresPacksCasting;
        this.AttributionDroitId = AttributionDroitId;
    }

    public Client(String Email, String MotDePasse, String Nom, String Prenom, String Adresse, String CodePostal, String Ville, String RaisonSocial, String DescriptionRaisonSocial, String Siret, Date DateInscription, int OffresPacksCasting, int AttributionDroitId) {
        this.Email = Email;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.CodePostal = CodePostal;
        this.Ville = Ville;
        this.RaisonSocial = RaisonSocial;
        this.DescriptionRaisonSocial = DescriptionRaisonSocial;
        this.Siret = Siret;
        this.DateInscription = DateInscription;
        this.OffresPacksCasting = OffresPacksCasting;
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

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public String getRaisonSocial() {
        return RaisonSocial;
    }

    public void setRaisonSocial(String RaisonSocial) {
        this.RaisonSocial = RaisonSocial;
    }

    public String getDescriptionRaisonSocial() {
        return DescriptionRaisonSocial;
    }

    public void setDescriptionRaisonSocial(String DescriptionRaisonSocial) {
        this.DescriptionRaisonSocial = DescriptionRaisonSocial;
    }

    public String getSiret() {
        return Siret;
    }

    public void setSiret(String Siret) {
        this.Siret = Siret;
    }

    public Date getDateInscription() {
        return DateInscription;
    }

    public void setDateInscription(Date DateInscription) {
        this.DateInscription = DateInscription;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public String getSiteUrl() {
        return SiteUrl;
    }

    public void setSiteUrl(String SiteUrl) {
        this.SiteUrl = SiteUrl;
    }

    public int getOffresPacksCasting() {
        return OffresPacksCasting;
    }

    public void setOffresPacksCasting(int OffresPacksCasting) {
        this.OffresPacksCasting = OffresPacksCasting;
    }

    public int getAttributionDroitId() {
        return AttributionDroitId;
    }

    public void setAttributionDroitId(int AttributionDroitId) {
        this.AttributionDroitId = AttributionDroitId;
    }
    
    
}
