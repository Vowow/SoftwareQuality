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

/** Wheels Manager: keep position of the wheels and managing movements */ 
public class Wheels {

    private WheelsEnum etat = WheelsEnum.RENTRE;

    /**
     *
     * @return
     */
    public WheelsEnum getEtat() {
        return etat;
    }

    /**
     *
     * @param etat
     */
    public void setEtat(WheelsEnum etat) {
        this.etat = etat;
    }

    /**
     *
     * @param porte
     * @param manette
     * @return
     */
    public WheelsEnum mouvRoue(Doors porte, Handle manette) {
        //phase atterissage - mise en mouvement
        if (porte.getPosition() == DoorsEnum.OUVERT && this.etat == WheelsEnum.RENTRE && manette.getPosition() == HandleEnum.BAS) {
            etat = WheelsEnum.MOUVEMENT;
            return etat;
        } //phase atterissage - fin de phase
        else if (porte.getPosition() == DoorsEnum.OUVERT && this.etat == WheelsEnum.MOUVEMENT && manette.getPosition() == HandleEnum.BAS) {
            etat = WheelsEnum.SORTI;
            return etat;
        } ///Phase de décollage - mise en mouvement
        else if (porte.getPosition() == DoorsEnum.OUVERT && this.etat == WheelsEnum.SORTI && manette.getPosition() == HandleEnum.HAUT) {
            etat = WheelsEnum.MOUVEMENT;
            return etat;
        } ///Phase de décollage - fin de phase
        else if (porte.getPosition() == DoorsEnum.OUVERT && this.etat == WheelsEnum.MOUVEMENT && manette.getPosition() == HandleEnum.HAUT) {
            etat = WheelsEnum.RENTRE;
            return etat;
        } else {
            return null;
        }
    }
}
