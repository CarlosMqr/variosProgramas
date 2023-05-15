public class SentenciaWhile {
     public static void main(String[] args) {
          int i = 0;

          while (i<5){// mientras que variable i sea menor a 5 se imprime hasta el número 4
               System.out.println("i = " + i);
               i++;
          }

          //
          System.out.println("\n");
          //

          i = 0;
          boolean prueba = true;
          while (prueba){
               if(i==7){// el IF evalua cuando variable i es igual a 7 y cambia la variable prueba a false
                        // de lo contrario el ciclo es infinito
                    prueba = false;
               }
               System.out.println("i = " + i);
               i++;// se incrementa i
          }

          prueba = false;
          do {
               System.out.println("se ejecuta una vez");
          }while (prueba);
             /*
             el do se ejecutará una vez después se evalua el while,
             pero como es falso ya no continua con la iteración y se sale
              */
          System.out.println("\n");
          prueba = true;// se cambia el valor de la variable prueba de lo contrario de queda con el valor anterior asignado
           i = 0;// de igual forma el contador
          do {
               if (i==10){// el IF evalua cuando la variable i es igual a 10 entonces cambia el valor de
                          // la variable prueba a false para que no sea un ciclo infinito
                    prueba= false;
               }
               System.out.println("i = " + i);
               i++;
          }while (prueba);// como la variable prueba es false ya no continua con el ciclo







     }
}
