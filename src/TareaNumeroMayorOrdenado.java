import java.util.Scanner;

public class TareaNumeroMayorOrdenado {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("ingresa un numero entero");
        int numeroA = scanner.nextInt();

        System.out.println("ingresa otro numero entero");
        int numeroB = scanner.nextInt();

        String resul = (numeroA > numeroB) ? numeroA + " y " + numeroB: numeroB + " y " + numeroA;
        System.out.println(resul);
    }
}
