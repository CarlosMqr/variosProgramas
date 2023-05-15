import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularFechaDeNacimiento {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Ingresa tu fecha de nacimiento yyyy-MM-dd");
          String fechaStr = scanner.next();


          try {
               DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
               Date fechaNacimiento = df.parse(fechaStr);
               Date actual = new Date();

               df = new SimpleDateFormat("yyyyMMdd");

               int desde = Integer.parseInt(df.format(fechaNacimiento));
               int hasta = Integer.parseInt(df.format(actual));

               int edad = (hasta-desde) / 10000;
               System.out.println("Su edad es: " + edad);
          }catch (ParseException e){
               e.printStackTrace();

          }








     }
}

