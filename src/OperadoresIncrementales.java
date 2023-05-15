public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Pre Incremento
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i;// i = i + 1 = 2 se incrementa primero y luego se asigna el valor a j
        //ahora i equivale a 2 porque se incremento ++i
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println();
        System.out.println();

        //Post Incremento
         i = 2;// i + 1 = 3
        System.out.println("i = " + i);
         j = i ++ ;// j = 2 se incrementa i pero j no
        System.out.println("j = " + j);
        System.out.println();

        //Pre decremento
        i = 3;
        System.out.println("i = " + i);
        j = --i;//j vale 2 porque se decrementa y se asigna a j
        System.out.println("i = " + i);// ahora i equivale a 2 porque se decremento
        System.out.println("j = " + j);

        //post decremento
        i = 4;
        System.out.println("i = " + i);
        j = i-- ;// j se queda en 4 y i ahora vale 3
        System.out.println("j = " + j);





    }
}
