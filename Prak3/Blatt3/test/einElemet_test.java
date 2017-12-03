/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.blatt3.set.src.*;

/**
 *
 * @author User
 */
public class einElemet_test {
    Set meineSet;
    Person p=new Person();
    
    public einElemet_test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws InsertDoubleException, InsertFullException {
        meineSet=new Set();
        meineSet.insert(p);
    }
    
    @Test
    public void testfall_f() throws InsertFullException, InsertDoubleException{
        Person p2=new Person();
        meineSet.insert(p2);
        assertEquals(true,meineSet.contains(p2));
        
    }
    
    @Test
    public void testfall_i() throws DeleteException {
        meineSet.delete(p);
        assertEquals(true,meineSet.isEmpty());
        
    }
    
    @Test
    public void testfall_n () {
        assertEquals(false,meineSet.isEmpty());
        
    }
    @Test
    public void testfall_r(){
        meineSet.reset();
        assertEquals(true,meineSet.isEmpty());
    }
    
    @Test
    public void testfall_t() {
         assertEquals(false,meineSet.isFull());
    }
    @After
    public void tearDown() {
        meineSet.reset();
        meineSet=null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
