//importamos la libreria scanner 
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class dolar {

    
   
    public static void main(String[] args) {
        //invocamos la libreria 
       Scanner teclado= new Scanner(System.in);
       //declaramos las variables tipo entero 
       int cant,res;
        //el println nos mostara en pantalla 
       System.out.println("Ingrese loa cantidad de dolares :");
        //ingresar un numero
        cant=teclado.nextInt();
        
        res=(cant*3654);
        // ponemos un println para mostar en pantalla el resultado y concatenamos
        System.out.println("su cantidad a pesos colombianos es :"+res);
    }
    
}
