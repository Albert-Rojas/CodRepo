// importamos la libreria de scanner 
import java.util.Scanner;


/**
 *
 * @author albert
 */
public class Euclides {

    
    public static void main(String[] args) {
        // invocamos la libreria de scanner 
      Scanner teclado= new Scanner(System.in);
      // definimos las variables tipi entero a y b
        int a,b;
        // ponemos un println para mostrar en pantalla  
        System.out.println("Ingrese primer numero:");
        // ingresar el numeor 
        a=teclado.nextInt();
        // println para mostrar en pantalla 
        System.out.println("Ingrese segundo numero:");
        //ingresar el numero 
        b=teclado.nextInt();
        //ponemso um while que es comu un mientas 
        while(a != b)
            // ponemos un if que si se cumple a sea mayor a b se realice la operacion 
            if(a>b)
                a = a-b;
            // else por si no se cumple se realice la operacion 
            else
                b = b -a;
        //println para mostara en pantalla el resultado y concatenamos +a
        
        System.out.println("El MCD es:" +a);
    }
    
}
