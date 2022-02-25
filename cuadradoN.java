//importamos la libreria de scanner 
import java.util.Scanner;


/**
 *
 * @author albert 
 */
public class cuadradoN {

    
    public static void main(String[] args) {
        //invocamos la libreria 
       Scanner teclado= new Scanner(System.in);
       //declaramos las variables como entero 
      int num,res;
      //el println nos mostara en pantalla 
      System.out.println("digite un numero ");
      //ingresar un numero
        num=teclado.nextInt();
        
        res=(num*num);
         // ponemos un println para mostar en pantalla el resultado y concatenamos
        System.out.println("el cuadrado de " +num+ " es : "+res);
        
        
    }
    
}
