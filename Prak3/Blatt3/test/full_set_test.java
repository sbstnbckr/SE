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
public class full_set_test {
        private  Set meineSet;
        private Person p;

    public full_set_test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws InsertFullException, InsertDoubleException {
        meineSet=new Set();
        for(int i=0;i<19;i++){
            meineSet.insert(new Person());
        }
        meineSet.insert(p);
        
    }
    
    @Test(expected=InsertFullException.class)
    public void testfall_b() throws InsertFullException, InsertDoubleException{
        meineSet.insert(new Person());
    }
    
    @Test
    public void testfall_h() throws DeleteException{
        meineSet.delete(p);
        assertEquals(false,meineSet.isFull());
        
    }
    @Test
    public void testfall_k() throws GetException, DeleteException{
        for (int i=0;i<20;i++){
        meineSet.delete(meineSet.get());}
        assertEquals(true,meineSet.isEmpty());
    
    }
        
    @Test
    public void testfall_o(){
        assertEquals(false,meineSet.isEmpty());
    }
    
    @Test
    public void testfall_p(){
        meineSet.reset();
        assertEquals(true,meineSet.isEmpty());
    }
    
    @Test
    public void testfall_u(){
        assertEquals(true,meineSet.isFull());
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
