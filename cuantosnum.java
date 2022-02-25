
/**
 *
 * @author albert 
 */
//importamos la libreria de scanner 
import java.util.*;
public class cuantosnum {

    //importamos la libreria de scanner 
    public static void main(String[] args) {
        //invocamos la libreria 
        Scanner teclado= new Scanner(System.in);
         //definimos la variable tipoentero 
        int i=1;
        int contador;
        //el println nos mostara en pantalla 
        System.out.println("digite cuantos numeros desea ver en pantalla ");
        // guarda en la variable contador el nuemro digitado 
        contador=teclado.nextInt();
        
        while (i<=contador){
            System.out.println(i);
            i++;
        }
    }
    
}
