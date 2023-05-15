public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpeg";
        System.out.println("archivo.length() = " + archivo.length());

        int A = archivo.lastIndexOf('.');//es mejor usar lastIndexOf()
        System.out.println("A = " + A);
        System.out.println("archivo.substring(A) = " + archivo.substring(A + 1));//+ 1 para tomar sin el punto
        /*
        con el substring() toma todos los valores de la variable "archivo"
        y en los parentesis se tiene la variable "A" la cual tiene la
        primera ocurrencia del"." obtenida a través del metodo int A = archivo.indexOf(".")
        entonces el substring tomará como tope la variable "A" ="."
         */
    }
}
