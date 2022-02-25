
/**
 *
 * @author albert 
 */
public class ejercicio2 {

    
    public static void main(String[] args) {
        //declaramos las variables 
        int num1 = 6;
        int num2 = 6;
        int res=0;
        if (num1>num2){
            res=num1*num2;
            System.out.println("la multiplicacion entre " +num1+ " y " +num2+ "es: " +res);
        }
        else
        {
            res=num1+num2;
            System.out.println("la suma entre" +num1+ " y " +num2+ "es: " +res);
        }
        if (num1==num2){
            res=num1/num2;
            System.out.println("los dos numeros son iguales " +res);
        }
    }
    
}
