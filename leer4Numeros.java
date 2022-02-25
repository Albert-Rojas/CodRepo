//importamos la libreria scanner 
import java.util.Scanner;



/**
 *
 * @author albert 
 */
public class leer4Numeros {

    
    public static void main(String[] args) {
            //invocamos la libreria y se almacena temporalnete el numero
         Scanner teclado= new Scanner(System.in);
         //declaramos las variables tipo entero 
      int n1,n2,n3,n4;
      int suma,mul,md;
       //el println nos mostara en pantalla 
      System.out.println("digite un numero");
      //guardara el numero digitado 
        n1=teclado.nextInt();
        
        System.out.println("digite un numero");
        n2=teclado.nextInt();
        
        System.out.println("digite un numero");
        n3=teclado.nextInt();
        
        System.out.println("digite un numero");
        n4=teclado.nextInt();
        
        
        
        suma=(n1+n2+n3+n4);
        mul=(n1*n2*n3*n4);
        md=(n1+n2+n3+n4)/4;
        // ponemos un println para mostar en pantalla el resultado y concatenamos
        System.out.println("la suma de los 4 numeros es: "+suma);
        System.out.println("la multiplicacion de los 4 numeros es: "+mul);
        System.out.println("la media aritmetica de los 4 numeros es:  "+md);
       
    }
    
}
