
package ingresotextos_java;
import java.util.Scanner;

/**
 *
 * @author Rib
 */
public class IngresoTextos_Java 
{
    //Programa que lee cadenas de texto ingresado por el usuario
    public static void main(String[] args) 
    {
     Scanner s = new Scanner(System.in);
            System.out.println("** 2. Programa que lee un nombre y muestre en pantalla: Buenos dias nombre_introducido **\n");
            System.out.println("Ingrese el Nombre: ");
            String nombre = s.next(); //o bien se puede usar String nombre = s.next();
            System.out.println("Ingrese Apellido: ");
            String apellido = s.next(); //o bien se puede usar String nombre = s.next();
            System.out.println("!Hola! "+nombre +" "+apellido);
    }
}
