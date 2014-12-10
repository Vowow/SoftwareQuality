package airplane;

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
import airplane.Software;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
* @author Martin LEGRIS
* @author Sacha MASSON
 */
public class ScenarioTest {
    Software soft = new Software();
    Handle manette = new Handle();
    Doors porte1 = new Doors();
    Doors porte2 = new Doors();
    Doors porte3 = new Doors();
    Wheels roue1 = new Wheels();
    Wheels roue2 = new Wheels();
    Wheels roue3 = new Wheels(); 
    Lights voyant = new Lights();
    

    public ScenarioTest() {
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

        Assert.assertEquals(WheelsEnum.MOUVEMENT, roue1.mouvRoue(porte1, manette));

    }

    @Test
    public void testWheelMouv2() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);

        Assert.assertEquals(WheelsEnum.MOUVEMENT, roue1.mouvRoue(porte1, manette));


    }

    @Test
    public void testWheelMouv3() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.MOUVEMENT);

        Assert.assertEquals(WheelsEnum.RENTRE, roue1.mouvRoue(porte1, manette));


    }

    @Test
    public void testWheelMouv4() {
        porte1.setDoorsPosition(DoorsEnum.OUVERT);
        manette.setPosition(HandleEnum.BAS);
        roue1.setEtat(WheelsEnum.MOUVEMENT);

        Assert.assertEquals(WheelsEnum.SORTI, roue1.mouvRoue(porte1, manette));


    }

    @Test
    public void testWheelExpectedError() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);

        Assert.assertEquals(null, roue1.mouvRoue(porte1, manette));

    }

    /**************************
     * Test des portes        *
     **************************/
    @Test
    public void testPortes() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.BAS);
        roue1.setEtat(WheelsEnum.MOUVEMENT);

        Assert.assertEquals(null, porte1.mouvPorte(manette, roue1));

    }

    @Test
    public void testPortes2() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);

        Assert.assertEquals(DoorsEnum.OUVERT, porte1.mouvPorte(manette, roue1));

    }

    @Test
    public void testPortes3() {
        porte1.setDoorsPosition(DoorsEnum.FERME);
        manette.setPosition(HandleEnum.HAUT);
        roue1.setEtat(WheelsEnum.SORTI);

        Assert.assertEquals(DoorsEnum.OUVERT, porte1.mouvPorte(manette, roue1));

    }
}
