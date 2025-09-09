/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author apare
 */
public class Meses {
    public static void main(String[] args) {
        String mes1 = JOptionPane.showInputDialog("Informe um número entre 1 a 12: ");
        int mes2 = Integer.parseInt(mes1);
        
        String nomeMes;
        
         if (mes2 == 1) {
            nomeMes = "Janeiro";
        } else if (mes2 == 2) {
            nomeMes = "Fevereiro";
        } else if (mes2 == 3) {
            nomeMes = "Março";
        } else if (mes2 == 4) {
            nomeMes = "Abril";
        } else if (mes2 == 5) {
            nomeMes = "Maio";
        } else if (mes2 == 6) {
            nomeMes = "Junho";
        } else if (mes2 == 7) {
            nomeMes = "Julho";
        } else if (mes2 == 8) {
            nomeMes = "Agosto";
        } else if (mes2 == 9) {
            nomeMes = "Setembro";
        } else if (mes2 == 10) {
            nomeMes = "Outubro";
        } else if (mes2 == 11) {
            nomeMes = "Novembro";
        } else if (mes2 == 12) {
            nomeMes = "Dezembro";
        } else {
            nomeMes = " Inválido. Por favor, escolha um número de 1 a 12.";
        }

        JOptionPane.showMessageDialog(null, "O mês é: " + nomeMes);
    }
    }

