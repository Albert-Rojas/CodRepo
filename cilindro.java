//importamos la libreria de scanner 
import java.util.Scanner;



/**
 *
 * @author HP albert 
 */
public class cilindro {

    public static void main(String[] args) {
         //invocamso la libreria scanner
        Scanner teclado= new Scanner(System.in);
        // definimos las variables tipo decimal 
      double ra,h,are,vo;
      // ponemos un println para que nis muestre en pantalla
      System.out.println("digite el radio  ");
      // ingresar el numeor 
        ra=teclado.nextInt();
        // ponemos un println para que nis muestre en pantalla
        System.out.println("digite la altura ");
        // ingresar el numeor 
        h=teclado.nextInt();
        
        are=((2)*(3.1416)*(ra))*(h*ra);
        vo=((3.1416)*(ra*ra))*h;
        // ponemos un println para mostar en pantalla el resultado y concatenamos
        System.out.println("el valor del area del cilindro es: "+are);
        System.out.println("el valor del cilindro es:  "+vo);
    }
    
}
