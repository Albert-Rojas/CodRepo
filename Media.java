

/**
 *
 * @author albert
 */
//importamos la libreria 
import java.util.*;

public class Media {

    
    public static void main(String[] args){
        //decalramos la variable tipo entera 
      int media;
          //invocamso la libreria scanner 
        Scanner sc= new Scanner(System.in);
        // ponemos un println para mostara en pantalla 
        System.out.println("la cantidad de numeros");
        //se esta pidiendo un numero por teclado
        int n= sc.nextInt();
        // crear un array para alamcenar los valores 
        
        int numeros [] = new int[n];
        // para tener un bucle donde i se inicializa en 0 y ara el recorrido hasta n de uno en uno 
        for(int i=0; i<n; i++){
        // println para mostara en panatalla 
        System.out.println("ingrese el nuemero:");
        // ingresemos lo numeros 
        numeros[i]=sc.nextInt();
    }// declaramso la variable suma 
        int suma=0;
        // un blucle que i hara el recorrido hasta n con paso de 1en 1
        for(int i=0; i<n; i++){
            // se realiza la operacion
            suma=suma + numeros[i];
        }// se hace la operacion para sacar la media 
        media = suma/n;
        // ponemso un println para mostara en pantalla el resultado y concatenamos  
        System.out.println("la media es :" +media);
      
    
    }
}

