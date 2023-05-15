import java.util.Scanner;

public class TareaBuscarNumeroMenor {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingresa la cantidad de numeros a compara: ");
          int cantidad = scanner.nextInt();
          if(cantidad <= 9 ){
               System.out.println("Ingresa al menos 10 digitos enteros");
          }else {
               int numeroMenor = Integer.MAX_VALUE;
               int valor =0;

               for(int i =0; i< cantidad; i++){
                    System.out.println("ingresa valor " + (i+1) + ": ");
                    valor = scanner.nextInt();
                    numeroMenor = (valor < numeroMenor) ? valor : numeroMenor;
               }
               System.out.println(numeroMenor);
               
               if (numeroMenor < 10){
                    System.out.println("El numero: " + numeroMenor + " es menor que 10");
               } else {
                    System.out.println("el numero: " + numeroMenor + " es igual o mayor que 10");
                    
               }


          }
          
          

          









     }
}
