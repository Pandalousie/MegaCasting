/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classDAO;

import FenetreJframe.Index;
import classname.Administrateur;
import classname.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import javax.swing.JFrame;

/**
 *
 * @author AJOURD
 */
public class ConnexionDAO {
    public static void connexion(Connection cn, Administrateur admin) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM Administrateur WHERE Email = '" + admin.getEmail() + "' AND MotDePasse = '" + admin.getMotDePasse()+ "'");
        
        if (rs.next()){
            admin.setId(rs.getInt("id"));
            admin.setEmail(rs.getString("Email"));
            admin.setMotDePasse(rs.getString("MotDePasse"));
            admin.setNom(rs.getString("Nom"));
            admin.setPrenom(rs.getString("Prenom"));
            admin.setPrenom(rs.getString("DateInscription"));
            admin.setId(rs.getInt("AttributionDroit_id"));
            
        }else{
             javax.swing.JOptionPane.showMessageDialog(null, "Mot de Passe ou Email Invalide");
        }
        Index index = new Index(admin);
        index.setVisible(true);
    }
}
