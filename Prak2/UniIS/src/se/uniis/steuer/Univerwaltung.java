/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.uniis.steuer;




/**
 *
 * @author User
 */
import se.uniis.entities.*;
import se.uniis.grenz.Pruefungsschein;
public class Univerwaltung {
    
    public static Pruefungsschein pruefungRegistrieren(int kursnr,int matrikelnr){
      
        AlleStudenten.exemplar();
        Student student=AlleStudenten.getStudent(matrikelnr);
        
        AlleKurse.exemplar();
        Kurs kurs=AlleKurse.getKurs(kursnr);
        
        AlleAnmeldungen.exemplar();
        Anmeldung anmeldung= AlleAnmeldungen.getAnmeldung(student,kurs);
        
        AllePruefungen.exemplar();
        Pruefung pruefung= new Pruefung(student,kurs);
        pruefung.setDatum("08.12.2014");
        pruefung.setNote(2.0);
        pruefung.setMeldungsnummer(215);
        AllePruefungen.addPruefung(pruefung);
        
        kurs.addPruefung(pruefung);
  
        student.addPruefung(pruefung);
        
        Pruefungsschein schein=new Pruefungsschein(231,"08.12.2014", 2.0, 215);
        
        AlleAnmeldungen.deleteAnmeldung(anmeldung);
        kurs.removeAnmeldung(anmeldung);
        student.revomeAnmeldung(anmeldung);
        
        return schein;
        
  
    }
    
}
