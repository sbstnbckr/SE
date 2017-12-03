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
public class Anmeldung {
    
     private Student belegt;
     private Kurs zu;

    public Student getBelegt() {
        return belegt;
    }

    public Kurs getZu() {
        return zu;
    }
        
    
    public Anmeldung(Student belegt,Kurs zu) {
        this.belegt=belegt;
        this.zu = zu;
    }
     
}
