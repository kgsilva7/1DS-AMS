/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author apare
 */
public class IMC {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg: "));
        
        double imc = peso / (altura * altura);
        
        if (imc < 18){
           JOptionPane.showMessageDialog(null, "Seu IMC é:" +imc+ ".Você está abaixo do peso.");
        }
        else if (imc >= 18 && imc < 24.9){
        JOptionPane.showMessageDialog(null, "Seu IMC é:" +imc+ ".Você está com o peso ideal.");
    }
        else if (imc >= 25 && imc < 29.9){
        JOptionPane.showMessageDialog(null, "Seu IMC é:" +imc+ ".Você está acima do peso.");
    }
        else{
        JOptionPane.showMessageDialog(null, "Seu IMC é:" +imc+ ".Você está obeso.");
                }   
        
    }
}
