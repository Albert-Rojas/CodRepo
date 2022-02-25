
/**
 *
 * @author HP
 */
//mostrar los datos de un usuario ( nombre, edad y sexo)
public class libreArreglos {

    public static void main(String[] args) {
        // declaramos las variables tipi string ya que son nombres 
        String nombres[] = {"Victor", "Ronald", "Carolina", "Paola"};
        //declaramos las variables tipo int por que son enteros 
        int edad[] = {25, 30, 19, 22};
        //char para guardar estos caracteres
        char sexo[] = {'M', 'M', 'M', 'F'};
        //mostramso en pantalla 
        System.out.println("Datos de los usuarios");
        System.out.println("NOMBRES EDAD  SEXO");
        System.out.println("------- ----  ----");
        //el length es para la longitud de la cadena 
        for (int u = 0; u < nombres.length; u++) {
            System.out.println(nombres[u] + " " + edad[u] + " " +   sexo[u]);
        }
    }

}
