/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.uniis.entities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author User
 */
public class AlleAnmeldungen {
    private static AlleAnmeldungen einzigesExemplar ;
    private static ArrayList<Anmeldung> anmeldung;
    
    private AlleAnmeldungen(){
    anmeldung=new ArrayList();}
    
    public static AlleAnmeldungen exemplar() {
        if (einzigesExemplar==null) {
            einzigesExemplar=new AlleAnmeldungen(); 
        }
        return einzigesExemplar;
        
    } 
   /* public ArrayList<Anmeldung> suchen(int matrikelnummer) {
        ArrayList<Anmeldung> alle=new ArrayList();
    
        for (Iterator<Anmeldung> iterator = anmeldung.iterator()  ;iterator.hasNext();){
       if (.matrikelnummer==matrikelnummer) {
                
    
        }*/
       
    public static void  addAnmeldung(Anmeldung neue) {
          anmeldung.add(neue);
      }
    
    public static void  deleteAnmeldung(Anmeldung alt){
        anmeldung.remove(alt);
        
    }
    
    public static Anmeldung getAnmeldung(Student s,Kurs k){
        for ( ListIterator<Anmeldung> iterator =anmeldung.listIterator(); iterator.hasNext(); ){
        Anmeldung anmeldung = iterator.next();
        if (anmeldung.getBelegt()==s&&anmeldung.getZu()==k){
            return anmeldung;
        }
        }
        return null;
    }
    
    
    
}
