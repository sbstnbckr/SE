/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.blatt3.set.src;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author sebastian
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Person> Set;
    
    public Set(){
        Set=new ArrayList<Person>();
    }
    
   public  boolean contains (Person e) {
        for ( ListIterator<Person> iterator =Set.listIterator(); iterator.hasNext(); ){
            Person person = iterator.next();
            if (person==e){
                return true;
            }
        }
        return false;
    }
    
    public Person get() throws GetException{
        if (Set.isEmpty()){
            throw new GetException();
        }
        else return(Set.get(0));
        
        
    }
    
    public void delete(Person e)throws DeleteException{
        if (Set.isEmpty()){
            throw new DeleteException();
        }
        else Set.remove(e);
    }
    
    public void insert(Person e) throws InsertFullException, InsertDoubleException{
        if (Set.size()==20){
            throw new InsertFullException();
        }
        for ( ListIterator<Person> iterator =Set.listIterator(); iterator.hasNext(); ){
            Person person = iterator.next();
            if (person==e){
                throw new InsertDoubleException();
            }
        }
        Set.add(e);
    }
    
    public  boolean isEmpty(){
        return(Set.isEmpty());
    }
    
    public Boolean isFull(){
        if (Set.size()==20){
            return true;
        }
        else return false;
        
    }
    
    public void reset(){
        Set.clear();
    }
    
    
    public static void main(String[] args) throws InsertFullException, InsertDoubleException {
        // TODO code application logic here
       /* Set set=new Set();
        Person person=new Person();
        System.out.println("empty: "+set.isEmpty());
        for (int i=0;i<20;i++){
            set.insert(new Person());
        }
        
        System.out.println("empty: "+set.isEmpty());
        System.out.println("full: "+set.isFull());   
       
        try {
            set.insert(person);
        } catch (InsertDoubleException e) {
            System.out.println("Exception: "+e.getMessage());
        } catch (InsertFullException e) {
            System.out.println("Exception: "+e.getMessage());
        }
         System.out.println("contains: "+set.contains(person));
        
     */   
    }
    
}
