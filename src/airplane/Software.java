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
public class Software {

    Lights voyant = new Lights();
    Wheels roue1 = new Wheels();
    Wheels roue2 = new Wheels();
    Wheels roue3 = new Wheels();
    Doors porte1 = new Doors();
    Doors porte2 = new Doors();
    Doors porte3 = new Doors();

    public boolean Software(Handle manette, View vue) {
        try {
            //on ouvre les portes
            porte1.MouvPorte(manette, roue1);
            porte2.MouvPorte(manette, roue2);
            porte3.MouvPorte(manette, roue3);
            vue.log("Porte ouverte \n");
            vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));
            //on met les roues en mouvement
            roue1.MouvRoue(porte1, manette);
            roue2.MouvRoue(porte2, manette);
            roue3.MouvRoue(porte3, manette);
            vue.log("Roue en mouvement \n");
            vue.moveLights(voyant.animLights(manette, roue1, roue2, roue3, porte1, porte2, porte3));

            Timer timer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    //on sorte ou on rentre les roues
                    roue1.MouvRoue(porte1, manette);
                    roue2.MouvRoue(porte2, manette);
                    roue3.MouvRoue(porte3, manette);
                    //console log
                    if (roue1.getEtat() == WheelsEnum.RENTRE && roue2.getEtat() == WheelsEnum.RENTRE && roue3.getEtat() == WheelsEnum.RENTRE) {
                        vue.log("Roues Rentrées \n");
                    }
                    if (roue1.getEtat() == WheelsEnum.SORTI && roue2.getEtat() == WheelsEnum.SORTI && roue3.getEtat() == WheelsEnum.SORTI) {
                        vue.log("Roues Sorties \n");
                    }
                    //on fermes les portes
                    porte1.MouvPorte(manette, roue1);
                    porte2.MouvPorte(manette, roue2);
                    porte3.MouvPorte(manette, roue3);
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
