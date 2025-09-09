/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double cteatro, pconvite, qconvite;
        
        System.out.println("Informe o custo do teatro: ");
        cteatro = input.nextDouble();
        
        System.out.println("Informe o preço do convite: ");
        pconvite = input.nextDouble();
        
        qconvite = cteatro / pconvite;
        
        System.out.println("A quantidade necessária de convites necessários para alcançar os custos do espetáculo é de: "+qconvite);
    }
    
}
