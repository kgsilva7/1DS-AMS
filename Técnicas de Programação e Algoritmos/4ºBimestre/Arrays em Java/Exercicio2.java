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
public class Exercicio2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        String[] nomes = new String[20];

        System.out.println("Digite 20 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareTo(nomes[j]) < 0) {
                    String temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }

        System.out.println("\nNomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
