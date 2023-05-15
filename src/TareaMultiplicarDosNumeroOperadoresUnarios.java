import java.util.Scanner;

public class TareaMultiplicarDosNumeroOperadoresUnarios {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("ingresa primer valor A");//5
          int numeroA = scanner.nextInt();
          System.out.println("ingresa segundo valor B");//-5
          int numeroB = scanner.nextInt();

          boolean positivoA = numeroA > -1; // forma para sabre si un numero es positivo o negativo
                                            // (-1)(5) ley de signos: resultado = -5, pero la operacion positiva,
                                           // ya que busca que sea negativo el número
          boolean positivoB = numeroB > -1;
                                            //forma para sabre si un numero es positivo o negativo
                                            //(-1)(5) ley de signos = -5 positivo

          int calcular = positivoA ? numeroA : -numeroA;// operador ternario
          int resultado=0;

          for (int i = 0; i<calcular; i++){
               resultado = resultado + numeroB;//suma n veces dado por el usuario
          }

          if ((!positivoA && !positivoB || !positivoA)){
               resultado = -resultado;
          }
          System.out.println("resultado = " + resultado);
     }
}
