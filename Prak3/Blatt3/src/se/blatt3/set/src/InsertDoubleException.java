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
public class InsertDoubleException extends Exception {
    
    InsertDoubleException(){
        super();
    }
    
    public String getMessage(){
        return("InsertDoubleException");
    }
}
