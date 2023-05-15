import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
     public static void main(String[] args) {
          //como convertir un String dado por el usuario en una fecha
          Scanner s = new Scanner(System.in);

          SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd");

          System.out.println("Ingresa fecha 'yyyy-MM-dd' ");
          try {
               Date fecha = format.parse(s.next());
               /*
               Date fecha = format.parse(s.next()) = de esta forma se puede
               transformar una fecha String dada por el usuario
                */
               System.out.println("fecha = " + fecha);
               System.out.println("format = " + format.format(fecha));

               Date fecha2 = new Date();
               System.out.println("fecha2 = " + fecha2);

               if (fecha.after(fecha2)){
                    System.out.println("fecha dada por el usuario es despues que la fecha2 (actual)");
               } else if (fecha.before(fecha2)) {
                    System.out.println("fecha dada por el usuario es anterior que la fecha2 (actual)");
               } else if (fecha.equals(fecha2)) {
                    System.out.println("las fechas son iguales");
               }

               if (fecha.compareTo(fecha2) > 0){
                    System.out.println("fecha dada por el usuario es despues que la fecha2 (actual)");
               } else if (fecha.compareTo(fecha2) < 0) {
                    System.out.println("fecha dada por el usuario es anterior que la fecha2 (actual)");
               }else if (fecha.compareTo(fecha2) == 0){
                    System.out.println("las fechas son iguales");
               }


          } catch (ParseException e) {

          }
     }
}
