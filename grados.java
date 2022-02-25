//importamos la libreria 
import java.util.Scanner;

/**
 *
 * @author albert
 */
public class grados {

    
    public static void main(String[] args) {
        //invocamos la libreria 
       Scanner teclado= new Scanner(System.in);
       //declaramos las variables tipo entero 
        int gcenti;
        int gfaren;
         //el println nos mostara en pantalla 
        System.out.println("Ingrese los grados centigrados:");
           //ingresar un numero
        gcenti=teclado.nextInt();
        gfaren=gcenti * 9/5 + 32;
        // ponemos un println para mostar en pantalla el resultado y concatenamos
        System.out.println("La convercion a grados farenheit es:" +gfaren);
    }
    
}
