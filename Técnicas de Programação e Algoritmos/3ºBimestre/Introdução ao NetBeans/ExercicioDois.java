/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_2407;

/**
 *
 * @author apare
 */
import javax.swing.JOptionPane;

public class ExercicioDois {

    public static void main(String[] args) {
        final int limite  = 50;
        double totalpeso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso total de peixes:"));
        double multa1 = 4;
        double multa2 = 0;

        if (totalpeso > limite) {
            double excedente = totalpeso - limite;
            multa2 = multa1 * excedente;
            JOptionPane.showMessageDialog(null, "Você atingiu o limite de peso. Sua multa é de: " + multa2);
        } else {
            JOptionPane.showMessageDialog(null, "Você não atingiu o limite de peso.");
        }
    }
}
