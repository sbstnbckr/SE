/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.uniis.entities;

/**
 *
 * @author sebastian
 */
public class Pruefung {
    
    private int meldungsnummer;
    private String datum;
    private double note;


    private Student legtab;
    private Kurs in;
    
    public Student getLegtab() {
        return legtab;
    }

    public Kurs getIn() {
        return in;
    }
    
    public int getMeldungsnummer() {
        return meldungsnummer;
    }

    public void setMeldungsnummer(int meldungsnummer) {
        this.meldungsnummer = meldungsnummer;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
    
    public Pruefung (Student legtab, Kurs in) {
        this.legtab= legtab;
        this.in=in;
    }
    
    public Pruefung (Student legtab, Kurs in, String datum, int meldungsnummer, double note) {
        this.legtab= legtab;
        this.in=in;
        this.note=note;
        this.datum=datum;
        this.meldungsnummer=meldungsnummer;
    }
    
}
