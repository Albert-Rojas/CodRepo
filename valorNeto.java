//importamos la libreria 
import java.util.Scanner;



/**
 *
 * @author albert
 */
public class valorNeto {

    
    public static void main(String[] args) {
         //invocamos la libreria y se almacena temporalnete el numero
      Scanner teclado= new Scanner(System.in);
        //declaramos las variables tipo entero
        int sueldo;
        int auxt;
        int salud;
        int pension;
        int sueldot;
        // ponemos un println para mostar en pantalla 
     System.out.println("Por favor escriba su sueldo");
       //se pedira un numero
        sueldo=teclado.nextInt();
        
        auxt=sueldo+32000;
        salud=-(sueldo*12/100);
        pension=-(sueldo*16/100);
        sueldot=auxt+salud+pension;
 // ponemos un println para mostar en pantalla el resultado y concatenamo
            System.out.println("Salud: $" +salud);
            System.out.println("Pension: $" +pension);
            System.out.println("Total con solo auxilio de transporte es: $" +auxt);
            System.out.println("El valor total de su sueldo es: $" +sueldot);
    }
    
}
