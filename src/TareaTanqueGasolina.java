import java.util.Scanner;

public class TareaTanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los litros de tanque de gasolina");
         double capacidad = scanner.nextDouble();

         if (capacidad >= 1 && capacidad < 20){
            System.out.println("insuficiente");
        } else if (capacidad >= 20 &&  capacidad < 35) {
             System.out.println("suficiente");
         } else if (capacidad >= 35 && capacidad < 40 ) {
             System.out.println("tanque a media capacidad");
         } else if (capacidad >= 40 && capacidad < 60) {
             System.out.println("capacidad del tanque en 3/4");
         } else if (capacidad >= 60 && capacidad < 70 ) {
             System.out.println("tanque lleno");
         }

    }
    }

