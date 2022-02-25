
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class positivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner n= new Scanner(System.in);
        
        System.out.println(" digite un numero");
        num=n.nextInt();
        
        if (num<0){
            System.out.println("el numero es negativo");
        }
        else {
            System.out.println(" el numero es postivo");
        }
        
       
    }
    
}
