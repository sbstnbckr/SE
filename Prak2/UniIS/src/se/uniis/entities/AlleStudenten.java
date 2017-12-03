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
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
    
    public static  Student getStudent(int matrikelnr){
        for ( ListIterator<Student> iterator =student.listIterator(); iterator.hasNext(); ){
        Student student = iterator.next();
        if (student.getMatrikelnummer()==matrikelnr){
            return student;
                   
        }
        
    }
    return null;
    }     
    }

    
    

