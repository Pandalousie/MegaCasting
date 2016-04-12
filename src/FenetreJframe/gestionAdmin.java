/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FenetreJframe;

import classDAO.AdministrateurDAO;
import classname.Administrateur;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import megacasting.Bdd;

/**
 *
 * @author AJOURD
 */
public class gestionAdmin extends javax.swing.JFrame {

    /**
     * Creates new form gestionAdmin
     */
    public gestionAdmin() {
        initComponents();
        Connection cn;
        Collection<Administrateur> admin = new ArrayList();
        try{
            cn = Bdd.open();
            AdministrateurDAO.RemplirTableAdmin(cn, admin);
            // Entête de colonne
            String[] entetes = {"Id", "Nom", "Prenom", "Email", "Date Inscription", "Attribution Droit"};

            // Créer le modèle
            DefaultTableModel modele = new DefaultTableModel( null, entetes);
            
            for (Administrateur test : admin){
                modele.addRow(new Object[] {test.getId(), test.getNom(), test.getPrenom(), test.getEmail(), test.getDateInscription(), test.getAttributionDroitId()});
                System.out.println(test.getNom());
            }

            // Appliquer le modèle au JTable
            jTable1.setModel(modele);
            
        } catch (ClassNotFoundException ex){
            Logger.getLogger(MegaCasting.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(MegaCasting.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnActualiser = new javax.swing.JButton();
        LblIdentifiant = new javax.swing.JLabel();
        LblEmail = new javax.swing.JLabel();
        InputIdentifiant = new javax.swing.JTextField();
        InputEmail = new javax.swing.JTextField();
        LblNom = new javax.swing.JLabel();
        InputNom = new javax.swing.JTextField();
        LblPrenom = new javax.swing.JLabel();
        InputPrenom = new javax.swing.JTextField();
        LblAttributionDroit = new javax.swing.JLabel();
        InputAttributionDroit = new javax.swing.JTextField();
        BtnMettreAJour = new javax.swing.JButton();
        BtnAjoutAdmin = new javax.swing.JButton();
        BtnSuppAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Email", "Nom", "Prenom", "Date Inscritpion", "Attribution Droit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnActualiser.setText("ACTUALISER LA LISTE");

        LblIdentifiant.setText("Identifiant :");

        LblEmail.setText("Email : ");

        LblNom.setText("Nom :");

        LblPrenom.setText("Prenom :");

        LblAttributionDroit.setText("Attribution droit :");

        BtnMettreAJour.setBackground(new java.awt.Color(0, 255, 0));
        BtnMettreAJour.setForeground(new java.awt.Color(0, 204, 0));
        BtnMettreAJour.setText("Mettre à jour");

        BtnAjoutAdmin.setBackground(new java.awt.Color(0, 0, 255));
        BtnAjoutAdmin.setForeground(new java.awt.Color(0, 0, 255));
        BtnAjoutAdmin.setText("Ajouter Admin");

        BtnSuppAdmin.setBackground(new java.awt.Color(255, 0, 0));
        BtnSuppAdmin.setForeground(new java.awt.Color(255, 0, 0));
        BtnSuppAdmin.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(BtnActualiser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblIdentifiant)
                    .addComponent(LblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InputEmail)
                    .addComponent(InputIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblPrenom)
                        .addGap(18, 18, 18)
                        .addComponent(InputPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblNom)
                        .addGap(33, 33, 33)
                        .addComponent(InputNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblAttributionDroit)
                        .addGap(18, 18, 18)
                        .addComponent(InputAttributionDroit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnAjoutAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(BtnMettreAJour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSuppAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIdentifiant)
                    .addComponent(InputIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNom)
                    .addComponent(InputNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblAttributionDroit)
                    .addComponent(InputAttributionDroit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMettreAJour)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEmail)
                            .addComponent(InputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPrenom)
                            .addComponent(InputPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAjoutAdmin))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BtnSuppAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualiser;
    private javax.swing.JButton BtnAjoutAdmin;
    private javax.swing.JButton BtnMettreAJour;
    private javax.swing.JButton BtnSuppAdmin;
    private javax.swing.JTextField InputAttributionDroit;
    private javax.swing.JTextField InputEmail;
    private javax.swing.JTextField InputIdentifiant;
    private javax.swing.JTextField InputNom;
    private javax.swing.JTextField InputPrenom;
    private javax.swing.JLabel LblAttributionDroit;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblIdentifiant;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblPrenom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
