public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr = "50";
         int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String numeroDoubleStr = "9876543e-3";
        double numeroD = Double.parseDouble(numeroDoubleStr);
        System.out.println("numeroD = " + numeroD);

        String logico = "true";
        boolean tf = Boolean.parseBoolean(logico);
        System.out.println("tf = " + tf);

        String numeroFloat = "15.50";
        float numeroF = Float.parseFloat(numeroFloat);
        System.out.println("numeroF = " + numeroF);
        //convertir de enteros a String

        int valor = 100;
        String valorStr = Integer.toString(valor);
        System.out.println("valorStr = " + valorStr);
        valorStr = String.valueOf(valor);//String.valueOf
        System.out.println("valorStr = " + valorStr);
    }
}
