public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación en Java";
        String curso2 = new String("Programación en Java");

        boolean esIgual = curso==curso2;//compara al String por referencia
        System.out.println("curso==curso2 = " + esIgual);

        esIgual = curso.equals(curso2);//compara al String por el valor asignado
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación en Java";
        esIgual = curso == curso3;/* es verdadero porque se asigna en la literal y se asigna la referencia de curso a curso3
                                     para obtimizar y se guarda en variable distinta*/
        System.out.println("curso == curso3 " + esIgual);



    }
}
