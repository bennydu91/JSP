/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package habillement_jsp;

import java.io.IOException;
import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author benny
 */
public class Menu extends javax.swing.JFrame {
    DefaultListModel lstVet;
    DefaultListModel lstNumVetDispo;
    DefaultListModel lstJspDotation;
    
    Properties properties = new Properties();
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        //Probleme sur le getResourceAsStream
        try{
            properties.load(Menu.class.getResourceAsStream("config/config.properties"));
        }catch(IOException e){
            System.out.println("Erreur :"+e.getMessage());
        }
        
        System.out.println(properties.getProperty("jdbc.driver")+"---"+properties.getProperty("jdbc.url"));
        
        //Initialisation de la liste des effets
        lstVet = new DefaultListModel();
        lstVet.addElement("Cote");
        lstVet.addElement("Bottes");
        lstVet.addElement("Casque");
        lstVet.addElement("Gants");
        lstVet.addElement("Parka");
        lstVet.addElement("Cuissarde");
        lstVet.addElement("T-shirt Sport");
        Lst_Vet.setModel(lstVet);
        
        //Initialisation des numéros d'effet disponible
        lstNumVetDispo = new DefaultListModel();
        lstNumVetDispo.addElement("1");
        lstNumVetDispo.addElement("2");
        lstNumVetDispo.addElement("3");
        lstNumVetDispo.addElement("4");
        lstNumVetDispo.addElement("5");
        lstNumVetDispo.addElement("6");
        lstNumVetDispo.addElement("7");
        lstNumVetDispo.addElement("8");
        Lst_NumVetDispo.setModel(lstNumVetDispo);
        
        //Initialisation de la liste des JSPs
        lstJspDotation = new DefaultListModel();
        lstJspDotation.addElement("Bremond");
        lstJspDotation.addElement("Robieux");
        lstJspDotation.addElement("Poirier");
        lstJspDotation.addElement("Giraud");
        lstJspDotation.addElement("Moret");
        lstJspDotation.addElement("Huberdeau");
        lstJspDotation.addElement("Dorval");
        lstJspDotation.addElement("Legendre");
        Lst_JspDotation.setModel(lstJspDotation);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ong_Habillement = new javax.swing.JTabbedPane();
        Pn_Stock = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb_Stock = new javax.swing.JTable();
        Cb_typeVetStock = new javax.swing.JComboBox<>();
        Lb_TypeStock = new javax.swing.JLabel();
        Pn_Mvmt = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lst_Vet = new javax.swing.JList<>();
        Lb_typeVet = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lst_NumVetDispo = new javax.swing.JList<>();
        Lb_NumVet = new javax.swing.JLabel();
        Rb_Dotation = new javax.swing.JRadioButton();
        Rb_Retour = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Lst_JspDotation = new javax.swing.JList<>();
        Lb_JspDotation = new javax.swing.JLabel();
        Pn_AjoutEffet = new javax.swing.JPanel();
        Lb_TypeEffetAjout = new javax.swing.JLabel();
        Lb_NumEffetAjout = new javax.swing.JLabel();
        Lb_TailleAjout = new javax.swing.JLabel();
        Cb_TypeEffetAjout = new javax.swing.JComboBox<>();
        TxtB_NumEffetAjout = new javax.swing.JTextField();
        Cb_TailleAjout = new javax.swing.JComboBox<>();
        Pn_LstEffet = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lst_JspEffet = new javax.swing.JList<>();
        Lb_JspEffet = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Pn_GestJSP = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tb_JSP = new javax.swing.JTable();
        btn_ajoutJsp = new javax.swing.JButton();
        btn_suppJsp = new javax.swing.JButton();
        btn_modifJsp = new javax.swing.JButton();
        Pn_GestEffet = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tb_effet = new javax.swing.JTable();
        Lb_TypeEffet_Gest = new javax.swing.JLabel();
        Cb_typeVetStock_Gest = new javax.swing.JComboBox<>();
        btn_modifJsp1 = new javax.swing.JButton();
        btn_ajoutJsp1 = new javax.swing.JButton();
        btn_suppJsp1 = new javax.swing.JButton();
        Titre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tb_Stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numéro", "Taille", "Statut", "JSP", "Fait par"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tb_Stock);

        Lb_TypeStock.setText("Type :");

        javax.swing.GroupLayout Pn_StockLayout = new javax.swing.GroupLayout(Pn_Stock);
        Pn_Stock.setLayout(Pn_StockLayout);
        Pn_StockLayout.setHorizontalGroup(
            Pn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
            .addGroup(Pn_StockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_TypeStock, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cb_typeVetStock, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pn_StockLayout.setVerticalGroup(
            Pn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_StockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pn_StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_StockLayout.createSequentialGroup()
                        .addComponent(Cb_typeVetStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_StockLayout.createSequentialGroup()
                        .addComponent(Lb_TypeStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ong_Habillement.addTab("Etat du stock", Pn_Stock);

        Lst_Vet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(Lst_Vet);

        Lb_typeVet.setText("Type d'effet  :");

        Lst_NumVetDispo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(Lst_NumVetDispo);

        Lb_NumVet.setText("Numéro :");

        Rb_Dotation.setText("Dotation");
        Rb_Dotation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rb_DotationMouseClicked(evt);
            }
        });

        Rb_Retour.setText("Retour");
        Rb_Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rb_RetourMouseClicked(evt);
            }
        });

        Lst_JspDotation.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(Lst_JspDotation);

        Lb_JspDotation.setText("Jsp :");

        javax.swing.GroupLayout Pn_MvmtLayout = new javax.swing.GroupLayout(Pn_Mvmt);
        Pn_Mvmt.setLayout(Pn_MvmtLayout);
        Pn_MvmtLayout.setHorizontalGroup(
            Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_MvmtLayout.createSequentialGroup()
                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rb_Dotation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rb_Retour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb_typeVet)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_NumVet))
                .addGap(18, 18, 18)
                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_JspDotation, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        Pn_MvmtLayout.setVerticalGroup(
            Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_MvmtLayout.createSequentialGroup()
                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_MvmtLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pn_MvmtLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pn_MvmtLayout.createSequentialGroup()
                                .addComponent(Lb_typeVet, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pn_MvmtLayout.createSequentialGroup()
                                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lb_JspDotation, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lb_NumVet, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Pn_MvmtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pn_MvmtLayout.createSequentialGroup()
                                        .addComponent(Rb_Dotation)
                                        .addGap(18, 18, 18)
                                        .addComponent(Rb_Retour))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Ong_Habillement.addTab("Mouvements", Pn_Mvmt);

        Lb_TypeEffetAjout.setText("Type d'effet : ");

        Lb_NumEffetAjout.setText("Numéro :");

        Lb_TailleAjout.setText("Taille :");

        TxtB_NumEffetAjout.setText("jTextField1");

        javax.swing.GroupLayout Pn_AjoutEffetLayout = new javax.swing.GroupLayout(Pn_AjoutEffet);
        Pn_AjoutEffet.setLayout(Pn_AjoutEffetLayout);
        Pn_AjoutEffetLayout.setHorizontalGroup(
            Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_AjoutEffetLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lb_TailleAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_TypeEffetAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_NumEffetAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtB_NumEffetAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_TypeEffetAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cb_TailleAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(490, Short.MAX_VALUE))
        );
        Pn_AjoutEffetLayout.setVerticalGroup(
            Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_AjoutEffetLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cb_TypeEffetAjout)
                    .addComponent(Lb_TypeEffetAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_NumEffetAjout)
                    .addComponent(TxtB_NumEffetAjout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(Pn_AjoutEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cb_TailleAjout)
                    .addComponent(Lb_TailleAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        Ong_Habillement.addTab("Ajouter un effet", Pn_AjoutEffet);

        Lst_JspEffet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(Lst_JspEffet);

        Lb_JspEffet.setText("JSP :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel1");

        jLabel3.setText("jLabel1");

        jLabel4.setText("jLabel1");

        jLabel5.setText("jLabel1");

        jLabel6.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField1");

        jTextField3.setText("jTextField1");

        jTextField4.setText("jTextField1");

        jTextField5.setText("jTextField1");

        jTextField6.setText("jTextField1");

        javax.swing.GroupLayout Pn_LstEffetLayout = new javax.swing.GroupLayout(Pn_LstEffet);
        Pn_LstEffet.setLayout(Pn_LstEffetLayout);
        Pn_LstEffetLayout.setHorizontalGroup(
            Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_LstEffetLayout.createSequentialGroup()
                .addGroup(Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_LstEffetLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_LstEffetLayout.createSequentialGroup()
                        .addComponent(Lb_JspEffet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pn_LstEffetLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_LstEffetLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_LstEffetLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        Pn_LstEffetLayout.setVerticalGroup(
            Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_LstEffetLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Lb_JspEffet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(Pn_LstEffetLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pn_LstEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Ong_Habillement.addTab("Liste d'effet par JSP", Pn_LstEffet);

        Tb_JSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nom", "Prénom", "Date de naissance", "Date entrée", "Adresse ", "Mail", "Téléphone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(Tb_JSP);

        btn_ajoutJsp.setText("Ajouter");
        btn_ajoutJsp.setMaximumSize(new java.awt.Dimension(88, 31));
        btn_ajoutJsp.setMinimumSize(new java.awt.Dimension(88, 31));
        btn_ajoutJsp.setPreferredSize(new java.awt.Dimension(88, 31));

        btn_suppJsp.setText("Supprimer");

        btn_modifJsp.setText("Modifier");
        btn_modifJsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modifJspMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pn_GestJSPLayout = new javax.swing.GroupLayout(Pn_GestJSP);
        Pn_GestJSP.setLayout(Pn_GestJSPLayout);
        Pn_GestJSPLayout.setHorizontalGroup(
            Pn_GestJSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_GestJSPLayout.createSequentialGroup()
                .addGroup(Pn_GestJSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_GestJSPLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_modifJsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ajoutJsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_suppJsp)))
                .addContainerGap())
        );
        Pn_GestJSPLayout.setVerticalGroup(
            Pn_GestJSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_GestJSPLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_GestJSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajoutJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suppJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_modifJsp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        Ong_Habillement.addTab("Gestion des JSPs", Pn_GestJSP);

        Tb_effet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numéro", "Taille", "Etat", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Tb_effet);

        Lb_TypeEffet_Gest.setText("Type :");

        btn_modifJsp1.setText("Modifier");
        btn_modifJsp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_modifJsp1MouseClicked(evt);
            }
        });

        btn_ajoutJsp1.setText("Ajouter");

        btn_suppJsp1.setText("Supprimer");

        javax.swing.GroupLayout Pn_GestEffetLayout = new javax.swing.GroupLayout(Pn_GestEffet);
        Pn_GestEffet.setLayout(Pn_GestEffetLayout);
        Pn_GestEffetLayout.setHorizontalGroup(
            Pn_GestEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
            .addGroup(Pn_GestEffetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_TypeEffet_Gest, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cb_typeVetStock_Gest, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_GestEffetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_modifJsp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ajoutJsp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_suppJsp1)
                .addContainerGap())
        );
        Pn_GestEffetLayout.setVerticalGroup(
            Pn_GestEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_GestEffetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pn_GestEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cb_typeVetStock_Gest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_GestEffetLayout.createSequentialGroup()
                        .addComponent(Lb_TypeEffet_Gest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_GestEffetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajoutJsp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btn_suppJsp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btn_modifJsp1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        Ong_Habillement.addTab("Gestion des effets", Pn_GestEffet);

        getContentPane().add(Ong_Habillement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 760, 200));

        Titre.setText("Gestionnaire habillement JSP Limours");
        getContentPane().add(Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rb_DotationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rb_DotationMouseClicked
        // TODO add your handling code here:
        if(Rb_Retour.isSelected() == true)
        {
            Rb_Retour.setSelected(false);
        }
    }//GEN-LAST:event_Rb_DotationMouseClicked

    private void Rb_RetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rb_RetourMouseClicked
        // TODO add your handling code here:
        if(Rb_Dotation.isSelected() == true)
        {
            Rb_Dotation.setSelected(false);
        }
    }//GEN-LAST:event_Rb_RetourMouseClicked

    private void btn_modifJspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modifJspMouseClicked
        // TODO add your handling code here:
       // new AjoutJSP(properties.getProperty("jdbc.driver"),properties.getProperty("jdbc.url")).setVisible(true);
    }//GEN-LAST:event_btn_modifJspMouseClicked

    private void btn_modifJsp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modifJsp1MouseClicked
        // TODO add your handling code here:
       // new AjoutEffet(properties.getProperty("jdbc.driver"),properties.getProperty("jdbc.url")).setVisible(true);
    }//GEN-LAST:event_btn_modifJsp1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_TailleAjout;
    private javax.swing.JComboBox<String> Cb_TypeEffetAjout;
    private javax.swing.JComboBox<String> Cb_typeVetStock;
    private javax.swing.JComboBox<String> Cb_typeVetStock_Gest;
    private javax.swing.JLabel Lb_JspDotation;
    private javax.swing.JLabel Lb_JspEffet;
    private javax.swing.JLabel Lb_NumEffetAjout;
    private javax.swing.JLabel Lb_NumVet;
    private javax.swing.JLabel Lb_TailleAjout;
    private javax.swing.JLabel Lb_TypeEffetAjout;
    private javax.swing.JLabel Lb_TypeEffet_Gest;
    private javax.swing.JLabel Lb_TypeStock;
    private javax.swing.JLabel Lb_typeVet;
    private javax.swing.JList<String> Lst_JspDotation;
    private javax.swing.JList<String> Lst_JspEffet;
    private javax.swing.JList<String> Lst_NumVetDispo;
    private javax.swing.JList<String> Lst_Vet;
    private javax.swing.JTabbedPane Ong_Habillement;
    private javax.swing.JPanel Pn_AjoutEffet;
    private javax.swing.JPanel Pn_GestEffet;
    private javax.swing.JPanel Pn_GestJSP;
    private javax.swing.JPanel Pn_LstEffet;
    private javax.swing.JPanel Pn_Mvmt;
    private javax.swing.JPanel Pn_Stock;
    private javax.swing.JRadioButton Rb_Dotation;
    private javax.swing.JRadioButton Rb_Retour;
    private javax.swing.JTable Tb_JSP;
    private javax.swing.JTable Tb_Stock;
    private javax.swing.JTable Tb_effet;
    private javax.swing.JLabel Titre;
    private javax.swing.JTextField TxtB_NumEffetAjout;
    private javax.swing.JButton btn_ajoutJsp;
    private javax.swing.JButton btn_ajoutJsp1;
    private javax.swing.JButton btn_modifJsp;
    private javax.swing.JButton btn_modifJsp1;
    private javax.swing.JButton btn_suppJsp;
    private javax.swing.JButton btn_suppJsp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}

