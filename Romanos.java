

/**
 *
 * @author albert 
 */
// importamos la libreria de util 
import java.util.*;

public class Romanos {

    public static void main(String[] args) {
     //invocamso la libreria scanner 
        Scanner in=new Scanner(System.in);
        // un println para mostara en pantalla 
        System.out.println("digite un numero y se convertira en romano ");
        //se esta pidiendo un numero por teclado
        int num=in.nextInt();
        //int para definir el valor de floor 
        int mil=(int) Math.floor((num/1000)%10);
        int cien=(int) Math.floor((num/100)%10);
        int diez=(int) Math.floor((num/10)%10);
        int uno=(int) Math.floor((num/1)%10);
        // crear un array para alamcenar los valores 
        String milr[]=new String[4];
        milr[0]="";
        milr[1]="N";
        milr[2]="NMM";
        milr[3]="MMM";
        // crear un array para alamcenar los valores 
        String cienr[]=new String[10];
        cienr[0]="";
        cienr[1]="C";
        cienr[2]="CC";
        cienr[3]="CCC";
        cienr[4]="CD";
        cienr[5]="D";
        cienr[6]="DC";
        cienr[7]="DCC";
        cienr[8]="DCCC";
        cienr[9]="CM";
        // crear un array para alamcenar los valores 
        String diezr[]=new String[10];
        diezr[0]="";
        diezr[1]="X";
        diezr[2]="XX";
        diezr[3]="XXX";
        diezr[4]="XL";
        diezr[5]="L";
        diezr[6]="LX";
        diezr[7]="LXX";
        diezr[8]="LXXX";
        diezr[9]="XC";
        // crear un array para alamcenar los valores 
        String unor[]=new String[10];
        unor[0]="";
        unor[1]="I";
        unor[2]="II";
        unor[3]="III";
        unor[4]="IV";
        unor[5]="V";
        unor[6]="VI";
        unor[7]="VII";
        unor[8]="VIII";
        unor[9]="IX";
        //ponemos un if si la condicion se cumole y se realiza la opercion 
        if(mil>4||uno<0){
            // ponemos un println para mostara en pantalla
            System.out.println("No se puede realizar la operacion");
            //ponemos un else si esa no se cumple y se realiza la operacion
        }else{
            // ponemso un println para mostara en pantalla el resultado y concatenamos  
            System.out.println("El numero "  + num +  " es "  +milr[mil]+cienr[cien]+diezr[diez]+unor[uno]);
        }
        
        
    }
    
}
