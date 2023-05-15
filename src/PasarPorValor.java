public class PasarPorValor {
     public static void main(String[] args) {
          int i = 10;
          System.out.println("iniciamos el main con i = " + i);
          /*
          manera de invocar el metodo
           */
          tes(i);
          System.out.println("finaliza el metodo main con el valor de i = " + i);
          //se mantiene i con el valor de 10
          //por ser inmutable
     }
     /*
     public = es un metodo público
     static = es un metodo estatico y se puede invocar sin crear el objeto; usando el
     nombre del metodo
     void = no retorna ningun valor
      */

     public static void tes(int i){
          System.out.println("Iniciamos el metodo test con i = " + i);
          i = 35;
          System.out.println("finaliza el metodo test con i = " + i);
     }
}
