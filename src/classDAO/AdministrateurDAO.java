/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classDAO;

import FenetreJframe.Index;
import classname.Administrateur;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author AJOURD
 */
public class AdministrateurDAO {
    
    
    public static Collection<Administrateur> ListerAdmin(Connection cn) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM administrateur");
        Collection<Administrateur> admin = new ArrayList();
        while(rs.next()){
            admin.add(new Administrateur(rs.getString("Email"), rs.getString("MotDePasse"),  rs.getString("Nom"), rs.getString("Prenom"), rs.getString("DateInscription"),  rs.getInt("AttributionDroit_id")));
        }
        return admin;
    }
    
    public static Collection<Administrateur> RemplirTableAdmin(Connection cn, Collection<Administrateur> admin) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM administrateur");
        while(rs.next()){
            admin.add(new Administrateur(rs.getInt("id"), rs.getString("Email"), rs.getString("MotDePasse"),  rs.getString("Nom"), rs.getString("Prenom"), rs.getString("DateInscription"),rs.getString("ImageUrl"), rs.getInt("AttributionDroit_id")));
        }
        return admin;
    }
    
    public static void MettreAJourAdmin(Connection cn, Administrateur admin) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        statement.executeUpdate("UPDATE administrateur SET Email = '" + admin.getEmail() + "', Nom = '" + admin.getNom() + "', Prenom = '" + admin.getPrenom() + "', AttributionDroit_id = '" + admin.getAttributionDroitId()+ "' WHERE Id = " + admin.getId(), Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        statement.close();
    }
    
    public static void SupprimerAdmin(Connection cn, Administrateur admin) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        statement.executeUpdate("DELETE FROM administrateur WHERE Id = " + admin.getId(), Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        statement.close();
    }
 
}