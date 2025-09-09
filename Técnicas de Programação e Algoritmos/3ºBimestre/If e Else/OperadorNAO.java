/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class OperadorNAO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você torce para o Palmeiras? Se sim, digite TRUE. Caso contrário, digite FALSE.");
        boolean palmeiras = scanner.nextBoolean();
        
        if (!palmeiras) {
            System.out.println("Você não torce para o Palmeiras.");
        } else {
            System.out.println("Você torce para o Palmeiras.");
        }
    }
}
