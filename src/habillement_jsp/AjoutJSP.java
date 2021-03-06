/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habillement_jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import java.util.*;

/**
 *
 * @author benny
 */
public class AjoutJSP extends javax.swing.JFrame {
    private Connection connection;
    
    DefaultComboBoxModel jourNaissance;
    DefaultComboBoxModel moisNaissance;
    DefaultComboBoxModel anneeNaissance;
    
    DefaultComboBoxModel jourEntree;
    DefaultComboBoxModel moisEntree;
    DefaultComboBoxModel anneeEntree;
    /**
     * Creates new form JSP
     * @param jdbcDriver
     * @param jdbcURL
     */
   // public AjoutJSP(String jdbcDriver, String jdbcURL) {
    public AjoutJSP() {
        initComponents();
        
//        try{
//            Class.forName(jdbcDriver).newInstance();
//            this.connection = DriverManager.getConnection(jdbcURL);
//        } catch(SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
//            System.out.println(e.getMessage());
//        }
        
        /* Pour la date de naissance */
        jourNaissance = new DefaultComboBoxModel();
        moisNaissance = new DefaultComboBoxModel();
        anneeNaissance = new DefaultComboBoxModel();
        
        /* Pour la date d'entrée */
        jourEntree = new DefaultComboBoxModel();
        moisEntree = new DefaultComboBoxModel();
        anneeEntree = new DefaultComboBoxModel();
        
        /* Ajout des jours dans les combos jours */
        jourNaissance.addElement("");
        jourEntree.addElement("");
        for(int i = 1; i <= 31; i++)
        {
            jourNaissance.addElement(i);
            jourEntree.addElement(i);
        }
        Cb_jourNaiss.setModel(jourNaissance);
        Cb_jourEntree.setModel(jourEntree);
        
        /* Ajout des Mois dans les combos Mois */
        moisNaissance.addElement("");
        moisEntree.addElement("");
        for(int i = 1; i <= 12; i++)
        {
            moisNaissance.addElement(i);
            moisEntree.addElement(i);
        }
        Cb_moisNaiss.setModel(moisNaissance);
        Cb_moisEntree.setModel(moisEntree);
        
        /* Ajout des Annees dans les combos Annees */
        int anneeEnCours = Calendar.getInstance().get(Calendar.YEAR);
        int anneeDebut = anneeEnCours - 20;
        
        anneeNaissance.addElement("");
        anneeEntree.addElement("");
        
        for(int i = anneeDebut; i <= anneeEnCours; i++)
        {
            anneeNaissance.addElement(i);
            anneeEntree.addElement(i);
        }
        Cb_anneeNaiss.setModel(anneeNaissance);
        Cb_anneeEntree.setModel(anneeEntree);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lb_titre = new javax.swing.JLabel();
        Lb_prenom = new javax.swing.JLabel();
        Lb_DateNaiss = new javax.swing.JLabel();
        Lb_dateEntree = new javax.swing.JLabel();
        Lb_adresse = new javax.swing.JLabel();
        Lb_Tel = new javax.swing.JLabel();
        Lb_Mail = new javax.swing.JLabel();
        Lb_nom = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb_Adresse = new javax.swing.JTextArea();
        Bt_Annuler = new javax.swing.JButton();
        Bt_Valider = new javax.swing.JButton();
        Tb_nom = new javax.swing.JTextField();
        Tb_prenom = new javax.swing.JTextField();
        Cb_jourNaiss = new javax.swing.JComboBox<>();
        Cb_moisNaiss = new javax.swing.JComboBox<>();
        Cb_anneeNaiss = new javax.swing.JComboBox<>();
        Cb_anneeEntree = new javax.swing.JComboBox<>();
        Cb_moisEntree = new javax.swing.JComboBox<>();
        Cb_jourEntree = new javax.swing.JComboBox<>();
        Tb_Tel = new javax.swing.JTextField();
        Tb_mail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lb_titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lb_titre.setText("JSP");

        Lb_prenom.setText("Prénom :");

        Lb_DateNaiss.setText("Date de naissance :");

        Lb_dateEntree.setText("Date d'entrée :");

        Lb_adresse.setText("Adresse :");

        Lb_Tel.setText("Téléphone :");

        Lb_Mail.setText("Mail : ");

        Lb_nom.setText("Nom :");

        Tb_Adresse.setColumns(20);
        Tb_Adresse.setRows(5);
        jScrollPane1.setViewportView(Tb_Adresse);

        Bt_Annuler.setText("Annuler");
        Bt_Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bt_AnnulerMouseClicked(evt);
            }
        });

        Bt_Valider.setText("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bt_Valider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bt_Annuler))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lb_titre, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_dateEntree)
                        .addGap(39, 39, 39)
                        .addComponent(Cb_jourEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_moisEntree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_anneeEntree, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_DateNaiss)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_jourNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_moisNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_anneeNaiss, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lb_adresse)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_Tel)
                            .addComponent(Lb_Mail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tb_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(Tb_Tel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lb_prenom)
                            .addComponent(Lb_nom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tb_nom)
                            .addComponent(Tb_prenom))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_titre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_nom)
                            .addComponent(Tb_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lb_prenom)
                            .addComponent(Tb_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Lb_DateNaiss))
                    .addComponent(Cb_jourNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_anneeNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_moisNaiss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lb_dateEntree)
                    .addComponent(Cb_jourEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_anneeEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_moisEntree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_adresse)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Tel)
                    .addComponent(Tb_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_Mail)
                    .addComponent(Tb_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Annuler)
                    .addComponent(Bt_Valider)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_AnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bt_AnnulerMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Bt_AnnulerMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutJSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Annuler;
    private javax.swing.JButton Bt_Valider;
    private javax.swing.JComboBox<String> Cb_anneeEntree;
    private javax.swing.JComboBox<String> Cb_anneeNaiss;
    private javax.swing.JComboBox<String> Cb_jourEntree;
    private javax.swing.JComboBox<String> Cb_jourNaiss;
    private javax.swing.JComboBox<String> Cb_moisEntree;
    private javax.swing.JComboBox<String> Cb_moisNaiss;
    private javax.swing.JLabel Lb_DateNaiss;
    private javax.swing.JLabel Lb_Mail;
    private javax.swing.JLabel Lb_Tel;
    private javax.swing.JLabel Lb_adresse;
    private javax.swing.JLabel Lb_dateEntree;
    private javax.swing.JLabel Lb_nom;
    private javax.swing.JLabel Lb_prenom;
    private javax.swing.JLabel Lb_titre;
    private javax.swing.JTextArea Tb_Adresse;
    private javax.swing.JTextField Tb_Tel;
    private javax.swing.JTextField Tb_mail;
    private javax.swing.JTextField Tb_nom;
    private javax.swing.JTextField Tb_prenom;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
