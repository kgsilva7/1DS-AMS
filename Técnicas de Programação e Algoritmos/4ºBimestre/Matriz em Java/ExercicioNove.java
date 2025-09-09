import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3]; 
        inicializarTabuleiro(tabuleiro); 
        exibirTabuleiro(tabuleiro);
        char jogadorAtual = 'X';
        int jogadas = 0; 
        
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vez do jogador " + jogadorAtual);
            System.out.print("Escolha a linha (0, 1, 2) e a coluna (0, 1, 2): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Movimento inválido. Tente novamente.");
                continue;
            }
            
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;
            
            exibirTabuleiro(tabuleiro);
            
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }
            
            if (jogadas == 9) {
                System.out.println("Empate!");
                break;
            }
            
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
    }
    
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }
    
    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < tabuleiro[i].length - 1) System.out.print(" | ");
            }
            System.out.println();
            if (i < tabuleiro.length - 1) System.out.println("---------");
        }
    }
    
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) || 
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) || 
            (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        
        return false;
    }
}
