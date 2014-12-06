/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import airplane.Doors;
import airplane.DoorsEnum;
import airplane.Handle;
import airplane.HandleEnum;
import airplane.Lights;
import airplane.LightsEnum;
import airplane.Wheels;
import airplane.WheelsEnum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
* @author Martin LEGRIS
* @author Sacha MASSON
 */
public class TestAP {

    Handle manette = new Handle();
    Doors porte1 = new Doors();
    Doors porte2 = new Doors();
    Doors porte3 = new Doors();
    Wheels roue1 = new Wheels();
    Wheels roue2 = new Wheels();
    Wheels roue3 = new Wheels(); 
    Lights voyant = new Lights();
    

    public TestAP() {
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
    
    /**************************
     * Test des roues         *
     **************************/
    @Test
    public void testWheelMouv() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.BAS);
<<<<<<< HEAD
        Assert.assertEquals(WheelsEnum.MOUVEMENT, roue1.mouvRoue(porte1, manette));
=======
        Assert.assertEquals(WheelsEnum.MOUVEMENT, roue1.MouvRoue(porte1, manette));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    }

    @Test
    public void testWheelMouv2() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);
<<<<<<< HEAD
        Assert.assertEquals(WheelsEnum.MOUVEMENT, roue1.mouvRoue(porte1, manette));
=======
        Assert.assertEquals(WheelsEnum.MOUVEMENT, roue1.MouvRoue(porte1, manette));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    }

    @Test
    public void testWheelMouv3() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.MOUVEMENT);
<<<<<<< HEAD
        Assert.assertEquals(WheelsEnum.RENTRE, roue1.mouvRoue(porte1, manette));
=======
        Assert.assertEquals(WheelsEnum.RENTRE, roue1.MouvRoue(porte1, manette));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    }

    @Test
    public void testWheelMouv4() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.BAS);
        roue1.setEtat(WheelsEnum.MOUVEMENT);
<<<<<<< HEAD
        Assert.assertEquals(WheelsEnum.SORTI, roue1.mouvRoue(porte1, manette));
=======
        Assert.assertEquals(WheelsEnum.SORTI, roue1.MouvRoue(porte1, manette));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    }

    @Test
    public void testWheelExpectedError() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);
<<<<<<< HEAD
        Assert.assertEquals(null, roue1.mouvRoue(porte1, manette));
=======
        Assert.assertEquals(null, roue1.MouvRoue(porte1, manette));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    }

    /**************************
     * Test des portes        *
     **************************/
    @Test
    public void testPortes() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.BAS);
        roue1.setEtat(WheelsEnum.MOUVEMENT);
<<<<<<< HEAD
        Assert.assertEquals(null, porte1.mouvPorte(manette, roue1));
=======
        Assert.assertEquals(null, porte1.MouvPorte(manette, roue1));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
    }

    @Test
    public void testPortes2() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);
<<<<<<< HEAD
        Assert.assertEquals(DoorsEnum.OUVERT, porte1.mouvPorte(manette, roue1));
=======
        Assert.assertEquals(DoorsEnum.OUVERT, porte1.MouvPorte(manette, roue1));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
    }

    @Test
    public void testPortes3() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);
<<<<<<< HEAD
        Assert.assertEquals(DoorsEnum.OUVERT, porte1.mouvPorte(manette, roue1));
=======
        Assert.assertEquals(DoorsEnum.OUVERT, porte1.MouvPorte(manette, roue1));
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
    }
    
    /**************************
     * Test des voyants       *
     **************************/
    @Test
    public void testLight1() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        porte2.setDoorsPosition(DoorsEnum.FERME);
        porte3.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.BAS);
        roue1.setEtat(WheelsEnum.SORTI);
        roue2.setEtat(WheelsEnum.SORTI);
        roue3.setEtat(WheelsEnum.SORTI);
        Assert.assertEquals(LightsEnum.VERT, voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
    }


}
