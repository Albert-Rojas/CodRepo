
/**
 *
 * @author albert
 */
// importmos la libreria util 
import java.util.*;

public class NumerMY {

    public static void main(String[] args) {
        //invocamso la libreria scanner 
        Scanner in=new Scanner(System.in);
        // crear un array para alamcenar los valores 
        int N[]=new int[6];
        // para tener un bucle donde i se inicializa en 0 y hara el recorrido hasta 5 de uno en uno
        for(int i=0; i<=5; i++){
            // un println para mostara en pantalla 
            System.out.println("Digite un numero para la posicion "+i);
            //se esta pidiendo un numero por teclado 
            N[i]=in.nextInt();
        }
        //declaramos las variables tipo entero 
       int n1=0, n2=0;
       // para tener un bucle donde i se inicializa en 0 y hara el recorrido hasta 5 de uno en uno
       for(int i=0; i<=5; i++){
           //ponemos un if si la condicion se cumole y se realiza la opercion 
           if(N[i]>n1){
               n2=n1;
               n1=N[i];
               //ponemos un else si esa no se cumple y se realiza la operacion 
           }else if(N[i]>n2){
               n2=N[i];
           }
       }
       // ponemso un println para mostara en pantalla el resultado y concatenamos
       System.out.println("El numero mas grande es "+n1);
       System.out.println("El segundo numero mas grande es: "+n2);
    }

}
