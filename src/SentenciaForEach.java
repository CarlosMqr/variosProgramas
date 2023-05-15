public class SentenciaForEach {
     public static void main(String[] args) {
          // la sentencia foreach solo se usa para arreglos
          int[] numero = {1,3,5,7,9,11,13,15};
          for (int num : numero){ /* en la variable num se asigna los valores del arreglo
                                      como está dentro del for asignara todos los elementos e
                                      imprime cada uno de los elementos
                                   */

               System.out.println("a = " + num);// no es necesario poner corchetes y el índice
          }

          String [] nombre = {"carlos","jazmin","jessy","adriana","daniela","charin"};
          for(String nombres : nombre){
               System.out.println("nombres = " + nombres);
          }




     }
}
