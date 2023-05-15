import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Repaso {
    public static void main(String[] args) {

        //Programa 1
        //a través de una ventana obtener un número entero para
        //convertirlo a Binario, Octal y hexadecimal
        //usar try catch para manejo de error de introducir letras

        /*String numeroStr = JOptionPane.showInputDialog(null,"Ingresa un número sin decimales");
        int valor = 0;

        try {
            valor = Integer.parseInt(numeroStr);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error! solo números");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Número Binario de: " + valor + " = "  +Integer.toBinaryString(valor);
        String resultadoOctal = "Número Octal de: " + valor + " = " + Integer.toOctalString(valor);
        String resultadoHex = "Número Hexadecimal de: " + valor + " = " + Integer.toHexString(valor);

        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);*/

        //Programa 2
        //con la clase Scanner introducir un número entero
        //y convertirlo en Binario Octal y Hexadecimal
        //con try catch cachar el error de introducir letras

       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero sin decimales");
        int numero = 0;

        try {
            numero = scanner.nextInt();
        }catch (NumberFormatException e){
            System.out.println("Error!! solo números");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "Número Binario de: " + número + " = "  +Integer.toBinaryString(numero);
        String resultadoOctal = "Número Binario de: " + número + " = "  +Integer.toOctalString(numero);
        String resultadoHex = "Número Binario de: " + número + " = "  +Integer.toHexString(numero);

        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        System.out.println(mensaje);*/

        //programa 3
        //a través de la clase Scanner introducir tres nombres y obtener
        //la segunda letra en mayúscula seguida de un punto y obtener
        //las dos ultimas letras del nombre

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa primer nombre");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingresa segundo nombre");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreA.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingresa tercer nombre");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String mensaje = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
        System.out.println("mensaje = " + mensaje);*/
        //
        //mismo programa pero atraves de una ventana
        //
        /*String nombreD = JOptionPane.showInputDialog(null,"Ingresa primer nombre");
        String nombreD2 = nombreD.toUpperCase().charAt(1) + "." + nombreD.substring(nombreD.length()-2);

        String nombreE = JOptionPane.showInputDialog("Ingresa segundo nombre");
        String nombreE2 = nombreE.toUpperCase().charAt(1) + "." + nombreE.substring(nombreE.length()-2);

        String nombreF = JOptionPane.showInputDialog(null,"Ingresa tercer nombre");
        String nombreF2 = nombreF.toUpperCase().charAt(1) + "." + nombreF.substring(nombreF.length()-2);

        String mensaje2 = nombreD2 + "_" + nombreE2 + "_" + nombreF2;
        JOptionPane.showMessageDialog(null,mensaje2);*/

        //programa 4
        //calcular el precio de tres productos, con iva de 0.19
        //a traves de la clase Scanner usando double

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre de la compra");
        String factura = scanner.nextLine();

        System.out.println("Ingresa precio de producto 1");
        double producto1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingresa precio de producto 2");
        double producto2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingresa precio de producto 3");
        double producto3 = Double.parseDouble(scanner.nextLine());

        double total = producto1 + producto2 + producto3;
        double iva = total * 0.19;
        double totalImpuesto = total + iva;

        String resultado = "Total = " + total + "\n" + "IVA = " + iva + "\n" + "Total a pagar con impuestos = " + totalImpuesto;

        System.out.println(resultado);*/

        //calcular el precio de dos productos
        //a traves de una ventana

        /*String producto1 = JOptionPane.showInputDialog(null,"Ingresa precio de producto 1");
        double prod1 = Double.parseDouble(producto1);
        String producto2 = JOptionPane.showInputDialog(null,"Ingresa precio de producto 2");
        double prod2 = Double.parseDouble(producto2);
        String producto3 = JOptionPane.showInputDialog(null,"Ingresa precio de producto 3");
        double prod3 = Double.parseDouble(producto3);

        double total = prod1 + prod2 + prod3;
        double iva = total * 0.19;
        double totalIva = total + iva;

        String mensaje = "total de su compra: " + total + "\n" + "IVA: " + iva + "\n" + "total con impuestos: " + totalIva;
        JOptionPane.showMessageDialog(null,mensaje);*/

        ////////////////////////////////

      /*  String userName = "carlos";
        String password = "1425581";
        String userName2 = "jazmin";
        String password2 = "1325423";*/

        String[] username = new String[3];
        username[0] = "carlos";
        username[1] = "jazmin";
        username[2] = "jessy";
        String[] password = new String[3];
        password[0] = "1425581";
        password[1] = "1325423";
        password[2] = "722";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa usuario: ");
        String us = scanner.nextLine();
        System.out.println("Ingresa contraseña");
        String pass = scanner.nextLine();

        boolean valida = false;
       // int largo = username.length;

        for (int i =0; i < username.length; i++ ){
            if (username[i].equals(us) && password[i].equals(pass)){
                valida = true;
                break;
            }

        }

            if (valida){
                System.out.println("Bienvenido!! ".concat(us));
                // mas codigo
                System.out.println("Ingresa primer nombre");
                String nombreA = scanner.nextLine();
                String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

                System.out.println("Ingresa segundo nombre");
                String nombreB = scanner.nextLine();
                String nombreB2 = nombreA.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

                System.out.println("Ingresa tercer nombre");
                String nombreC = scanner.nextLine();
                String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

                String mensaje = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
                System.out.println("mensaje = " + mensaje);


            }else {
                System.out.println("Error!!" + "\n" + "Contraseña o Usuario Invalido");
                main(args);
                System.exit(0);
                System.out.println("Requiere validar!!");
            }

    }
    }

