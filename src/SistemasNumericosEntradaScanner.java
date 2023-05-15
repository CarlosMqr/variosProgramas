import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//la clase sirve para ingresar datos desde la consola de terminal
        System.out.println("Ingresa un numero entero");
        //String numeroStr = scanner.nextLine();//cacha el valor en la consola de terminal y lo asigna a la variable numeroStr
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//sirve para convertir el valor automaticamente y la guarda en la variable numeroDecimal
        //Integer.parseInt(numeroStr);//convierte el valor String dado a valor numerico
        }catch (Exception e){ //InputMismatchException sirve para cachar lo errores desde consola
            System.out.println("Error debe ingresar solo un numero entero");
            main(args);//cuando no es numero el valor, se vuelve a llamar el main hasta ingresar un numero
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        //Integer.toBinaryString(valor) para convertir a binario recibe un int y retorna un String

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        //Integer.toBinaryString(valor) para convertir a Octal recibe un int y retorna un String


        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        //Integer.toBinaryString(valor) para convertir a Hexadecimal recibe un int y retorna un String


        String mensaje = resultadoBinario +
                         "\n" + resultadoOctal +
                         "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
