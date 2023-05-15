public class ArgumentoLineaComandoCalculadora {
     public static void main(String[] args) {
          if (args.length !=3){
               System.err.println("ingrese operacion suma, resta, multiplicacion o divicion");
               System.exit(-1);
          }
          String operacion = args[0];
          int a = 0;
          int b = 0;
          double resultado = 0.00;
          try {
                a = Integer.parseInt(args[1]);
                b = Integer.parseInt(args[2]);
                resultado = 0.00;
          }catch (NumberFormatException e){
               System.err.println("ingrese solo numeros");
               System.exit(-1);
          }
          switch (operacion){
               case "suma":
                    resultado = a + b;
                    break;
               case "resta":
                    resultado = a + b;
                    break;
               case "multi":
                    resultado = a+b;
                    break;
               case "div":
                    if (b==0){
                         System.out.println("no se puede dividir por cero");
                         System.exit(-1);
                    }
                    resultado = (double) a/b;
                    break;
               default:
                    resultado = a+b;
          }
          System.out.println("resultado = " + resultado);
     }
}
