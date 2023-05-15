class persona{
     //atributo
     private String nombre;
     //visibilidad; tipo de dato; nombre de la variable

     //metodo que modifica el nombre
     public void modificarNombre(String nuevoNombre){

          this.nombre = nuevoNombre;
     }
     /*
     Public = para que se pueda usar en metodo Main
     void = no retorna valor
     nombre del metodo = modificarNombre
     recibe un String nuevoNombre
      */
     // this. Hace referencia al objeto o atributo de la clase

     public String leerNombre(){

          return this.nombre;
     }
}

public class PasarPorReferencia2 {
     public static void main(String[] args) {
          persona persona = new persona();//se crea una instancia de la clase persona
          persona.modificarNombre("Carlos");//metodo en donde se asigna el nombre

          System.out.println("iniciamos el main");

          System.out.println("persona.modificarNombre(); = " + persona.leerNombre());// imprime carlos

          System.out.println("Antes de invocar el metodo test");
          /*
          manera de invocar el metodo
           */
          test(persona);
          System.out.println("despues de llamar el metodo test");

          System.out.println("persona.modificarNombre(); = " + persona.leerNombre());//imprime jazmin
          /*
          como es de referencia el objeto se cambió el nombre con el metodo TEST y también
          se verá cambiado en le metodo Main
           */

          System.out.println("Finaliza em metodo main con los datos de la persona modificados! ");

     }//fin del main
     /*
     public = es un metodo público
     static = es un metodo estatico y se puede invocar sin crear el objeto; usando el
     nombre del metodo
     void = no retorna ningun valor
      */

     public static void test(persona persona){//se recibe el tipo en este caso es un objeto llamado persona
                                              // y un nombre de atributo = persona
          System.out.println("Iniciamos el metodo test");
          persona.modificarNombre("jazmin");
          /*
          en el metodo persona.modificarNombre("jazmin"); se modifica el nombre de la
          persona
           */
          System.out.println("finaliza el metodo test");
     }
}
