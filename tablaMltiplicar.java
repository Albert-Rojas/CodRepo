//importamos la libreria 
import java.util.Scanner;


/**
 *
 * @author albert
 */
public class tablaMltiplicar {

    public static void main(String[] args) {
        //invocamos la libreria y se almacena temporalnete el numero
      Scanner teclado= new Scanner(System.in);
        //declaramos las variables tipo entero
        int res;
        int i;
        int n;
        // ponemos un println para mostar en pantalla 
     System.out.println("digite un numero del cual desee conocer su tabla de multiplicar");
     //se pedira un numero
        n=teclado.nextInt();
     // para tener un bucle donde i se inicializa en 1 y hara el recorrido hasta 10 de uno en uno
        for (i=1; i<=10; i++) {
            res=i*n;
            // ponemos un println para mostar en pantalla el resultado y concatenamo
            System.out.println(+ n +"x"+ i +"="+res);
        }
    }
    
}
