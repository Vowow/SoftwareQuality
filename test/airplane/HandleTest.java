/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin1
 */
public class HandleTest {
    
    public HandleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPosition method, of class Handle.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Handle instance = new Handle();
        HandleEnum expResult = HandleEnum.HAUT;
        HandleEnum result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPosition method, of class Handle.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        HandleEnum position = HandleEnum.BAS;
        Handle instance = new Handle();
        instance.setPosition(position);
    }
    
}
