/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExercicioPessoa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pedindo para o usuário digitar o nome
        System.out.println("Informe o seu nome: ");

        //Lendo o nome do usuário
        String nome = scanner.next() + scanner.nextLine(); 
        //Pedindo a idade do usuário
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        //Pedindo para o usuário digitar o sexo
        System.out.println("Informe seu sexo: ");
        String sexo = scanner.next() + scanner.nextLine();

        //Pedindo o endereço do usuário
        System.out.println("Informe seu endereço: ");
        String endereco = scanner.next() + scanner.nextLine();

        //Pedindo a altura do usuário
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        //Pedindo para o usuário informar as observações
        System.out.println("Informe suas observações: ");
        String observacoes = scanner.next() + scanner.nextLine();

        //Pedindo o peso
        System.out.println("Informe o seu peso: ");
        double peso = scanner.nextDouble();

        //Cálculo do IMC
        double imc = peso / (altura * altura);

        //Mostrando os dados do usuário
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sexo: " + sexo);

        //Confere e mostra qual o sexo (M ou F), armazenado na variável sexo
        if (sexo.equals("M")) { 
            System.out.println("Sexo: Masculino");
        } else {
            System.out.println("Sexo: Feminino");
        }

        System.out.println("Seu endereço é: " + endereco);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Suas observações são: " + observacoes);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Seu IMC é: " + imc);
    }
}
