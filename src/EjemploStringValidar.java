public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null; // para validar si curso es nulo y verdadero es nulo
        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = "programacion Java";
        }

        boolean esVacio = curso.length() == 0;//evalua si hay contenido
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();//verifica si el String esta vacio
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();//verifica si el string es un caracter en blanco
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

    }
}
