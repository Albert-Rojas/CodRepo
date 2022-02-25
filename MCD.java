

/**
 *
 * @author albert
 */
// importamos la libreria scanner 
import java.util.Scanner;
public class MCD {

   
     
    public static void main(String[] args) {
       //importamos la libreria 
        Scanner teclado= new Scanner(System.in);
        //declaramos las variables tipo entero 
        int num1,num2;
        // ponemos un println para que nis muestre en pantalla 
        System.out.println("ingrese el primer numero");
        // ingresamos el numero
        num1=teclado.nextInt();
        // ponemos un println para que nis muestre en pantalla 
         System.out.println("ingrese el segundo numero");
         // ingresamos el numero
        num2=teclado.nextInt();
        //ponemso um while que es comu un mientas
        while (num1!=num2)
            //ponemos un if si la condicion se cumole y se realiza la opercion 
            if(num1>num2)
                num1=num1-num2;
            //ponemos un else si esa no se cumple y se realiza la operacion 
            else 
                num2=num2-num1;
        // ponemos un println para que nis muestre en pantalla el resultado y concatenamos +num1
        System.out.println("El mcd es: "+num1);
        
    }
    
}
