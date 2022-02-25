//importamos la libreria 
import java.util.Scanner;



/**
 *
 * @author HP
 */
public class mayorQ100 {

    
    public static void main(String[] args) {
       //declaramos las variables tipo entero
        int num;
        //invocamos la libreria y se almacena temporalnete el numero
        Scanner n= new Scanner(System.in);
        //el println nos mostara en pantalla 
        System.out.println(" digite un numero");
         //guardara el numero digitado
        num=n.nextInt();
         //si se cumple la funcion 
        if (num<100){
            //mostar en pantalla 
            System.out.println("el numero es menor a 100");
        }//si no se cumple mostrar en pantalla 
        else {
            System.out.println(" el numero es mayor a 100");
        }
    }
    
}
