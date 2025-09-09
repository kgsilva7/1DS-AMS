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

public class ExercicioTres {

    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite seu dia de nascimento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite seu mês de nascimento:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));

        int idade = 2024 - ano;

        if (idade >= 60) {
            JOptionPane.showMessageDialog(null, "Você é idoso.");
        } else if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Você é menor de idade.");
        } else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        }

    }

}
