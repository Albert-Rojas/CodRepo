
/**
 *
 * @author HP
 */
//importamos la libreria 
import java.util.Scanner;
public class arraiSuma {

    
    public static void main(String[] args) {
        //invocamso la libreria scanner 
        Scanner teclado= new Scanner(System.in);
         // definimos las variables tipi entero 
        int acum=0;
        int n=0;
        int i=0;
        // ponemos un println para que nis muestre en pantalla 
        System.out.println("digite la cantidasd de nuemros a sumar");
         // ingresar el numeor 
        n=teclado.nextInt();
        // crear un array para alamcenar los valores
        int valores[]=new int[n];
        // para tener un bucle donde i se inicializa en 0 y ara el recorrido hasta n de uno en uno 
        for(i=0; i<n; i++){
            // ponemos un println para que nis muestre en pantalla 
            System.out.println("digite un numero para la posicion");
            // ingresar el numeor 
             valores[i]=teclado.nextInt();
             
             acum=acum+valores[i];
        }
          // ponemos un println para mostar en pantalla el resultado y concatenamos
        System.out.println("la suam de los valores es: "+acum);
        
        
       
    }
    
}
