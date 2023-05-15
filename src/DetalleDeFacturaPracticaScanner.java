import javax.swing.*;
import java.util.Scanner;

public class DetalleDeFacturaPracticaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de factura");
        String nombre = scanner.nextLine();//cacha el nombre de la factura

        System.out.println("ingresa precio de producto 1 ");
        double producto1 = scanner.nextDouble();//ingresar el valor desde la consola y automaticamente lo convierte en double
        System.out.println("ingresa precio de producto 2 ");
        double producto2 = scanner.nextDouble();//ingresar el valor desde la consola y automaticamente lo convierte en double

        double total = producto1 + producto2;
        double totalImpuesto = total * 0.19;
        double totalNeto = total + totalImpuesto;

        String detalle = "Factura: " + nombre +"\n" + "tiene un total de " + total
                + "\nimpuesto de " + totalImpuesto
                + " \ntotal a pagar con impuestos " + totalNeto;
        System.out.println(detalle);
        /*
        se puede asignar a un String el resultado de las operaciones, ya que al
        imprimir el String lo tomara
        como texto lo almacenado en los double
         */

        /*String factura = JOptionPane.showInputDialog(null,"Nombre de la compra");
        String producto1 = JOptionPane.showInputDialog(null,"Ingresa precio de producto 1");
        String producto2 = JOptionPane.showInputDialog(null,"Ingresa precio de producto 2");

        double a = Double.parseDouble(producto1);
        double b = Double.parseDouble(producto2);

        double total = a + b;
        double totalImpuesto = total * 0.19;
        double totalNeto = total + totalImpuesto;

        String detalle = "Factura: " + factura +"\n" + "tiene un total de " + total
                + "\nimpuesto de " + totalImpuesto
                + " \ntotal a pagar con impuestos " + totalNeto;
        System.out.println(detalle);*/


    }
}
