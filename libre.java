//importamos la libreria scanner 
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class libre {

    
    public static void main(String[] args) {
      //variable entera 
         int num;
        Scanner n= new Scanner(System.in);
        //nos imprime en pantalla 
        System.out.println(" digite cuantos diamates quere comparar");
        //almacena el numero ingresado 
        num=n.nextInt();
        //si se cumple la funcion 
        if (num==100){
            //mostar en pantalla 
            System.out.println("100 diamantes te costarian 3mil pesos");
        }
        if(num==300){
            System.out.println("300 diamantes te costaran 9mil pesos");
            
        }
        if(num==500){
            System.out.println("500 diamantes te costaran 15mil pesos");
        }
        if(num==1000){
            System.out.println("1000 diamates te costaran 30mil pesos");
        }//si no se cumple mostrar error
        else {
            System.out.println(" ERROR");
        }
    }
    
}
