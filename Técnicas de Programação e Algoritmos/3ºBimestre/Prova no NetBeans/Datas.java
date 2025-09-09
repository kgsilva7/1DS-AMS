/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author apare
 */
public class Datas {

    public static void main(String[] args) {
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia da primeira data: "));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês da primeira data: "));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da primeira data: "));
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia da segunda data: "));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês da segunda data: "));
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da segunda data: "));

        if (ano1 != ano2) {
            if (ano1 < ano2) {
                JOptionPane.showMessageDialog(null, formatarData(dia1, mes1, ano1) + "\n" + formatarData(dia2, mes2, ano2));
            } else {
                JOptionPane.showMessageDialog(null, formatarData(dia2, mes2, ano2) + "\n" + formatarData(dia1, mes1, ano1));
            }
        } 
        else if (mes1 != mes2) {
            if (mes1 < mes2) {
                JOptionPane.showMessageDialog(null, formatarData(dia1, mes1, ano1) + "\n" + formatarData(dia2, mes2, ano2));
            } else {
                JOptionPane.showMessageDialog(null, formatarData(dia2, mes2, ano2) + "\n" + formatarData(dia1, mes1, ano1));
            }
        }
        else {
            if (dia1 < dia2) {
                JOptionPane.showMessageDialog(null, formatarData(dia1, mes1, ano1) + "\n" + formatarData(dia2, mes2, ano2));
            } else {
                JOptionPane.showMessageDialog(null, formatarData(dia2, mes2, ano2) + "\n" + formatarData(dia1, mes1, ano1));
            }
        }
    }
        public static String formatarData(int dia, int mes, int ano) {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
