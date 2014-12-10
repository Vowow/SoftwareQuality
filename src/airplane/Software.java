/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Martin LEGRIS
 * @author Sacha MASSON
 */

/** Manages the differents operations and interactions between Doors, Handle, Lights and Wheels */
public class Software {

    private Lights voyant = new Lights();
    private Wheels roue1 = new Wheels();
    private Wheels roue2 = new Wheels();
    private Wheels roue3 = new Wheels();
    private Doors porte1 = new Doors();
    private Doors porte2 = new Doors();
    private Doors porte3 = new Doors();
    private final int waitTime = 3000;

    /**
     *
     * @param manette
     * @param vue
     * @return
     */
    public boolean doSoft(Handle manette, View vue) {
        try {
            //on ouvre les portes
            porte1.mouvPorte(manette, roue1);
            porte2.mouvPorte(manette, roue2);
            porte3.mouvPorte(manette, roue3);
            vue.log("Porte ouverte \n");
            vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
            //on met les roues en mouvement
            roue1.mouvRoue(porte1, manette);
            roue2.mouvRoue(porte2, manette);
            roue3.mouvRoue(porte3, manette);
            vue.log("Roue en mouvement \n");
            vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
            
            //Simulation du temps de déploiement/rétractaion des roues
            Timer timer = new Timer(waitTime, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    //on sorte ou on rentre les roues
                    roue1.mouvRoue(porte1, manette);
                    roue2.mouvRoue(porte2, manette);
                    roue3.mouvRoue(porte3, manette);
                    //console log
                    if (roue1.getEtat() == WheelsEnum.RENTRE && roue2.getEtat() == WheelsEnum.RENTRE && roue3.getEtat() == WheelsEnum.RENTRE) {
                        vue.log("Roues Rentrées \n");
                    }
                    if (roue1.getEtat() == WheelsEnum.SORTI && roue2.getEtat() == WheelsEnum.SORTI && roue3.getEtat() == WheelsEnum.SORTI) {
                        vue.log("Roues Sorties \n");
                    }
                    //on fermes les portes
                    porte1.mouvPorte(manette, roue1);
                    porte2.mouvPorte(manette, roue2);
                    porte3.mouvPorte(manette, roue3);
                    vue.log("Porte fermées \n");
                    //console log
                    if (roue1.getEtat() == WheelsEnum.RENTRE && roue2.getEtat() == WheelsEnum.RENTRE && roue3.getEtat() == WheelsEnum.RENTRE) {
                        vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
                        vue.log("\nROUES RENTREES \n");
                    }
                    if (roue1.getEtat() == WheelsEnum.SORTI && roue2.getEtat() == WheelsEnum.SORTI && roue3.getEtat() == WheelsEnum.SORTI) {
                        vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
                        vue.log("\nROUES SORTIES \n");
                    }
                }
            });
            timer.setRepeats(false);
            timer.start();
            
            vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
            return true;
        } catch (Exception e) {
            vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
            return false;
        }

    }

}
