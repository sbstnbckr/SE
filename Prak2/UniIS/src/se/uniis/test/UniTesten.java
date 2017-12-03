/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.uniis.test;

/**
 *
 * @author User
 */
import se.uniis.entities.*;
import se.uniis.grenz.Pruefungsschein;
import se.uniis.steuer.Univerwaltung;

public class UniTesten {
    
    public static void main(String args[]){
        Student student=new Student("Köln",1,"Klaus Becker");
        Kurs kurs= new Kurs(1,"SE","Nissen");
        Anmeldung anmeldung=new Anmeldung(student,kurs);
        student.addAnmeldung(anmeldung);
        kurs.addAnmeldung(anmeldung);
        
        Pruefungsschein schein= Univerwaltung.pruefungRegistrieren(1, 1);
        System.out.println("pruefungsschein:");
        System.out.println("Datum: "+schein.getDatum()+
                " Kursnummer: "+schein.getKursnummer()+" Meldungsnummer: "+schein.getMeldungsnummer()+
                " Note: "+schein.getNote());
        
        Pruefung pruefung=AllePruefungen.getPruefung(215);
        System.out.println("Pruefung:");
        System.out.println("Datum: "+pruefung.getDatum()+" Note: "+pruefung.getNote()+" Nummer: "+pruefung.getMeldungsnummer());
        System.out.println("");
        
        System.out.println("Anmeldung: "+AlleAnmeldungen.getAnmeldung(student,kurs));
        
    }
}
