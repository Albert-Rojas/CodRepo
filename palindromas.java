
//importamos la libreria 
/**
 *
 * @author albert
 */
import java.util.*;

public class palindromas {

    public static void main(String[] args) {
        //invocamos la libreria y se almacena temporalnete el numero
        Scanner in = new Scanner(System.in);
        //el println nos mostara en pantalla 
        System.out.println("Digite una palabra");
        //guardara el numero digitado
        String pal = in.nextLine();
        //declaramos las variables tipo entero y el length es la longitud de la cadena 
        int vf = pal.length() - 1;
        int vi = 0;
        int res = 0;

        for (int i = vf; i >= 0; i--) {
            //if si se cumple la funcion 
            if (pal.charAt(i) == pal.charAt(vi)) {
                vi++;
            // si no se cumple 
            } else {
                res++;

            }

        }//si res es igual a 0 mostara en pantalla 
        if (res == 0) {
            System.out.println("la palabra es palindroma ");

        } else {
            System.out.println("la palara no es palindroma ");
        }
    }
}
