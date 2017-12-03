/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.uniis.entities;
import java.util.ArrayList;
import java.util.ListIterator;


/**
 *
 * @author User
 */
public class AllePruefungen {
    private static AllePruefungen einzigesExemplar ;
    private static ArrayList<Pruefung> anmeldung;
    
    private AllePruefungen(){
    anmeldung=new ArrayList();}
    
    public static AllePruefungen exemplar() {
        if (einzigesExemplar==null) {
            einzigesExemplar=new AllePruefungen(); 
        }
        return einzigesExemplar;
        
    }
    
    public static void addPruefung (Pruefung neue ){
        anmeldung.add(neue);
    }
    
     public static Pruefung getPruefung(int meldungsnr){
        for ( ListIterator<Pruefung> iterator =anmeldung.listIterator(); iterator.hasNext(); ){
        Pruefung anmeldung = iterator.next();
        if (anmeldung.getMeldungsnummer()==meldungsnr){
            return anmeldung;
        }
        }
        return null;
    }
}
    
                
    