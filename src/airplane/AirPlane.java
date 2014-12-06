/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplane;

/**
<<<<<<< HEAD
<<<<<<< HEAD
=======
 *
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
=======
 *
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
 * @author Martin LEGRIS
 * @author Sacha MASSON
 */
public class AirPlane {
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
=======

>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
        // TODO code application logic here
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
=======
        // TODO code application logic here
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
    /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
<<<<<<< HEAD
<<<<<<< HEAD
        java.awt.EventQueue.invokeLater(() -> {
            new View().setVisible(true);
        });
    }
=======
=======
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

<<<<<<< HEAD
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
=======
>>>>>>> 55a69ebce21e659bc3e0cfcc79bc0db7b552ea6b
}
