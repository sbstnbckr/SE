/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.uniis.entities;
import java.util.ArrayList;


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
    
    public void addPruefung (Pruefung neue ){
        anmeldung.add(neue);
    }
}
    
                
    