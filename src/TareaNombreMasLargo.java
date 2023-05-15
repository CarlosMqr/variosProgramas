import javax.swing.*;

public class TareaNombreMasLargo {
    public static void main(String[] args) {

        String nombreA = JOptionPane.showInputDialog(null,"ingresa un nombre con apellidos");
        String nombreB = JOptionPane.showInputDialog(null,"ingresa segundo nombre con apellidos");
        String nombreC = JOptionPane.showInputDialog(null,"ingresa tercer nombre con apellidos");

        String nombreLarg = nombreA.split(" ")[0].length() < nombreB.split(" ")[0].length() ? nombreB : nombreA;
        nombreLarg = nombreC.split(" ")[0].length() < nombreLarg.split(" ")[0].length() ? nombreLarg : nombreC;
        JOptionPane.showMessageDialog(null,"el nombre mas largo es: " + nombreLarg);

    }


}
