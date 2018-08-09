/*
Lee un numero por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. 
El IVA sera una constante que sera del 21%. 
*/
package parcial1;

import javax.swing.*;

public class Problema1 {

    public static void main(String[] args) {
        final double IVA=0.21; //Declaramos una constante
        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
        double precio=Double.parseDouble(texto); //Pasamos el String a double
        double precioFinal=precio+(precio*IVA); //Obtenemos el precio final
        JOptionPane.showMessageDialog(null,"El precio total es: " +precioFinal);
    }
}
