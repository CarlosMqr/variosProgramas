public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        /*String trabalenguas = "trabalenguas";
        int largo1 = trabalenguas.length();
        System.out.println("largo1 = " + largo1);

        char[] arreglo = trabalenguas.toCharArray();
        int largo2 = arreglo.length;//length es un atributo, ya que parte de un arreglo
        System.out.println("largo2 = " + largo2);

        for(int i = 0; i<largo2; i++) {
            System.out.println("arreglo = " + arreglo[i]);
        }
        System.out.println();

        String [] arreglo2 = trabalenguas.split("a");
        *//*un String puede ser un arreglo, ya que
        contiene más de un caracter
        el metodo split() convierte el String en un arreglo de tipo String
        y omitira el caracter indicado en los parentesis*//*
        int l = arreglo2.length;
        for (int j = 0; j < l;j++){
            System.out.println("arreglo2 = " + arreglo2[j]);
        }*/


       /* String nombre = "jazmin diaz rodrigues";
        String [] arr = nombre.split("a");
        int k = arr.length;
        int m = nombre.indexOf("d");
        int t = nombre.lastIndexOf("z");

        for (int s = 0; m < t; s++){
            System.out.println(arr[s]);
        }*/

        String nombre = "jazmin.diaz.rodrigues";
        char [] arr = nombre.toUpperCase().substring(nombre.indexOf("d"),nombre.lastIndexOf(".")).toCharArray();// el metodo toCharArray() convierte el String en un arreglo
        //int k = arr.length;                            // de tipo char
        //int t = nombre.indexOf("d");
       // int r = nombre.lastIndexOf(".");

        /*for (int i = t; i < r ; i++){
            System.out.println(arr[i]);
        }*/

        for (char nom:arr){
            System.out.print(nom);
        }



    
    
    }
    
    
    
}
