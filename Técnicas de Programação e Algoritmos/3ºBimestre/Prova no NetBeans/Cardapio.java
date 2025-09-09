/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author apare
 */
public class Cardapio {
    public static void main(String[] args) {
          String[] opcoes = {"1. BigMac", "2. Quarteirão", "3. McChicken", "4. Cheddar", "5. Cheeseburger"};
          
String pedido = JOptionPane.showInputDialog(null, "Digite o número correspondente ao lanche:\n1 - BigMac\n2 - Quarteirão\n3 - McChicken\n4 - Cheddar\n5 - Cheeseburger", "Escolha o Lanche", 
                JOptionPane.QUESTION_MESSAGE);

        if (pedido.equals("1")) {
            JOptionPane.showMessageDialog(null, "Você escolheu BigMac.");
        } else if (pedido.equals("2")) {
            JOptionPane.showMessageDialog(null, "Você escolheu Quarteirão.");
        } else if (pedido.equals("3")) {
            JOptionPane.showMessageDialog(null, "Você escolheu McChicken.");
        } else if (pedido.equals("4")) {
            JOptionPane.showMessageDialog(null, "Você escolheu Cheddar.");
        } else if (pedido.equals("5")) {
            JOptionPane.showMessageDialog(null, "Você escolheu Cheeseburger.");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, escolha um número de 1 a 5.");
    }
}
}
