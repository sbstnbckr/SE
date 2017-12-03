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
public class Kurs {
  
    private int kursnummer;
    private String titel;
    private String dozent;
    private ArrayList<Anmeldung> zu;
    private ArrayList<Pruefung> in;
    
    public void addAnmeldung(Anmeldung eineAnmeldung) {
        zu.add(eineAnmeldung);
    }
    
    public void removeAnmeldung(Anmeldung eineAnmeldung) {
        zu.remove(eineAnmeldung);
    }
    
    public void addPruefung(Pruefung einePreufung){
        in.add(einePreufung);
    }
    
    public void removePruefung(Pruefung einePruefung) {
        in.remove(einePruefung);
    }
    
    public Kurs(){
        in=new ArrayList<>();
        zu=new ArrayList<>();
    }

    public Kurs(int kursnummer, String titel, String dozent) {
        this.kursnummer = kursnummer;
        this.titel = titel;
        this.dozent = dozent;
        in= new ArrayList<>();
        zu= new ArrayList<>();
    }
    

    public int getKursnummer() {
        return kursnummer;
    }

    public void setKursnummer(int kursnummer) {
        this.kursnummer = kursnummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDozent() {
        return dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }
    
}
