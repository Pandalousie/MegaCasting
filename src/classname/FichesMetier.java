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
public class FichesMetier {
    private int Id;
    private String Nom;
    private String DescriptionMetier;
    private int Renumeration;
    private String ImageUrl;
    private String CursusFormation;
    private int DomaineMetierId;

    public FichesMetier(int Id, String Nom, String DescriptionMetier, int Renumeration, String ImageUrl, String CursusFormation, int DomaineMetierId) {
        this.Id = Id;
        this.Nom = Nom;
        this.DescriptionMetier = DescriptionMetier;
        this.Renumeration = Renumeration;
        this.ImageUrl = ImageUrl;
        this.CursusFormation = CursusFormation;
        this.DomaineMetierId = DomaineMetierId;
    }

    public FichesMetier(String Nom, String DescriptionMetier, int Renumeration, String CursusFormation, int DomaineMetierId) {
        this.Nom = Nom;
        this.DescriptionMetier = DescriptionMetier;
        this.Renumeration = Renumeration;
        this.CursusFormation = CursusFormation;
        this.DomaineMetierId = DomaineMetierId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getDescriptionMetier() {
        return DescriptionMetier;
    }

    public void setDescriptionMetier(String DescriptionMetier) {
        this.DescriptionMetier = DescriptionMetier;
    }

    public int getRenumeration() {
        return Renumeration;
    }

    public void setRenumeration(int Renumeration) {
        this.Renumeration = Renumeration;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public String getCursusFormation() {
        return CursusFormation;
    }

    public void setCursusFormation(String CursusFormation) {
        this.CursusFormation = CursusFormation;
    }

    public int getDomaineMetierId() {
        return DomaineMetierId;
    }

    public void setDomaineMetierId(int DomaineMetierId) {
        this.DomaineMetierId = DomaineMetierId;
    }
    
    
}
