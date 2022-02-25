
import javax.swing.*;

/**
 *
 * @author HP
 */
public class listadeN {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " se mostraran los numeros del 1al 100 y se dira cuando sea multiplo");
        //definimos la variable tipoentero 
        int sum = 0;

        // para tener un bucle donde i se inicializa en 1 y ara el recorrido hasta 100 de uno en uno 
        for (int i = 1; i <= 100; i = i + 2) {
            // sera la salida donde nos mostara el numero 
            JOptionPane.showInternalMessageDialog(null, i);
            sum = i + sum;

        }

    }

}
