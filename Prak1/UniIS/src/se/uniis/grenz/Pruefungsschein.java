/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.uniis.grenz;

/**
 *
 * @author User
 */
public class Pruefungsschein {
    
    int kursnummer;
    String datum;
    double note;
    int meldungsnummer;

    public Pruefungsschein(int kursnummer, String datum, double note, int meldungsnummer) {
        this.kursnummer = kursnummer;
        this.datum = datum;
        this.note = note;
        this.meldungsnummer = meldungsnummer;
    }
    
    
}
