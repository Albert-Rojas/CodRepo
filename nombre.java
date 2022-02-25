
import javax.swing.JOptionPane;
/**
 *
 * @author albert 
 */
public class nombre {

    
    public static void main(String[] args) {
        String nombre;
        String res;
        nombre= JOptionPane.showInputDialog(null, "digite su nombre");
        res = nombre;
        JOptionPane.showMessageDialog(null, "res :" +res);
        
    }
    
}
