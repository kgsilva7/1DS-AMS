/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2407;
/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Exemplo {

    public static void main(String[] args) {
        {
            double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;

            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
            nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));

            media = (nota1 + nota2 + nota3 + nota4) / 4;
            
            if (media >= 5) {
                JOptionPane.showMessageDialog(null, "O aluno foi aprovado com média: " + media);
            }
            
            else {
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado com média: " + media);
        }
        }
    }
}
