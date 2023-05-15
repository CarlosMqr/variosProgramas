import com.sun.jdi.IntegerValue;

public class WrapperInteger {
     public static void main(String[] args) {
          int numero = 32768;
          Integer intObjeto =  Integer.valueOf(numero);// convierte el int primitivo a un Integer
          Integer intObjeto2 = 32768; // forma mas rapida de crear un Integer

          int num = intObjeto;// convierte el integer objeto a un int primitivo
          int num2 = intObjeto.intValue();//convierte el integer objeto a un int primitivo

          String num3 = "72000";
          Integer valor = Integer.valueOf(num3);// convierte un String a un Integer
     }
}
