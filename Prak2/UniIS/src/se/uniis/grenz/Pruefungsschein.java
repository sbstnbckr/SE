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

    public void setKursnummer(int kursnummer) {
        this.kursnummer = kursnummer;
    }

    public int getKursnummer() {
        return kursnummer;
    }

    public String getDatum() {
        return datum;
    }

    public double getNote() {
        return note;
    }

    public int getMeldungsnummer() {
        return meldungsnummer;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void setMeldungsnummer(int meldungsnummer) {
        this.meldungsnummer = meldungsnummer;
    }

    
    public Pruefungsschein(int kursnummer, String datum, double note, int meldungsnummer) {
        this.kursnummer = kursnummer;
        this.datum = datum;
        this.note = note;
        this.meldungsnummer = meldungsnummer;
    }
    
    
}
