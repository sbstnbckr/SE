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
public class AlleKurse {
    private static AlleKurse einzigesExemplar ;
    private static ArrayList<Kurs> kurs;
    
    private AlleKurse(){
    kurs=new ArrayList();}
    
    public static AlleKurse exemplar() {
        if (einzigesExemplar==null) {
            einzigesExemplar=new AlleKurse(); 
        }
        return einzigesExemplar;
        
    } 
    public void addKurs(Kurs neuerkurs) {
        kurs.add(neuerkurs);
    }
    
    
    public static Kurs getKurs(int kursnr){
        for ( ListIterator<Kurs> iterator =kurs.listIterator(); iterator.hasNext(); ){
        Kurs kurs = iterator.next();
        if (kurs.getKursnummer()==kursnr){
            return kurs;
                   
        }
        
    }
    return null;
    }
}
