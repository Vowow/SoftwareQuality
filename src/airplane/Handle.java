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
<<<<<<< HEAD
<<<<<<< HEAD
    //false => handle up; true = > handle down
    private HandleEnum position = HandleEnum.HAUT; 
=======

    HandleEnum position = HandleEnum.HAUT; //false => handle up; true = > handle down
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
=======

    HandleEnum position = HandleEnum.HAUT; //false => handle up; true = > handle down
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b

    public HandleEnum getPosition() {
        return position;
    }

    public void setPosition(HandleEnum position) {
        this.position = position;
    }
}
