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
public class Lights {

<<<<<<< HEAD
    private LightsEnum color = LightsEnum.ETEINT;
=======
    LightsEnum color = LightsEnum.ETEINT;
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    public LightsEnum getColor() {
        return color;
    }

    public void setColor(LightsEnum newCol) {
        color = newCol;
    }

    public LightsEnum animLights(Handle manette, Wheels roue1, Wheels roue2, Wheels roue3, Doors porte1, Doors porte2, Doors porte3) {
        //ETEINT (la manette est en position haute, les portes sont fermées, et les roues rentrées
        if (manette.getPosition() == HandleEnum.HAUT && roue1.getEtat() == WheelsEnum.RENTRE && roue2.getEtat() == WheelsEnum.RENTRE && roue3.getEtat() == WheelsEnum.RENTRE && porte1.getPosition() == DoorsEnum.FERME && porte2.getPosition() == DoorsEnum.FERME && porte3.getPosition() == DoorsEnum.FERME) {
            color = LightsEnum.ETEINT;
            return color;
<<<<<<< HEAD
        } // ORANGE (une roue est en mouvement)   
        else if (roue1.getEtat() == WheelsEnum.MOUVEMENT || roue2.getEtat() == WheelsEnum.MOUVEMENT || roue3.getEtat() == WheelsEnum.MOUVEMENT ) {
            color = LightsEnum.ORANGE;
            return color;
        } // ORANGE (une porte est ouverte)
        else if(porte1.getPosition() == DoorsEnum.OUVERT || porte2.getPosition() == DoorsEnum.OUVERT || porte3.getPosition() == DoorsEnum.OUVERT){
            color = LightsEnum.ORANGE;
            return color;
        }//VERT (la manette est en position basse, les roues sont sorties et les portes sont fermées
=======
        } // ORANGE (une roue est en mouvement ou une porte est ouverte        
        else if (roue1.getEtat() == WheelsEnum.MOUVEMENT || roue2.getEtat() == WheelsEnum.MOUVEMENT || roue3.getEtat() == WheelsEnum.MOUVEMENT || porte1.getPosition() == DoorsEnum.OUVERT || porte2.getPosition() == DoorsEnum.OUVERT || porte3.getPosition() == DoorsEnum.OUVERT) {
            color = LightsEnum.ORANGE;
            return color;
        } //VERT (la manette est en position basse, les roues sont sorties et les portes sont fermées
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
        else if (manette.getPosition() == HandleEnum.BAS && roue1.getEtat() == WheelsEnum.SORTI && roue2.getEtat() == WheelsEnum.SORTI && roue3.getEtat() == WheelsEnum.SORTI && porte1.getPosition() == DoorsEnum.FERME && porte2.getPosition() == DoorsEnum.FERME && porte3.getPosition() == DoorsEnum.FERME) {
            color = LightsEnum.VERT;
            return color;
        } //ERREUR ROUGE
        else {
<<<<<<< HEAD
=======
            //System.out.println(roue1.getEtat()+ " " +roue2.getEtat()+ " " +roue3.getEtat()+ " " + porte1.getPosition()+ " " +porte2.getPosition()+ " " +porte3.getPosition());
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
            return LightsEnum.ROUGE;
        }
    }
}
