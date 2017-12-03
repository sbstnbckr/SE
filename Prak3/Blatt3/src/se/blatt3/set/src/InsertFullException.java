/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.blatt3.set.src;

/**
 *
 * @author sebastian
 */
public class InsertFullException extends Exception {
    
    InsertFullException(){
        super();
    }
    
    public String getMessage(){
        return("InsertFullException");
    }
}
