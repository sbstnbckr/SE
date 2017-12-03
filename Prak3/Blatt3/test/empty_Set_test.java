/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import se.blatt3.set.src.*;

/**
 *
 * @author User
 */
public class empty_Set_test {
    private  Set meineSet;
    
    public empty_Set_test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        meineSet= new Set();
        meineSet.reset();
    }
    
    @Test(expected = GetException.class)
    public void testfall_a() throws GetException{
        meineSet.get();
    }
     
    @Test(expected=DeleteException.class)
    public void testfall_c() throws DeleteException{
        meineSet.delete(new Person());
    
}
    @Test
    public void testfall_e() throws InsertFullException, InsertDoubleException{
        Person p=new Person();
        meineSet.insert(p);
        
        assertEquals(true,meineSet.contains(p));
    }
    
    @Test
    public void testfall_l() throws InsertFullException, InsertDoubleException {
        for (int i=0;i<20;i++){
            meineSet.insert(new Person());
        }
        assertEquals(true,meineSet.isFull());
    }
    
    @Test
    public void testfall_m() {
        assertEquals(true,meineSet.isEmpty());
    }
    
    @Test
    public void testfall_q(){
       meineSet.reset();
       assertEquals(true,meineSet.isEmpty());
       
    }
    
    @Test
    public void testfall_s(){
               assertEquals(false,meineSet.isFull());

    }
    
    @Test
    public void testfall_j(){
        assertEquals(true,meineSet.isEmpty());
    }
    
    @Test(expected=InsertDoubleException.class)
    public void testfall_g() throws InsertFullException, InsertDoubleException{
        Person p2=new Person();
        meineSet.insert(p2);
        meineSet.insert(p2);
        
        
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
