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
public class OffreCasting {
    private int Id;
    private String Intitule;
    private String Reference;
    private String DateDebutPublication;
    private String DateDebutContrat;
    private int DureeDiffusion;
    private int NombreDePoste;
    private String Location;
    private String DescriptionPoste;
    private String DescriptionProfil;
    private String Coordonne;
    private int TypeContratId;
    private int FichesMetiersId;

    public OffreCasting(int Id, String Intitule, String Reference, String DateDebutPublication, String DateDebutContrat, int DureeDiffusion, int NombreDePoste, String Location, String DescriptionPoste, String DescriptionProfil, String Coordonne, int TypeContratId, int FichesMetiersId) {
        this.Id = Id;
        this.Intitule = Intitule;
        this.Reference = Reference;
        this.DateDebutPublication = DateDebutPublication;
        this.DateDebutContrat = DateDebutContrat;
        this.DureeDiffusion = DureeDiffusion;
        this.NombreDePoste = NombreDePoste;
        this.Location = Location;
        this.DescriptionPoste = DescriptionPoste;
        this.DescriptionProfil = DescriptionProfil;
        this.Coordonne = Coordonne;
        this.TypeContratId = TypeContratId;
        this.FichesMetiersId = FichesMetiersId;
    }

    public OffreCasting(String Intitule, String Reference, String DateDebutPublication, String DateDebutContrat, int DureeDiffusion, int NombreDePoste, String Location, String DescriptionPoste, String Coordonne, int TypeContratId, int FichesMetiersId) {
        this.Intitule = Intitule;
        this.Reference = Reference;
        this.DateDebutPublication = DateDebutPublication;
        this.DateDebutContrat = DateDebutContrat;
        this.DureeDiffusion = DureeDiffusion;
        this.NombreDePoste = NombreDePoste;
        this.Location = Location;
        this.DescriptionPoste = DescriptionPoste;
        this.Coordonne = Coordonne;
        this.TypeContratId = TypeContratId;
        this.FichesMetiersId = FichesMetiersId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String Intitule) {
        this.Intitule = Intitule;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public String getDateDebutPublication() {
        return DateDebutPublication;
    }

    public void setDateDebutPublication(String DateDebutPublication) {
        this.DateDebutPublication = DateDebutPublication;
    }

    public String getDateDebutContrat() {
        return DateDebutContrat;
    }

    public void setDateDebutContrat(String DateDebutContrat) {
        this.DateDebutContrat = DateDebutContrat;
    }

    public int getDureeDiffusion() {
        return DureeDiffusion;
    }

    public void setDureeDiffusion(int DureeDiffusion) {
        this.DureeDiffusion = DureeDiffusion;
    }

    public int getNombreDePoste() {
        return NombreDePoste;
    }

    public void setNombreDePoste(int NombreDePoste) {
        this.NombreDePoste = NombreDePoste;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDescriptionPoste() {
        return DescriptionPoste;
    }

    public void setDescriptionPoste(String DescriptionPoste) {
        this.DescriptionPoste = DescriptionPoste;
    }

    public String getDescriptionProfil() {
        return DescriptionProfil;
    }

    public void setDescriptionProfil(String DescriptionProfil) {
        this.DescriptionProfil = DescriptionProfil;
    }

    public String getCoordonne() {
        return Coordonne;
    }

    public void setCoordonne(String Coordonne) {
        this.Coordonne = Coordonne;
    }

    public int getTypeContratId() {
        return TypeContratId;
    }

    public void setTypeContratId(int TypeContratId) {
        this.TypeContratId = TypeContratId;
    }

    public int getFichesMetiersId() {
        return FichesMetiersId;
    }

    public void setFichesMetiersId(int FichesMetiersId) {
        this.FichesMetiersId = FichesMetiersId;
    }

    

    
}

