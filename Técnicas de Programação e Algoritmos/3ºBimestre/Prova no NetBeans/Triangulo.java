/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author apare
 */
public class Triangulo {
    public static void main(String[] args) {
        double ladoa = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado do triãngulo: "));
        double ladob = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado do triãngulo: "));
        double ladoc = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado do triãngulo: "));
        
        if ((ladoa + ladob > ladoc) && (ladoa + ladoc > ladob) && (ladob + ladoc > ladoa)){
        
        if (ladoa == ladob && ladob == ladoc){
            
        JOptionPane.showMessageDialog(null, "Os valores dos lados formam um triângulo equilátero.");
        } else if (ladoa == ladob || ladoa == ladoc || ladob == ladoc){
            JOptionPane.showMessageDialog(null, "Os valores dos lados formam um triângulo isóceles.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Os valores dos lados formam um triângulo escaleno.");
        }
        } else {
                JOptionPane.showMessageDialog(null, "Os valores dos lados não formam um triângulo.");
                }
    }
    }
