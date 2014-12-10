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
public class LightsTest {
    
    public LightsTest() {
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
     * Test of getColor method, of class Lights.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Lights instance = new Lights();
        LightsEnum expResult = LightsEnum.ETEINT;
        LightsEnum result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColor method, of class Lights.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        LightsEnum newCol = LightsEnum.VERT;
        Lights instance = new Lights();
        instance.setColor(newCol);
    }

    /**
     * Test of animLights method, of class Lights.
     */
    @Test
    public void testAnimLights() {
        System.out.println("animLights");
        Handle manette = new Handle();
        manette.setPosition(HandleEnum.BAS);
        Wheels roue1 = new Wheels();
        Wheels roue2 = new Wheels();
        Wheels roue3 = new Wheels();
        Doors porte1 = new Doors();
        Doors porte2 = new Doors();
        Doors porte3 = new Doors();
        Lights instance = new Lights();
        LightsEnum expResult = LightsEnum.ORANGE;
        LightsEnum result = instance.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3);
        assertEquals(expResult, result);
    }
    
}
