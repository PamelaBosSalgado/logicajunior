/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import javax.swing.*;

/**
 *
 * @author Pame
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String recibir;
        int numero;
        {
            recibir = JOptionPane.showInputDialog("Edad");
                numero = Integer.parseInt(recibir);
            if (numero >= 12) {
                JOptionPane.showMessageDialog(null, "Puede pasar");
            } else
            {
                JOptionPane.showMessageDialog(null, "No puede pasar");
            }
        }
    }
    
}
