//importamos la libreria de JOption 
import javax.swing.JOptionPane;
/**
 *
 * @author albert
 */
public class edad {

   
    public static void main(String[] args) {
        // se pedira el nombre de dos perdonas y luego su edad 
       String nom1=JOptionPane.showInputDialog(null,"ingrese el nombre de la primera persona");
       String nom2=JOptionPane.showInputDialog(null,"ingrese el nombre de la segunda persona");
       // se pedira la edad de las dos personas 
       String ed1=JOptionPane.showInputDialog(null,"ingrese la edad de " +nom1);
        String ed2=JOptionPane.showInputDialog(null,"ingrese la edad de " +nom2);
        // se cambiara la variable de String a entero 
        int edad1=Integer.parseInt(ed1);
         int edad2=Integer.parseInt(ed2);  
         // se buscara quien es mayor 
         if(edad1>edad2){
             JOptionPane.showMessageDialog(null, nom1+ " es mayor que " +nom2);
         }
         else if (edad1<edad2){
             JOptionPane.showMessageDialog(null, nom2+ " es mayor que " +nom1);
         }
         else if (edad1==edad2){
             JOptionPane.showMessageDialog(null, nom1+ " y " + nom2+ " son igales");
         }
    
                
    }
    
}
