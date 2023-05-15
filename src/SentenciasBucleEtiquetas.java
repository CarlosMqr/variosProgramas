public class SentenciasBucleEtiquetas {
     public static void main(String[] args) {
          bucle1:
          for (int i = 0; i < 5; i++) {

               System.out.println();
               for(int j= 0; j < 5; j++) {
                    if (i == 2) {// evalua cuando i vale 2 y lo saltara
                         continue bucle1;/* indica que continue con el primer for
                                           de lo contrario continuara con el segundo for
                                         */
                    }
                    System.out.print("[i = " + i  + ",j = " + j + "], ");
               }
          }

          System.out.println("\n");

          etiqueta:
          for (int i = 0; i < 5; i++) {
               System.out.println();
               for(int j= 0; j < 5; j++) {
                    if (i == 2) {// evalua cuando i vale 2 y lo saltara
                         break etiqueta;//rompe el ciclo del primer for y las demás iteraciones ya no se realizan


                    }
                    System.out.print("[i = " + i  + ",j = " + j + "], ");
               }
          }
     }
}
