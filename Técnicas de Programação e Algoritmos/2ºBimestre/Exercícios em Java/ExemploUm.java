/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class ExemploUm {
  public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int n1 = ler.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = ler.nextInt();
        int soma= n1+n2;
        int subtracao= n1-n2;
        int multiplicacao= n1*n2;
        int divisao= n1/n2;
        System.out.println("A soma destes números é: " +soma);
        System.out.println("A subtração destes números é: " +subtracao);
        System.out.println("A multiplicação destes números é: " +multiplicacao);
        System.out.println("A divisão destes números é: " +divisao);  
}
}
