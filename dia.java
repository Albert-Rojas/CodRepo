//importamos la libreria de JOption 
import javax.swing.JOptionPane;
/**
 *
 * @author albert 
 */
public class dia { 

 
    public static void main(String[] args) {
        String Op=JOptionPane.showInputDialog(null,"digite un numero y se mostara el dia de la semana");
                
        int op=Integer.parseInt(Op);
        //Se mostrara la opcion que eligio
        
        if (op==1){
            JOptionPane.showMessageDialog(null,"Lunes");
        }//Si eligio la opccion 1
        else if(op==2){
            JOptionPane.showMessageDialog(null,"Martes");
        }//Si eligio la opccion 2
        else if(op==3){
            JOptionPane.showMessageDialog(null,"Miercoles");
        }//Si eligio la opccion 3
        else if(op==4){
            JOptionPane.showMessageDialog(null,"Jueves");
        }//Si eligio la opccion 4
        else if(op==5){
            JOptionPane.showMessageDialog(null,"Viernes");
        }//Si eligio la opccion 5 
        else if(op==6){
            JOptionPane.showMessageDialog(null,"Sabado");
        }//Si eligio la opccion 6
        else if(op==7){
            JOptionPane.showMessageDialog(null,"Domingo");
        }//Si la opcion no exites
        else
            JOptionPane.showMessageDialog(null,"Esta opcion no esta disponible");
        }
        
            
        }
        
    
    

