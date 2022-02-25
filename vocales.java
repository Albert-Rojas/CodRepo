
/**
 *
 * @author albert 
 */
import java.util.*;

public class vocales {

    public static void main(String[] args) {
           //invocamos la libreria y se almacena temporalnete el numero
        Scanner in= new Scanner(System.in);
        String a="a", e="e", i="i", o="o", u="u";
        // ponemos un println para mostar en pantalla 
        System.out.println(" Digite una palabra y se mostrara la cantidad de vocales");
         //se pedira un numero
        String pal=in.nextLine();
          //declaramos las variables tipo entero
        int pf=pal.length()-1;
        int res=0;
        // para tener un bucle donde cont se inicializa en 0 y hara el recorrido hasta pf de uno en uno
        for(int cont=0; cont<=pf; cont++){
            if(pal.charAt(cont)==a.charAt(0)||pal.charAt(cont)==e.charAt(0)||pal.charAt(cont)==i.charAt(0)||pal.charAt(cont)==o.charAt(0)||pal.charAt(cont)==u.charAt(0)){
                res=res+1;
            }
        }
         // ponemos un println para mostar en pantalla el resultado y concatenamo
        System.out.println("La cantidad de vocales es " +res);
    }
    
}
