/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classDAO;

import classname.OffreCasting;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AJOURD
 */
public class offrecastingDAO {
    public static void create(Connection cn, OffreCasting offrecast ) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        statement.executeUpdate(
                "INSERT INTO offrecasting(Intitule, Reference, dateDebutPublication, dateDebutContrat, dureeDiffusion, nombreDePoste, Localisation, DescriptionPoste, DescriptionProfilRecherche, Coordonne)"
                + "VALUES ('" 
                        + offrecast.getIntitule() + "','" 
                        + offrecast.getReference() + "','" 
                        + offrecast.getDateDebutPublication() + "','" 
                        + offrecast.getDateDebutContrat() + "','" 
                        + offrecast.getDureeDiffusion() + "','" 
                        + offrecast.getNombreDePoste() + "','" 
                        + offrecast.getLocation() + "','" 
                        + offrecast.getDescriptionPoste() + "','" 
                        + offrecast.getDescriptionProfil() + "','"
                        + offrecast.getCoordonne() + "')", Statement.RETURN_GENERATED_KEYS);
        
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()){
            offrecast.setId(rs.getInt(1));
        }
        
        statement.close();
    }
}
