/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author apare
 */
public class Media {

    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua quarta nota: "));
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media >= 9){
           JOptionPane.showMessageDialog(null, "Aprovado com média de:" +media);
    }
        else if (media >= 7 && media < 9){
            JOptionPane.showMessageDialog(null, "Aprovado com média de:" +media);
        }
        else if (media >= 5 && media < 7){
            JOptionPane.showMessageDialog(null, "Aprovado com média de:" +media);
        }
        else if (media >= 2.5 && media < 5){
            JOptionPane.showMessageDialog(null, "Reprovado com média de:" +media);
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado com média de:" +media);
        }
}
}