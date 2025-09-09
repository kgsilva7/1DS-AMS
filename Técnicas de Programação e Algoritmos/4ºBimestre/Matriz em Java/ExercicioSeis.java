import javax.swing.JOptionPane;

public class ExercicioSeis {
    public static void main(String[] args) {
        int numLinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int numColunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        int[][] matriz = new int[numLinhas][numColunas];

        preencherMatriz(matriz);

        imprimirMatriz(matriz);
    }

    private static void preencherMatriz(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o valor para a posição [" + linha + "][" + coluna + "]:"));
            }
        }
    }
    
    private static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}