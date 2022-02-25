

/**
 *
 * @author albert 
 */
public class arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //la lista inicializadora especifica el valor para cada elemento
   int arreglo[] = { 32, 27, 64,18,95,14,90,70,60,37};
   
   System.out.printf("%s%8s\n", "Indice", "Valor");// encabezados de columna 
   // imprime el valor del elemento de cada arreglo 
   
   for(int contador = 0; contador < arreglo.length; contador++)
          System.out.printf("%5d%8d\n", contador,arreglo[contador]);
           
           
   
    }
}
