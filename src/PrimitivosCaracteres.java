public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'a';// char usa solo un caracter, si es mas de uno marca error
        char caracter1 = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter1 = " + caracter1);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter1: " + ((decimal==caracter1)));


        System.out.println("tipo char corresponde en byte a " + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor maximo de un char: " + Character.MAX_VALUE);
        System.out.println("valor minimo de un char: " + Character.MIN_VALUE);
    }
}
