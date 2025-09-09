/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author apare
 */
public class Nadadores {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        
        String categoria;
        
        if (idade >= 5 && idade <= 7){
            categoria = "Infantil A";
        }
        else if (idade >= 8 && idade <= 10){
            categoria = "Infantil B";
        }
        else if (idade >= 11 && idade <= 13){
            categoria = "Juventil A";
        }
        else if (idade >= 14 && idade <= 17){
            categoria = "Juventil B";
        }
        else{
            categoria = "Senior";
        }
        
        JOptionPane.showMessageDialog(null, "A categoria do nadador se encaixa em: " +categoria);
        
    }
}
