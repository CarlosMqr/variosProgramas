public class SentenciaBucleEtiquetaBuscar {
     public static void main(String[] args) {
          String frase = "trigo tres trigo tristes tigres tragan trigo en un trigaltrigo";
          String palabra = "trigo";

          int maxFrase = frase.length();// en la variable maxFrase se almacena el largo de la frase
          int maxPalabra = palabra.length();// en la variable maxPalabra se almacena el largo de la palabra
          int cantidad = 0;
          buscar:
          for (int i = 0; i < maxFrase; i++) { // recorre toda la frase i = 0 = t, i = 1 = r
               int k = i;/* la variable k toma el valor de la variable i para poder incrementarse, de lo
                         contrario no realiza lo adecuado*/
               for (int j = 0; j < maxPalabra; j++) {// recorre la palabra j = 0 = t, j = 1 = r, j = 2 = i
                    if (frase.charAt(k++) != palabra.charAt(j)) {/* evalua que la variable palabra sea igual a la
                                                                  variable palabra de la frase*/
                         continue buscar; /*continúa con la iteración del for padre de lo
                                            contrario hay error, ya que la itercion padre es más larga*/
                    }

               }
               cantidad++;// suma la cantidad de veces la palabra encontrada
          }
          System.out.println("se encontró = " + cantidad + " veces  en la frase");


     }
}
