/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.uniis.entities;
import java.util.ArrayList;


/**
 *
 * @author sebastian
 */
public class Student {
    private String name;
    private int matrikelnummer;   
    private String anschrift;
 
    private static ArrayList<Anmeldung> belegt; 
    private static ArrayList<Pruefung> legtab;
    
    

   
    public static void addAnmeldung (Anmeldung eineAnmeldung) {
        belegt.add(eineAnmeldung);
    }
    
    public static void revomeAnmeldung  (Anmeldung eineAnmeldung) {
        belegt.remove(eineAnmeldung);
    }
    
    public static void addPruefung (Pruefung einePruefung) {
        legtab.add(einePruefung);
    }
    
    public static void removePruefung (Pruefung einePruefung) {
        legtab.add(einePruefung);
    }
    
    public Student() {
        belegt= new ArrayList<>();
        legtab=new ArrayList<>();
    }
    
    public Student (String anschrift, int nummer, String name) {
        belegt= new ArrayList<>();
        legtab=new ArrayList<>();
        this.anschrift=anschrift;
        this.matrikelnummer=nummer;
        this.name=name;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getAnschrift() {
        return anschrift;
    }
   

    
    
    
    
}
