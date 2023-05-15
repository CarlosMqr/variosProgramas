public class WrapperOperadoresRelacionales {
     public static void main(String[] args) {
           Integer num1 = Integer.valueOf(1000);
           Integer num2 = num1;// son objetos que contiene un valor
                               // num2 al hacer referencia a num1 son el mismo objeto

          System.out.println("num1 = " + num1);
          System.out.println("num2 = " + num2);
          System.out.println("es igual ? " + (num1==num2));//compara por el objeto y no el valor
                                                           //son el mismo objeto

          num2 = 1000;// no apunto a otro objeto

          System.out.println("es igual ? " + (num1==num2));//no es igual, ya que es otro objeto
          System.out.println("\n");

          System.out.println("es igual ? " + num1.equals(num2));
     }
}
