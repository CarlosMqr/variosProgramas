import java.util.Random;

public class ClaseMathRandom {
     public static void main(String[] args) {

          String[] colores = {"azul","amarillo","rojo","verde","blanco","negro",};
          double aleatorio = Math.random();
          System.out.println("aleatorio = " + aleatorio);

          aleatorio *= colores.length;
          System.out.println("aleatorio = " + aleatorio);

          aleatorio = Math.floor(aleatorio);
          System.out.println("aleatorio = " + aleatorio);
          System.out.println("colores = " + colores[(int) aleatorio]);

          System.out.println("\n");
          ///////////////////////////////////////////////////////////////////////////////////////////////////////
          //////////////////////////////////////////////////////////////////////////////////////////////////////
          Random random = new Random();//clase random forma de instanciar
          int randomInt = random.nextInt();
          System.out.println("randomInt = " + randomInt);

          randomInt = random.nextInt(colores.length);
          System.out.println("randomInt = " + randomInt);
          System.out.println("colores = " + colores[randomInt]);
     }
}
