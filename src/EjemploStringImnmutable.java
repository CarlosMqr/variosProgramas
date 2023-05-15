public class EjemploStringImnmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        System.out.println("curso = " + curso);//para indicar que curso no cambia es inmutable
        String resultado = curso.concat(profesor);//metodo concat() une curso con profesor
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);//no son iguales, ya que son objetos diferentes y compara por referencia

        String resultado2 = curso.transform(c -> {
           return c + " con " + profesor;
        });//funcion landa
        System.out.println("resultado2 = " + resultado2);
        System.out.println("curso = " + curso);//para indicar que curso no cambia es inmutable



    }
}
