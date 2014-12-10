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
public class DoorsTest {
    
    public DoorsTest() {
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
     * Test of getPosition method, of class Doors.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Doors instance = new Doors();
        DoorsEnum expResult = DoorsEnum.FERME;
        DoorsEnum result = instance.getPosition();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDoorsPosition method, of class Doors.
     */
    @Test
    public void testSetDoorsPosition() {
        System.out.println("setDoorsPosition");
        DoorsEnum newDoorsPosition = DoorsEnum.OUVERT ;
        Doors instance = new Doors();
        instance.setDoorsPosition(newDoorsPosition);
    }

    /**
     * Test of mouvPorte method, of class Doors.
     */
    @Test
    public void testMouvPorte() {
        System.out.println("mouvPorte");
        Handle manette = new Handle();
        manette.setPosition(HandleEnum.BAS);
        Wheels roue = new Wheels();
        roue.setEtat(WheelsEnum.RENTRE);
        Doors instance = new Doors();
        DoorsEnum expResult = DoorsEnum.OUVERT;
        DoorsEnum result = instance.mouvPorte(manette, roue);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMouvPorte2() {
        System.out.println("mouvPorte");
        Handle manette = new Handle();
        manette.setPosition(HandleEnum.BAS);
        Wheels roue = new Wheels();
        roue.setEtat(WheelsEnum.SORTI);
        Doors instance = new Doors();
        instance.setDoorsPosition(DoorsEnum.OUVERT);
        DoorsEnum expResult = DoorsEnum.FERME;
        DoorsEnum result = instance.mouvPorte(manette, roue);
        assertEquals(expResult, result);
    }
    @Test
    public void testMouvPorte3() {
        System.out.println("mouvPorte");
        Handle manette = new Handle();
        manette.setPosition(HandleEnum.BAS);
        Wheels roue = new Wheels();
        roue.setEtat(WheelsEnum.SORTI);
        Doors instance = new Doors();
        instance.setDoorsPosition(DoorsEnum.FERME);
        DoorsEnum expResult = DoorsEnum.FERME;
        DoorsEnum result = instance.mouvPorte(manette, roue);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMouvPorte4() {
        System.out.println("mouvPorte");
        Handle manette = new Handle();
        manette.setPosition(HandleEnum.HAUT);
        Wheels roue = new Wheels();
        roue.setEtat(WheelsEnum.RENTRE);
        Doors instance = new Doors();
        instance.setDoorsPosition(DoorsEnum.FERME);
        DoorsEnum expResult = DoorsEnum.FERME;
        DoorsEnum result = instance.mouvPorte(manette, roue);
        assertEquals(expResult, result);
    }
    
}
