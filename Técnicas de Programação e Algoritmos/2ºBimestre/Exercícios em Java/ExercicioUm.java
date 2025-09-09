/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class ExercicioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double b1, b2, al, ar;
        
        System.out.println("Digite o valor da base maior: ");
        b1 = input.nextDouble();
        
        System.out.println("Digite o valor da base menor: ");
        b2 = input.nextDouble();

        System.out.println("Digite o valor da altura: ");
        al = input.nextDouble();

        ar = ((b1 + b2) * al) / 2;

        System.out.println("A área do trapézio é: " +ar);   
    }
   
}
