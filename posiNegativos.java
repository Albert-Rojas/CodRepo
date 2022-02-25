//importamos la libreria 
import java.util.*;
/**
 *
 * @author HP
 */
public class posiNegativos {

    
    public static void main(String[] args) {
        //invocamos la libreria y se almacena temporalnete el numero
      Scanner num =new Scanner(System.in);
       int numeros[]=new int [5];
       //declaramos las variables tipo entero
       int neg=0, pos=0, cero=0;
      // para tener un bucle donde i se inicializa en 0 y hara el recorrido hasta 5 de uno en uno
     for (int i=0; i<5; i++){
         //el println nos mostara en pantalla 
         System.out.print("ingrese un numero"+(i+1)+ " : " );
         //guardara el numero digitado
         numeros[i] =num.nextInt();
         if (numeros[i]<0){
             neg++;   
             // ponemos un println para mostar en pantalla  y concatenamos
             System.out.print("\n los numeros negativos son : "+neg);
         }
         if (numeros[i]>0){
             pos++;
              // ponemos un println para mostar en pantalla  y concatenamos
             System.out.print("\n los numeros positivos son : "+pos); 
         }
         if (numeros[i]==0){
             cero++;
             
         }
     }// ponemos un println para mostar en pantalla el resultado y concatenamos
     System.out.print("\n los numeros negativos son : "+neg);
     System.out.print("\n los numeros positivos son : "+pos); 
     System.out.print("\n los numeros ceros son : "+cero);
    }
    
}
