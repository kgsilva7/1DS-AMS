/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class ExercicioDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double reais, dolar, libra, marco, cdolar, cmarco, clibra;
        
        System.out.println("Digite a quantidade de dinheiro em reais:");
        reais = input.nextDouble();
        
        cdolar = 1.80;
        cmarco = 2.00;
        clibra = 1.57;
        
        dolar = reais / cdolar;
        marco = reais / cmarco;
        libra = reais / clibra;

        System.out.println("O valor em dólares é: $" + dolar);
        System.out.println("O valor em marcos alemães: DM" + marco);
        System.out.println("O valor em libras esterlinas: £" + libra);
        input.close();
    }
    }
