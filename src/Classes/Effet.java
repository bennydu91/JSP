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
public class Effet {
    private String _taille;
    private String _etat;
    private Boolean _dispo;
    
    public Effet(){
        _taille = "";
        _etat = "";
        _dispo = true;
    }
    
    public Effet(String taille, String etat, Boolean dispo){
        _taille = taille;
        _etat = etat;
        _dispo = dispo;
    }
    
    //************ GETTEUR *****************
    public String getTaille() {
        return _taille;
    }

    public String getEtat() {
        return _etat;
    }

    public Boolean getDispo() {
        return _dispo;
    }
    
    //************ SETTEUR *****************
    public void setTaille(String pTaille) {
       _taille = pTaille;
    }

    public void setEtat(String pEtat) {
        _etat = pEtat;
    }

    public void setDispo(Boolean pDispo) {
        _dispo = pDispo;
    }
}
