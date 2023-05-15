public class OperadorInstanceOf {
    public static void main(String[] args) {
        /*
        el operdor instanceof sirve para indicar si el valor
        pertenece al tipo de dato que tiene asignado
        ejemplo: texto instanceof String
         */
        //la clase object es la clase padre de todos los objetos y de todas las clases
        //un Integer, float, double pertenecen a la clase padre Number asi mismo a la clase object

        String texto = "creando un objeto de la clase string";

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String? = " + b1);

        Integer num = 7;

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer? = " + b1);


    }
}
