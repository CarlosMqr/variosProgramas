public class ClaseMath {
     public static void main(String[] args) {
          int absoluto = Math.abs(-3);
          System.out.println("absoluto = " + absoluto);

          double max = Math.max(3.5, 1.2);// indica el valor maximo entre dos numeros
          System.out.println("max = " + max);

          double min = Math.min(3.5, 1.2);// indica el valor minimo entre dos numeros
          System.out.println("min = " + min);

          double techo = Math.ceil(3.5);// redondea el valor maximo // redondea asia arriba
          System.out.println("techo = " + techo);

          double piso = Math.floor(3.5);// redondea al valor minimo // redondea asia abajo
          System.out.println("piso = " + piso);

          long entero = Math.round(3.5);// redondea de forma automatica
                                        // redondea asia arriba si es mayor o igual a .5
                                        // redondea asia abajo si es menor que .5
          System.out.println("entero = " + entero);

          double exp = Math.exp(2);
          System.out.println("exp = " + exp);

          double logaritmo = Math.log(10);// logaritmo natural de 10
          System.out.println("logaritmo = " + logaritmo);

          double potencia = Math.pow(10, 3);// tres veces se multiplica 10 = 1000
          System.out.println("potencia = " + potencia);

          double raiz = Math.sqrt(5);// obtiene la raiz cuadrada de 5
          System.out.println("raiz = " + raiz);

          double grados = Math.toDegrees(1.57);
          grados = Math.round(grados);
          System.out.println("converit de radianes a grados = " + grados);

          double radianes = Math.toRadians(90);
          System.out.println("radianes = " + radianes);

          System.out.println("sin(90)" + Math.sin(radianes));// obtiene el seno de 90 grados
          System.out.println("cos(90)" + Math.cos(radianes));// obtiene el coseno de 90 grados

          radianes = Math.toRadians(180);
          System.out.println("cos(180)" + Math.cos(radianes));





     }

}
