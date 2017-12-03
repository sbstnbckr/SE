/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import se.blatt3.set.src.*;

/**
 *
 * @author User
 */
@RunWith(Parameterized.class)
public class parametrisierter_test {
    Set meineSet;
    
    Person input,expected;
    
    
    
    public parametrisierter_test(Person input,Person expected) {
        this.input=input;
        this.expected=expected; 
    }
    @Before
    public void setUp() {
        meineSet=new Set();
        meineSet.reset();
    }
   @Parameters
    public static Collection param() {
    Person peter=new Person();
    peter.setName("Peter");
    
    Person klaus=new Person();
    peter.setName("Klaus");
    
    Person jim=new Person();
    peter.setName("Jim");
    
    Person michael=new Person();
    peter.setName("Michael");
    
    Person monika=new Person();
    peter.setName("Monika");
    
    Person sabine=new Person();
    peter.setName("Sabine");
    
    
    return Arrays.asList(new Object[][]{
    {peter,peter},
    {klaus,klaus},
    {jim,jim},
    {michael,michael},
    {monika,monika},
    {sabine,sabine}
        });
    }
    
    @Test
    public void testfall_d() throws InsertFullException, InsertDoubleException, GetException{
        meineSet.insert(input);
        assertEquals(expected,meineSet.get());
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
