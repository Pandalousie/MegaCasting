/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classDAO;

import FenetreJframe.Index;
import classname.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author AJOURD
 */
public class ConnexionDAO {
    public static void connexion(Connection cn, Connexion login) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT Id FROM Administrateur WHERE Email = '" + login.getEmail() + "' AND MotDePasse = '" + login.getMdp() + "'");
        
        int i = 0;
        if (rs.next()){
            i = rs.getInt("Id");
        }
        if (i == 0){
            javax.swing.JOptionPane.showMessageDialog(null, "Mot de Passe ou Email Invalide");
        }else {
            Index index = new Index();
            index.setVisible(true);
            
        }
    }
}
