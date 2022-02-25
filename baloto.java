
import java.util.Random;

public class baloto {

    public static void main(String[] args) {
        
          Random aleatorio= new Random();
        //generamos una variable tipo entero donde almacenara el numero 
        int n1 =  aleatorio.nextInt(99);
        int n2 = aleatorio.nextInt(99);
        int n3 = aleatorio.nextInt(99);
        int n4 =  aleatorio.nextInt(99);
        int n5 = aleatorio.nextInt(99);
        int n6 = aleatorio.nextInt(99);
        
        
        System.out.println(" El  numero del baloto es : " +n1);
          System.out.println(" El  numero del baloto es : " +n2);
            System.out.println(" El  numero del baloto es : " +n3);
              System.out.println(" El  numero del baloto es : " +n4);
                System.out.println(" El  numero del baloto es : " +n5);
                  System.out.println(" El  numero del baloto es : " +n6);
        
        
    }
    
}
