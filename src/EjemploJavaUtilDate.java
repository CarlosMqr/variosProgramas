import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
     public static void main(String[] args) {

          Date fecha = new Date();
          System.out.println("fecha = " + fecha);

          SimpleDateFormat df = new SimpleDateFormat(" EEEE dd MMMM YYYY");
          String fechaStr = df.format(fecha);
          long j =0;
          for (int i =0; i<10000000; i++){// calcula el tiempo en terminar el proceso del for
               j +=i;
          }
          System.out.println("j = " + j);
          Date fecha2 = new Date();
          long fechaFinal = fecha2.getTime() - fecha.getTime();//calcula el tiempo transcurrido
                                                               //antes y despues del for
          System.out.println("Tiempo transcurrido en el for = " + fechaFinal);

          System.out.println("fechaStr = " + fechaStr);
     }
}
