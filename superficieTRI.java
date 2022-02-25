//importamso la libreria 
import java.util.Scanner;


/**
 *
 * @author albert 
 */
public class superficieTRI {

    
    public static void main(String[] args) {
        //invocamos la libreria y se almacena temporalnete el numero
       Scanner teclado= new Scanner(System.in);
        //declaramos las variables tipo decimal
      float area, base, altura;
       // ponemos un println para mostar en pantalla 
      System.out.println("digite la base del triangulo ");
       //se pedira un numero
        base=teclado.nextInt();
        
        System.out.println("digite la altura del triangulo ");
        altura=teclado.nextInt();
        
       area=(base*altura)/2; 
        
        // ponemos un println para mostar en pantalla el resultado y concatenamo
       System.out.println("el area del triangulo es:  " +area);
    }
    
}
