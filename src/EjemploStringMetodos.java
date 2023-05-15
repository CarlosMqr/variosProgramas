public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Carlos";
        System.out.println("length() = " + nombre.length());//sirve para saber el largo de la cadena o String
        //retorna un entero = int
        //int resultado1 = nombre.length();
        //        System.out.println("resultado1 = " + resultado1);

        System.out.println("toUpperCase() = " + nombre.toUpperCase()); //sirve para convertir a mayusculas
        System.out.println("toLowerCase() = " + nombre.toLowerCase());// sirve para convertir a minisculas
        //retorna un String
        //String resultado2 = nombre.toUpperCase();
        //        System.out.println("resultado2 = " + resultado2);

        System.out.println("equals(\"Carlos\") = " + nombre.equals("Carlos"));//sirve para comparar si es igual el valor de los string
        System.out.println("equals(\"carlos\") = " + nombre.equals("carlos"));
        System.out.println("equalsIgnoreCase() = " + nombre.equalsIgnoreCase("carlos"));//sirve para comparar Strings sin importar mayuzculas o minisculas
        //equals() retorna un boolean
        //boolean resultado4 = nombre.equals("Carlos");
        //        System.out.println("resultado4 = " + resultado4);

        System.out.println("nombre.compareTo(\"Carlos\") = " + nombre.compareTo("Carlos"));//compara en orden lexico grafico 
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Jazmin"));

        System.out.println("nombre.charAt() = " + nombre.charAt(0));//sirve para obtener un caracter del String
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));/* obtiene el utimo caracter
                                                                                                      de forma dinamica usando el
                                                                                                      metodo length*/

        //charAt() retorna un char
        //char resultado7 = nombre.charAt(2);
        //        System.out.println("resultado7 = " + resultado7);

        System.out.println("nombre.substring() = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));//sirve para obtener una parte del String x,n
        //substring() retorna un String
        //String resultado9 = nombre.substring(1,5);
        //        System.out.println("resultado9 = " + resultado9);

        String trabalenguas = "trabalenguas";

        System.out.println("replace(\"a\",\".\") = " + trabalenguas.replace("a","."));//sirve para remplazar un caracter del string
        //replace() retorna un String
        //String resultado10 = trabalenguas.replace("a","8");
        //        System.out.println("resultado10 = " + resultado10);
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('a'));//sirve para saber si se encuentra el caracter en el String primera ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));//sirve para saber si se encuentra el caracter en el String ultima ocurrencia
        //retorna un entero = int
        //int resultado11 = trabalenguas.indexOf('a');
        //        System.out.println("resultado11 = " + resultado11);
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));//indica true o false si el caracter esta dentro o no del String
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("traba"));//indica true o false si comienza con lo indicado
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));//indica true o false si termina con lo indicado
        //retornan un boolean
        //boolean resultadoA = trabalenguas.contains("tra");
        //        System.out.println("resultadoA = " + resultadoA);
        //boolean resultadoB = trabalenguas.startsWith("lenguas");
        //        System.out.println("resultadoB = " + resultadoB);
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());//quita los espacios a la derecha e izquierda
    
    
    }
    
    
    
}
