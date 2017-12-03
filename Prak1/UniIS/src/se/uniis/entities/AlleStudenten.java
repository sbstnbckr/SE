/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */

 package se.uniis.entities;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class AlleStudenten {
    private static AlleStudenten einzigesExemplar ;
    private static ArrayList<Student> student;
    
    private AlleStudenten(){
    student=new ArrayList();}
    
    public static AlleStudenten exemplar() {
        if (einzigesExemplar==null) {
            einzigesExemplar=new AlleStudenten(); 
        }
        return einzigesExemplar;
        
    } 
    
    public void addStudent(Student neuerStudent){
        student.add(neuerStudent);
    }
    
}
