import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
       //float promedio = 7.5f;
       /*Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu promedio general");
        float promedio = scanner.nextFloat();
        System.out.println("tu promedio es: " + promedio);
        if (promedio == 10){
            System.out.println("excelente promedio");
        }else if (promedio >= 9.0){
            System.out.println("muy bien promedio");
        } else if (promedio >= 8.0 ) {
            System.out.println("buen promedio");
        } else if (promedio >= 7.0) {
            System.out.println("promedio regular");
        } else if (promedio >= 6.0) {
            System.out.println("promedio bajo");
        } else if (promedio < 6.0) {
            System.out.println("reprobado");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el mes en numero");
        int mes = scanner.nextInt();
        //int mes = 2;
        System.out.println("ingresa año");
        int anio = scanner.nextInt();
        int numeroDias = 0;
        //int anio = 1800;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 ==0) && !(anio % 100 == 0))){
                numeroDias = 29;
                System.out.println("año bisiesto");
            }else {
                numeroDias = 28;
            }
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
        }
    }
}
