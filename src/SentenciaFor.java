import javax.swing.*;

public class SentenciaFor {
    public static void main(String[] args) {

        String [] nombre = {"carlos","jazmin","jessy","adriana","daniela","charin"};
        int count = nombre.length;
        for(int i = 0; i < count; i ++){

            System.out.println("posicion " + i + " = " + nombre[i]);
        }

        String nom = JOptionPane.showInputDialog(null,"nombre que desea buscar en el sistema");

        boolean encontrado = false;

        for (int j = 0; j < count; j++) {
            if (nombre[j].equalsIgnoreCase(nom)) {
                encontrado = true;
                break;
            }
        }

            if (encontrado){
                JOptionPane.showMessageDialog(null,nom + " se encuentra registrado en sistema");
            }else {
                JOptionPane.showMessageDialog(null,nom + " No se encuentra registrado en sistema");
            }

        /*for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }*/

        }




    }


