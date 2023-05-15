import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double matematicas = 0.0;
        double calculo = 0.0;
        double historia = 0.0;

        System.out.println("Ingresa calificacion de matematicas");
        matematicas = s.nextDouble();
        System.out.println("Ingresa calificacion de calculo");
        calculo= s.nextDouble();
        System.out.println("Ingresa calificacion de historia");
        historia = s.nextDouble();

        double promedio = (matematicas + calculo + historia) / 3;
        System.out.println("promedio = " + promedio);

        String calificacion = "";

        calificacion = promedio>=6.0 ? "Aprobado": "Reprobado";
        System.out.println("calificacion = " + calificacion);
        /*
        los operadores ternarios funcionan como un if
        si la variable calificacion = ""; es un String entonces el valor que retornara sera
        un String
        el valor que se pretenda retornar sera el tipo de dato
        el signo de ? indica el cuestionamiento a evaluar ejemplo promedio>=6.0 ?
        y los dos : indican de lo contrario u otra alternativa ejemplo "Aprobado": "Reprobado";
         */
    }
}
