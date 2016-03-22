/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author benny
 */
public class JSP {

    private String _nom;
    private String _prenom;
    private String _dateNaissance;
    private String _dateEntree;
    private String _adresse;
    private String _mail;
    private String _tel;

    public JSP() {
        _nom = "";
        _prenom = "";
        _dateNaissance = "";
        _dateEntree = "";
        _adresse = "";
        _mail = "";
        _tel = "";
    }

    public JSP(String nom, String prenom, String dateNaiss, String dateEntree, String adresse, String mail, String tel) {
        _nom = nom;
        _prenom = prenom;
        _dateNaissance = dateNaiss;
        _dateEntree = dateEntree;
        _adresse = adresse;
        _mail = mail;
        _tel = tel;
    }

    //************ GETTEUR *****************
    public String getNom() {
        return _nom;
    }

    public String getPrenom() {
        return _prenom;
    }

    public String getDateNaiss() {
        return _dateNaissance;
    }
    
    public String getDateEntree() {
        return _dateEntree;
    }
    
    public String getAdresse() {
        return _adresse;
    }
    
    public String getMail() {
        return _mail;
    }
    
    public String getTel() {
        return _tel;
    }

    //************ SETTEUR *****************
    public void setNom(String pNom) {
       _nom = pNom;
    }

    public void setPrenom(String pPrenom) {
        _prenom = pPrenom;
    }

    public void setDateNaiss(String pDateNaiss) {
        _dateNaissance = pDateNaiss;
    }
    
    public void setDateEntree(String pDateEntree) {
        _dateEntree = pDateEntree;
    }
    
    public void setAdresse(String pAdresse) {
        _adresse = pAdresse;
    }
    
    public void setMail(String pMail) {
        _mail = pMail;
    }
    
    public void setTel(String pTel) {
        _tel = pTel;
    }
}
