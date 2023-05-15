
import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Primer forma
        /*String[] username = new String[2];
        username[0] = "carlos";
        username[1] = "jazmin";
        String[] password = new String[2];
        password[0] = "1425581";
        password[1] = "1325423";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa usuario: ");
        String us = scanner.nextLine();
        System.out.println("Ingresa contraseña");
        String pass = scanner.nextLine();

        boolean valida = false;
        // int largo = username.length;

        for (int i =0; i < username.length; i++ ){
            if (username[i].equals(us) && password[i].equals(pass)){
                valida = true;
                break;
            }

        }

        if (valida){
            boolean ad = us.equals(username);
            if (ad){
                System.out.println("Bienvenida!! ".concat(us));
            }else{
                System.out.println("Bienvenido!! ".concat(us));
            }
            // mas codigo
            System.out.println("Ingresa primer nombre");
            String nombreA = scanner.nextLine();
            String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

            System.out.println("Ingresa segundo nombre");
            String nombreB = scanner.nextLine();
            String nombreB2 = nombreA.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

            System.out.println("Ingresa tercer nombre");
            String nombreC = scanner.nextLine();
            String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

            String mensaje = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
            System.out.println("mensaje = " + mensaje);


        }else {
            System.out.println("Error!!" + "\n" + "Contraseña o Usuario Invalido");
            main(args);
            System.exit(0);
            System.out.println("Requiere validar!!");
        }*/
        //segunda forma usar arreglos con usuarios y contraseñas forma optima
        String [] usernames = new String[3];
        usernames[0] = "carlos";
        usernames[1] = "jazmin";
        usernames[2] = "jessy";
        String [] passwords = new String[3];
        passwords[0] = "1425581";
        passwords[1] = "1325423";
        passwords[2] = "722";
        //tercera forma
//        String [] usernames = {"carlos","jazmin","daniela"};
//        String [] passwords =  {"1425581","1325423","1325423"};
        System.out.println("userName: ");
        String u = scanner.nextLine();
        System.out.println("password: ");
        String p = scanner.nextLine();
        boolean esAutenticado = false;
        int i =0;
        for ( i = 0; i < usernames.length; i++ ){
            esAutenticado = usernames[i].equals(u) && passwords[i].equals(p) ? true:esAutenticado;
            /*if (usernames[i].equals(u) && passwords[i].equals(p)){//está comparando si los String son Iguales
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje2 = esAutenticado ? "Bienvenido!! ".concat(u) :
                "Error contraseña o usuario incorrecto\nError requiere autenticación";
        System.out.println(mensaje2);

        if (esAutenticado){

            //System.out.println("Bienvenido!! ".concat(u));
            System.out.println("\n");
            System.out.println("Ingresa primer nombre");
            String nombreA = scanner.nextLine();
            String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

            System.out.println("Ingresa segundo nombre");
            String nombreB = scanner.nextLine();
            String nombreB2 = nombreA.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

            System.out.println("Ingresa tercer nombre");
            String nombreC = scanner.nextLine();
            String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

            String mensaje = nombreA2 + "_" + nombreB2 + "_" + nombreC2;
            System.out.println(mensaje);

        }else{
            //System.out.println("Error contraseña o usuario incorrecto");

            //System.out.println("Error requiere autenticación");
            main(args);
        }













    }
}
