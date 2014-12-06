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
public class Wheels {

    private WheelsEnum etat = WheelsEnum.RENTRE;

    public WheelsEnum getEtat() {
        return etat;
    }

    public void setEtat(WheelsEnum etat) {
        this.etat = etat;
    }

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
