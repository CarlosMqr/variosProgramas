import javax.swing.*;
import java.util.Scanner;

public class RepasoProgramas {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingresa la cantidad de numeros para comparar");
          int cantidad = scanner.nextInt();
          if (cantidad < 10){
               System.out.println("ingresa 10 numeros al meos");
          }else {
               int valorMax = Integer.MAX_VALUE;
               int compara =0;

               for (int i=0; i<cantidad; i++){
                    System.out.println("ingresa valor" + (i+1) + ": ");
                    compara = scanner.nextInt();
                    valorMax = (compara < valorMax) ? compara: valorMax;
               }
               System.out.println(valorMax);

               if (valorMax < 10){
                    System.out.println("El numero: " + valorMax + " es menor que 10");
               } else {
                    System.out.println("el numero: " + valorMax + " es igual o mayor que 10");

               }
          }

     }


     }// fin del main

