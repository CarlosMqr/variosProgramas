import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
     public static void main(String[] args) {
          Calendar calendar = Calendar.getInstance();
          /*
          Calendar = es una clase abstracta y no se debe usar el operador NEW
          getInstance() = invoca y crea la instancia de la clase calendar
           */

          //calendar.set(2020,11,25, 18, 20);
          /*
          De esta forma se puede agregar una fecha cualquiera
          ya sea pasada o posterior
           */
          //el mes comienza en 0 hasta 11
          //Otra forma de agregar una fecha específica
          calendar.set(Calendar.YEAR, 2020);
          calendar.set(Calendar.MONTH, Calendar.JULY);
          calendar.set(Calendar.DAY_OF_MONTH, 25 );

          //calendar.set(Calendar.HOUR_OF_DAY, 21);
          calendar.set(Calendar.HOUR,7);
          calendar.set(Calendar.AM_PM, Calendar.AM);
          calendar.set(Calendar.MINUTE, 20);
          calendar.set(Calendar.SECOND, 10);

          Date fecha = calendar.getTime();//retorna un date String
          System.out.println("calendar = " + fecha);
          System.out.println("Fecha sin formato = " + fecha);

          //para darle formato a la fecha
          SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd hh:mm:ss a");
          //4y = minúscula para el año
          //MMMM = en mayúscula 4 para nombre completo del mes
          //dd = 2 en minúscula para dia
          //HH = formato de 24 horas
          //hh = formato 12 horas
          //mm = para minutos
          //ss = para segundo
          //a = para indicar a.m. o p.m.

          String fechaFormato = formato.format(fecha);
          System.out.println("fechaFormato = " + fechaFormato);
     }
}
