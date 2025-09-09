
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExercicioDois {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0, r = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número:"));
        r = (a * b) + (a * c) + (a * d);
        JOptionPane.showMessageDialog(null,"O resultado é: "+r);
    }
   
}
