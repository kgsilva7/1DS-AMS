import javax.swing.JOptionPane;

public class ExercicioDois {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int somaImpares = 0;
        int[] somaColunas = new int[5];
        int[] somaLinhas = new int[5];

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                String input = JOptionPane.showInputDialog("Digite um número inteiro para a seguinte posição ao lado -> [" + x + "][" + y + "]:");
                matriz[x][y] = Integer.parseInt(input);

                if (matriz[x][y] % 2 != 0) {
                    somaImpares += matriz[x][y];
                }

                somaColunas[y] += matriz[x][y];
                somaLinhas[x] += matriz[x][y];
            }
        }
        
        System.out.println();

        System.out.println("A) Soma dos números ímpares: " + somaImpares);

        System.out.println();
        
        System.out.println("B) Soma de cada coluna:");
        for (int y = 0; y < 5; y++) {
            System.out.println("Coluna " + (y + 1) + ": " + somaColunas[y]);
        }
        
        System.out.println();
        
        System.out.println("C) Soma de cada linha:");
        for (int x = 0; x < 5; x++) {
            System.out.println("Linha " + (x + 1) + ": " + somaLinhas[x]);
        }
    }
}
