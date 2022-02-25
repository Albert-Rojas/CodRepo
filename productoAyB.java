//importamos la libreria de JOption 
import javax.swing.JOptionPane;
/**
 *
 * @author albert 
 */
public class productoAyB {

    
    public static void main(String[] args) {
        //tipo cadena 
        String num1, num2;
        //declaramos las variables tipo entero 
        int n1,n2,res;
        
        // se mostara en pantalla 
        num1=JOptionPane.showInputDialog(null," digite un numero");
        num2=JOptionPane.showInputDialog(null," digite un numero");
        //se pedira un numero
        n1=Integer.parseInt(num1);
        n2=Integer.parseInt(num2);
        
        res=n1*n2;
        // ponemos un println para mostar en pantalla el resultado y concatenamo
        System.out.print("el producto de los dos numeor es:" +res);
        
    }
    
}
