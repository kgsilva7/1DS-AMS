/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperadorE {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 10 para a soma: ");
        int n1 = Scanner.nextInt();
        
        System.out.println("Digite outro número de 1 a 10 para a soma: ");
        int n2 = Scanner.nextInt();
        
        int soma = n1 + n2;
        
        System.out.println("Digite sua idade: ");
        int idade = Scanner.nextInt();
        
        if (idade == soma && soma > 0){
        System.out.println("A soma dos números equivale a sua idade e a soma é maior do que zero.");
    }
        else{
                System.out.println("A soma dos números não coincidem com sua idade ou a soma não é maior do que zero.");
                }
    }
        
    }
