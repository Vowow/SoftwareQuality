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

/** Door Manager: keep position of the door and managing movements */
public class Doors {

    private DoorsEnum position;

    /**
     *
     */
    public Doors() {
        this.position = DoorsEnum.FERME;
    }

    /**
     *
     * @return
     */
    public DoorsEnum getPosition() {
        return position;
    }

    /**
     *
     * @param newDoorsPosition
     */
    public void setDoorsPosition(DoorsEnum newDoorsPosition) {
        position = newDoorsPosition;

    }

    /**
     *
     * @param manette
     * @param roue
     * @return
     */
    public DoorsEnum mouvPorte(Handle manette, Wheels roue) {

        if (roue.getEtat() == WheelsEnum.MOUVEMENT) {
            return null;
        } //Prépartion de l'atterrissage
        else if (manette.getPosition() == HandleEnum.BAS && this.position == DoorsEnum.FERME && roue.getEtat() == WheelsEnum.RENTRE) {
            position = DoorsEnum.OUVERT;
            return position;
        } //Phase décollage
        else if (manette.getPosition() == HandleEnum.HAUT && this.position == DoorsEnum.FERME && roue.getEtat() == WheelsEnum.SORTI) {
            position = DoorsEnum.OUVERT;
            return position;
        } else if (manette.getPosition() == HandleEnum.BAS && this.position == DoorsEnum.FERME && roue.getEtat() == WheelsEnum.SORTI) {
            return position;
        } else if (manette.getPosition() == HandleEnum.HAUT && this.position == DoorsEnum.FERME && roue.getEtat() == WheelsEnum.RENTRE) {
            return position;
        } //fin d'action
        else if (roue.getEtat() == WheelsEnum.SORTI || roue.getEtat() == WheelsEnum.RENTRE) {
            position = DoorsEnum.FERME;
            return position;
        }

        return null;
    }
}
