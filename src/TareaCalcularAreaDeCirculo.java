import java.util.Scanner;

public class TareaCalcularAreaDeCirculo {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingresa el radio del circulo para calcular su area");
          double radio = scanner.nextDouble();

          double area = 0.0;

          area = Math.PI * Math.pow(radio,2);
          System.out.println("area = " + area);


     }
}
