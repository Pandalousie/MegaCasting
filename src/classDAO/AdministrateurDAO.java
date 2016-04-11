/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classDAO;

import FenetreJframe.Index;
import classname.Administrateur;
import classname.Administrateur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AJOURD
 */
public class AdministrateurDAO {
     public static void connexion(Connection cn, Administrateur admin) throws ClassNotFoundException, SQLException{
        Statement statement = cn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM Administrateur");
         System.out.println(rs);
        admin.setEmail(null);
        int i = 0;
        if (rs.next()){
            
        }
        
        if (i == 0){
            javax.swing.JOptionPane.showMessageDialog(null, "Mot de Passe ou Email Invalide");
        }else {
            Index index = new Index();
            index.setVisible(true);
            
        }
    }
}
