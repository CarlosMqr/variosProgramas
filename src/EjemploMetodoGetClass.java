import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
     public static void main(String[] args) {
          String texto = "hola que tal";

          Class strClass = texto.getClass(); //retorna un tipo clase
          System.out.println("strClass = " + strClass.getName());
          System.out.println("strClass = " + strClass.getSimpleName());
          System.out.println("strClass = " + strClass.getPackageName());
          System.out.println("strClass = " + strClass);

          /*for(Method metodo: strClass.getMethods()){
               System.out.println("metodo = " + metodo.getName());
          }*/

          Integer num = 12;
          Class intClass = num.getClass();
          System.out.println("intClass.getName() = " + intClass.getName());
          System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
          System.out.println("intClass.getPackageName() = " + intClass.getPackageName());

          for (Method metodo: intClass.getMethods()){
               System.out.println("metodo = " + metodo);
          }
     }
}
