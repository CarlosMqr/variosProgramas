public class WrapperBoolean {
     public static void main(String[] args) {
          Integer num1, num2;
          num1 = 1;
          num2 = 2;

          boolean primBoolean = num1 > num2;
          Boolean objBoolean = Boolean.valueOf(primBoolean);
          Boolean objBoolean2 = Boolean.valueOf("false");

          System.out.println("primBoolean = " + primBoolean);
          System.out.println("objBoolean = " + objBoolean);
          System.out.println("objBoolean2 = " + objBoolean2);

          System.out.println(" comparando dos obj boolean " + (objBoolean == objBoolean2));//compara por valor
          // no importa si se usa == o el metodo .equals
          System.out.println("comparando dos obj boolean " + objBoolean.equals(objBoolean2));
     }
}
