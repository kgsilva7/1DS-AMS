/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author apare
 */
public class TurnoEscola {

    public static void main(String[] args) {
        String hora1 = JOptionPane.showInputDialog("Informe a hora de início de seu turno, entre (0-23): ");
        int hora2 = Integer.parseInt(hora1);

        String turno;

        if (hora2 >= 5 && hora2 < 13) {
            turno = "Manhã";
        } else if (hora2 >= 13 && hora2 < 21) {
            turno = "Tarde";
        } else if ((hora2 >= 21 && hora2 <= 23) || (hora2 >= 0 && hora2 < 5)) {
            turno = "Noite";
        } else {
            turno = "Horário inválido";
        }

        JOptionPane.showMessageDialog(null, "O turno é: " + turno + ".");

    }
}
