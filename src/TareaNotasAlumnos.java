import java.util.Scanner;

public class TareaNotasAlumnos {
     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

          double calificacion = 0;
          int contCalfA1 = 0;
          int contCalfMayorA5 =0;
          int contCalfMenorA4 =0;
          double sumaMayorA5 =0;
          double sumaMenorA4 =0;
          double promedioMayorA5, promedioMenorA4 =0;
          double sumaTotal =0;
          boolean erro = false;
          System.out.println("Ingresa una calificacion entre 1 a 7");
          for (int i =0; i < 20; i++){
               System.out.println("Ingresa calificacion" + (i+1));
               calificacion = scanner.nextDouble();
               if (calificacion == 0){
                    erro = true;
                    System.out.println("Error no debe haber calificaciones en cero");
                    break;

               }
               if(calificacion == 1){
                    contCalfA1++;
               } else {
                    if (calificacion > 5) {
                         contCalfMayorA5++;
                         sumaMayorA5 = sumaMayorA5 + calificacion;
                    } else if (calificacion < 4) {
                         contCalfMenorA4++;
                         sumaMenorA4 = sumaMenorA4 + calificacion;
                    }
               }
               sumaTotal = sumaTotal + calificacion;
          }

          System.out.println("el numero de calificaciones a 1 es: " + contCalfA1);

          if (contCalfMayorA5 == 0){
               System.out.println("no se puede obtener el promedio mayor a 5");
          }else {
               promedioMayorA5 = sumaMayorA5 / contCalfMayorA5;
               System.out.println("promedioMayorA5 = " + promedioMayorA5);
          }

          if (contCalfMenorA4 == 0){
               System.out.println("no se puede obtener promedio menor a 4");
          }else {
               promedioMenorA4 = sumaMenorA4/contCalfMenorA4;
               System.out.println("promedioMenorA4 = " + promedioMenorA4);
          }






     }
}
