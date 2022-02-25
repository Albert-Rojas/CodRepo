import javax.swing.JOptionPane;
/**
 *importamos la libreria JOption
 * @author albert 
 */
public class transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // digite el la cantidad de su salrio 
        String Sueldo=JOptionPane.showInputDialog(null, "digite su salario ");
        //se pedira un numero
        int suel=Integer.parseInt(Sueldo);
        //si la condicion se cumple y mostrar en pantalla
        if (suel<=908526){
            JOptionPane.showMessageDialog(null, " Usted es beneficiario del subsidio de trasporte");
           
        }
        else{//si no se cumple la codicion y mostrar en pantalla  
            JOptionPane.showMessageDialog(null, " Usted no es beneficiario del subsidio de trasporte");
        }
        
    }
    
}
