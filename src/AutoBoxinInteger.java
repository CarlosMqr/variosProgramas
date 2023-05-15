public class AutoBoxinInteger {
     public static void main(String[] args) {
          Integer[] enteros= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

          int suma =0;

          for (Integer arr: enteros) {
               if (arr.intValue() % 2 == 0){
                    suma += arr.intValue();// no es necesario poner explicitamente =arr.intValue()
                                           // Java hace el autoboxing automáticamente y lo convierte en int
               }
          }
          System.out.println("suma = " + suma);

          //EJEMPLO autoboxing/////////////////////////////
          /*
          se elimino = arr.intValue() ya que java llama el metodo intValue() y
          ya no es necesario agregarlo explicitamente
           */
          int sum=0;

          for (Integer arr: enteros) {
               if (arr % 2 == 0){
                    sum += arr;
               }
          }
          System.out.println("suma = " + sum);






     }
}
