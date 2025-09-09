/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apare
 */
public class Exercicio7 {
    public static void main(String[] args) {
        String[] times = {
        "America-MG", "Athletico-PR", "Atlético-MG", "Bahia", "Botafogo",
        "Bragantino", "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá",
        "Fortaleza", "Flamengo", "Fluminense", "Grêmio", "Goiás",
        "Internacional", "Palmeiras", "Santos", "São Paulo", "Vasco da Gama"
};

        // Saída da tabela de classificação
        System.out.println("Tabela de Classificação do Campeonato Brasileiro:");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + "º " + times[i]); 
        }
    }
}
