/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario, vendas, comissao, sf; 
        String nome;
        
        System.out.println("Digite o nome do funcionário:");
        nome = input.nextLine();
        
        System.out.println("Digite o salário fixo:");
        salario = input.nextDouble();
        
        System.out.println("Digite o valor das vendas:");
        vendas = input.nextDouble();
        
        comissao = vendas* 0.04;
        sf = salario + comissao;
       
        System.out.println("Nome do funcionário: " +nome);
        System.out.println("Comissão: R$" +comissao);
        System.out.println("Salário final: R$" +sf);
    }
   
}
