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

/** Handle Manager: keep position of the handle */
public class Handle {
    //false => handle up; true = > handle down
    private HandleEnum position = HandleEnum.HAUT; 

    /**
     *
     * @return
     */
    public HandleEnum getPosition() {
        return position;
    }

    /**
     *
     * @param position
     */
    public void setPosition(HandleEnum position) {
        this.position = position;
    }
}
