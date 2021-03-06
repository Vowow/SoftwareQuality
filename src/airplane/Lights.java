/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplane;

/**
 *
 * @author Martin LEGRIS
 * @author Sacha MASSON
 */

/** Lights Manager: keep position of the lights and managing animation */
public class Lights {

    private LightsEnum color = LightsEnum.ETEINT;

    /**
     *
     * @return
     */
    public LightsEnum getColor() {
        return color;
    }

    /**
     *
     * @param newCol
     */
    public void setColor(LightsEnum newCol) {
        color = newCol;
    }

    /**
     *
     * @param manette
     * @param roue1
     * @param roue2
     * @param roue3
     * @param porte1
     * @param porte2
     * @param porte3
     * @return
     */
    public LightsEnum animLights(Handle manette, Wheels roue1, Wheels roue2, Wheels roue3, Doors porte1, Doors porte2, Doors porte3) {
        //ETEINT (la manette est en position haute, les portes sont fermées, et les roues rentrées
        if (manette.getPosition() == HandleEnum.HAUT && roue1.getEtat() == WheelsEnum.RENTRE && roue2.getEtat() == WheelsEnum.RENTRE && roue3.getEtat() == WheelsEnum.RENTRE && porte1.getPosition() == DoorsEnum.FERME && porte2.getPosition() == DoorsEnum.FERME && porte3.getPosition() == DoorsEnum.FERME) {
            color = LightsEnum.ETEINT;
            return color;
        } // ORANGE (une roue est en mouvement et une porte est ouverte        
        else if (porte1.getPosition() == DoorsEnum.OUVERT || porte2.getPosition() == DoorsEnum.OUVERT || porte3.getPosition() == DoorsEnum.OUVERT) {
            if(roue1.getEtat() == WheelsEnum.MOUVEMENT || roue2.getEtat() == WheelsEnum.MOUVEMENT || roue3.getEtat()==WheelsEnum.MOUVEMENT){
                color = LightsEnum.ORANGE;
            return color;
            }
            
            
        } //VERT (la manette est en position basse, les roues sont sorties et les portes sont fermées
        if (manette.getPosition() == HandleEnum.BAS && roue1.getEtat() == WheelsEnum.SORTI && roue2.getEtat() == WheelsEnum.SORTI && roue3.getEtat() == WheelsEnum.SORTI && porte1.getPosition() == DoorsEnum.FERME && porte2.getPosition() == DoorsEnum.FERME && porte3.getPosition() == DoorsEnum.FERME) {
            color = LightsEnum.VERT;
            return color;
        } //ERREUR ROUGE
        else {
            return LightsEnum.ROUGE;
        }
    }
}
