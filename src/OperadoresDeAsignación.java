public class OperadoresDeAsignación {
    public static void main(String[] args) {

        int i = 5;
        System.out.println("i = " + i);
        int j = i + 4;
        System.out.println("j = " + j);

        i += 2;// 5 + 2 = 7
        System.out.println("i = " + i);
        // i tiene el valor de 5 con la forma de asignación += es mas rapido sumar, resta, multi y dividir

        i += 5;// 7 + 5 = 12
        System.out.println("i = " + i);

        j -= 4;// 9 - 4 = 5
        System.out.println("j = " + j);

        j *= 3;// 5 * 3 + 15
        System.out.println("j = " + j);

        String sqlString = "select * from clientes as c ";
        sqlString += "where c.nombre 'Carlos'";
        sqlString += "and c.activo=1;";
        System.out.println("sqlString = " + sqlString);



    }
}
