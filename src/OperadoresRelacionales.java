public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j;
        System.out.println("b1 = " + b1 + "\n");

        boolean b2 = i!=j;// distinto !=
        System.out.println("b2 = " + b2 + "\n");

        boolean b3 = m == true;
        System.out.println("b3 = " + b3 + "\n");
        boolean b4 = m != true;
        System.out.println("b4 = " + b4 + "\n");

        boolean b6 = i > j;
        System.out.println("b6 = " + b6);
        boolean b7 = i < j;
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k;
        System.out.println("b8 = " + b8);
        boolean b9 = l<=k;
        System.out.println("b9 = " + b9);



    }
}
