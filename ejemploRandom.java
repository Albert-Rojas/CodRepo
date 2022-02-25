//se importa la libreria ramdom
import java.util.Random;


public class ejemploRandom {

    
    public static void main(String[] args) {
        //aleatorio donde se almacena el numero temporalmete 
        Random aleatorio= new Random();
        //generamos una variable tipo entero donde almacenara el numero 
        int n = aleatorio.nextInt(15);
        //nos mostrara en pantalla el numero aleatorio 
        System.out.println(" El nuemro aleatorio es: " +n);
        
    }
    
}
