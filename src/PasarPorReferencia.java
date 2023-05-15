public class PasarPorReferencia {
     public static void main(String[] args) {
          int[] edad = {10,11,12};

          System.out.println("iniciamos el main");
          for (int i =0 ; i< edad.length; i++){
               System.out.println("edad[i] = " + edad[i]);
          }
          System.out.println("Antes de invocar el metodo test");
          /*
          manera de invocar el metodo
           */
          test(edad);
          System.out.println("despues de llamar el metodo test");
          for (int i =0 ; i< edad.length; i++){
               System.out.println("edad[i] = " + edad[i]);
          }
          System.out.println("Finaliza em metodo main con los datos del arreglo modificados! ");
          //se mantiene i con el valor de 10
          //por ser inmutable
     }//fin del main
     /*
     public = es un metodo público
     static = es un metodo estatico y se puede invocar sin crear el objeto; usando el
     nombre del metodo
     void = no retorna ningun valor
      */

     public static void test(int[] edadArr){
          System.out.println("Iniciamos el metodo test");
          for (int i =0 ; i< edadArr.length; i++){
               edadArr[i] = edadArr[i] + 20;
          }
          System.out.println("finaliza el metodo test");
     }
}
