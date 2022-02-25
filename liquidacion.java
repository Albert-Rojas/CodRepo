import java.util.*;
public class liquidacion {

    public static void main(String[] args) {
         Scanner teclado= new Scanner(System.in);
        int salario;
        int hrexd;
        int hrexn;
        int hrdo;
        int salud;
        int pension;
        int sueldototal;
        
        System.out.println("ingrese su salrio mensual");
        salario=teclado.nextInt();
        
        hrexd=+12500;
        hrexn=+17500;
        hrdo=+20000;
        salud=-(salario*4/100);
        pension=-(salario*4/1010);
        sueldototal=salario+hrexd+hrexn+hrdo+salud+pension;
        
            System.out.println("horas extras diurnas :"+hrexd);
            System.out.println("horas extras nocturnas :" +hrexn);
            System.out.println("horas dominicales"+hrdo);
            System.out.println("salud : " +salud);
            System.out.println("pension : " +pension);
            System.out.println("su sueldo total es : " +sueldototal);
            
    }
    
}
