/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0409;

import java.util.Scanner;

/**
 *
 * @author apare
 */
public class ExercicioCinco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Por favor, informe outro número: ");
        int numero2 = scanner.nextInt();

        int inicio, fim;

        if (numero1 > numero2) {
            inicio = numero1;
            fim = numero2;
        } else {
            inicio = numero2;
            fim = numero1;
        }

        if (inicio % 2 != 0) {
            inicio--;
        }

        for (int i = inicio; i >= fim; i -= 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
