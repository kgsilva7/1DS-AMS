/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class Exercicio5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[100];
        int[] pares = new int[100]; 
        int contadorPares = 0;

        System.out.println("Digite 100 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            }
        }

        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.println(pares[i]);
        }
    }
}
