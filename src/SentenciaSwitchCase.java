import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        /*int num = 4;
        switch (num){
            case 0:
                System.out.println("el numero es cero");
                break;
            case 1:
                System.out.println("el numero uno");
                break;
            case 2:
                System.out.println("el numero es dos");
                break;
            case 3:
                System.out.println("el numero es tres");
                break;
            default:
                System.out.println("numero desconocido");
        }
        String nombre = "jazmin";
        switch (nombre){
            case "admin":
                System.out.println("Bienvenido admin");
                break;
            case "carlos":
                System.out.println("Te quiero jazmin");
                break;
            case "jazmin":
                System.out.println("eres la mejor");
                break;
            default:
                System.out.println("usuario desconocido");
        }*/

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero entre 1 al 12");
        int mes = scanner.nextInt();
        String nombreMes = null;
        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("invalido");
                break;
        }
        System.out.println(nombreMes);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el mes en numero");
        int mes = scanner.nextInt();
        System.out.println("ingresa año");
        int anio = scanner.nextInt();
        int numeroDias = 0;

        switch (mes){
            case 1:   //para todos estos meses es el mismo número de dias
                      // el break no es necesario ponerlo
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:   //para todos estos meses es el mismo número de dias
                      // el break no es necesario ponerlo
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 ==0) && !(anio % 100 == 0))){
                    numeroDias = 29;

                }else {
                    numeroDias = 28;
                }
                break;
        }
        if(mes == 1){
            System.out.println("Enero tiene " + numeroDias + " dias");
        } else if (mes == 3) {
            System.out.println("Marzo tiene " + numeroDias + " dias");
        } else if (mes == 5) {
            System.out.println("Mayo tiene " + numeroDias + " dias");
        } else if (mes == 7) {
            System.out.println("Julio tiene " + numeroDias + " dias");
        } else if (mes == 8) {
            System.out.println("Agosto tiene " + numeroDias + " dias");
        } else if (mes == 10) {
            System.out.println("Octubre tiene " + numeroDias + " dias");
        } else if (mes == 12) {
            System.out.println("Diciembre tiene " + numeroDias + " dias");
        } else if (mes == 4) {
            System.out.println("Abril tiene " + numeroDias + " dias");
        } else if (mes == 6) {
            System.out.println("Junio tiene " + numeroDias + " dias");
        } else if (mes == 9 ) {
            System.out.println("Septiembre tiene " + numeroDias + " dias");
        } else if (mes == 11) {
            System.out.println("Noviembre tiene " + numeroDias + " dias");
        } else if (mes == 2 && numeroDias == 29) {
            System.out.println("Es año bisiesto con " + numeroDias + " dias");
        }else {
            System.out.println("febrero tiene " + numeroDias + " dias");
        }


    }
}
