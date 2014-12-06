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
public class Handle {

    HandleEnum position = HandleEnum.HAUT; //false => handle up; true = > handle down

    public HandleEnum getPosition() {
        return position;
    }

    public void setPosition(HandleEnum position) {
        this.position = position;
    }
}
