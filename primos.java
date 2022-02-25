

/**
 *
 * @author HP
 */
public class primos {

   
    public static void main(String[] args) {
         // ponemos un println para mostar en pantalla 
        System.out.println("Se mostraran los 10 primero numeros primos numeros primos");
        //declaramos las variables tipo entero
        int sum=0;
        // para tener un bucle donde i se inicializa en 1 y hara el recorrido hasta 29 de uno en uno
        for(int i=1; i<=29; i++){
            //declaramos las variables tipo entero
            int x = 1, cont = 0;
            //un bucle 
            while (x<=i) {
                if ((i % x) == 0) {
                    cont++;
                }
                x++;
            }
            if (cont == 2) {
                System.out.println(i + " es primo");
                sum=i+sum;
                
            }
        } // ponemos un println para mostar en pantalla  y concatenamos
        System.out.println("Y la suma de ellos es "+sum);
        
        
       
                    
                   
    }
}
 
