import javax.swing.*;

public class SistemasNumericosEntradaVentana {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null,"Ingresa un valor entero");
        int valor = 0;

        try{
            valor = Integer.parseInt(numero);//sirve para convertir a entero y lo guarda en la variable valor
        }catch (NumberFormatException e){ //NumberFormatException sirve para cachar errores desde ventanas JOpane.
            System.out.println("error solo numeros");
            JOptionPane.showMessageDialog(null, "error solo numeros");
            main(args);
            System.exit(0);
        }

        System.out.println("numero decimal es: " + valor);
        String resultadoBinario = "numero Binario de " + valor + " equivale a: " + Integer.toBinaryString(valor);
        //Integer.toBinaryString(valor) para convertir a binario recibe un int y retorna un String

        String resultadoOctal = "numero Octal de " + valor + " equivale a: " + Integer.toOctalString(valor);
        //Integer.toOctalString(valor) para convertir a octal recibe un int y retorna un String

        String resultadoHex = "numero Hexadecimal de " + valor + " equivale a: " + Integer.toHexString(valor);
        //Integer.toHexString(valor) para convertir a hexadecimal recibe un int y retorna un String

        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" +resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);





    }
}
