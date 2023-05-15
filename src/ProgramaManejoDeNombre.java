import javax.swing.*;
import java.util.Scanner;

public class ProgramaManejoDeNombre {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingresa Primer Nombre");
          String nombreA = scanner.nextLine();
          String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length() - 2);

         /*En la variable nombreA2 se esta almacenando en mayúscula la segunda letra de nombreA.toUpperCase().charAt(1)
         con el metodo nombreA.substring(nombreA.length()-2); obtiene una parte del String, ya sea desde X a N o solo
         desde X, el metodo .length()-2 obtiene el total del largo del String
         entonces el metodo nombreA.substring tomara desde lo que marca el metodo nombreA.length()-2*/

          System.out.println("Ingresa Segundo Nombre");
          String nombreB = scanner.nextLine();
          String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length() - 2);

          System.out.println("Ingresa Tercer Nombre");
          String nombreC = scanner.nextLine();
          String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length() - 2);

          String mensaje = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
          System.out.println("mensaje = " + mensaje);

          //ingresa los nombres por medio de una ventana

        /*String nombre = JOptionPane.showInputDialog(null,"Ingresa primer nombre");
        String nombreA = nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length()-2);

        String nombreB= JOptionPane.showInputDialog(null,"Ingresa segundo nombre");
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        String nombreC = JOptionPane.showInputDialog(null,"Ingresa tercer nombre");
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String mensaje = nombreA + "_" + nombreB2 + "_" + nombreC2;
        JOptionPane.showMessageDialog(null, mensaje);*/


     }
}
