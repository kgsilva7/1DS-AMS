/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double al, al2, degraus;
        
        System.out.println("Digite a altura em metros do degrau: ");
        al = input.nextDouble();
        
        System.out.println("Digite a altura em metros que deseja alcançar: ");
        al2 = input.nextDouble();
        
        degraus = al2 / al;
        
        System.out.println("Você precisará subir "+ degraus +" degraus para alcançar a altura informada.");
        
    }
    
}
