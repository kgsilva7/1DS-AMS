/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author apare
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[50];

        System.out.println("Digite 50 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
