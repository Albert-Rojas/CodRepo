

/**
 *
 * @author HP
 */
//importamos la libreria javax.swing para utilizar el JOption 
import javax.swing.*;
public class contar50numeros {

    
    public static void main(String[] args) {
        //invocamso la libreria y se pone messageDialog para que nos imprima en pantalla
       JOptionPane.showMessageDialog(null, " se mostraran los numeros del 1al 50");
       //definimos la variable tipoentero 
       int sum=0;
       // para tener un bucle donde i se inicializa en 1 y ara el recorrido hasta 50 de uno en uno 
       for(int i=1; i<=50; i++){
           // sera la salida donde nos mostara el numero 
           JOptionPane.showInternalMessageDialog(null, i);
           sum=i+sum;
       }//nos mostara en pantalla la suma de todos los numeors 
        JOptionPane.showInternalMessageDialog(null," la suma de los 50 numeros es: "+sum);
    }
    
}

