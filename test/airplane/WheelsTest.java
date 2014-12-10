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
public class WheelsTest {
    
    public WheelsTest() {
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
     * Test of getEtat method, of class Wheels.
     */
    @Test
    public void testGetEtat() {
        System.out.println("getEtat");
        Wheels instance = new Wheels();
        WheelsEnum expResult = WheelsEnum.RENTRE;
        WheelsEnum result = instance.getEtat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEtat method, of class Wheels.
     */
    @Test
    public void testSetEtat() {
        System.out.println("setEtat");
        WheelsEnum etat = WheelsEnum.RENTRE;
        Wheels instance = new Wheels();
        instance.setEtat(etat);
    }
}
