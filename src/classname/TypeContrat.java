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
public class TypeContrat {
    private int Id;
    private String Nom;

    public TypeContrat(int Id, String Nom) {
        this.Id = Id;
        this.Nom = Nom;
    }

    public TypeContrat(String Nom) {
        this.Nom = Nom;
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
    
    
}
