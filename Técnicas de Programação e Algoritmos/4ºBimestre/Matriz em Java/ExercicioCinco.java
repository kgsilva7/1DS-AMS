import javax.swing.JOptionPane;

public class ExercicioCinco {

    public static void main(String[] args) {
        
        // Primeira matriz.
        
        char[][] matrizA = new char[4][4];
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                matrizA[x][y] = '*';
            }
        }
        
        System.out.println("Matriz A:");
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                System.out.print(matrizA[x][y] + " ");
            }
            System.out.println();
        }

        // Segunda matriz.
        
        char[][] matrizB = new char[4][4];
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                if (x == 0 || x == matrizB.length - 1 || y == 0 || y == matrizB[x].length - 1) {
                    matrizB[x][y] = '*';
                } else {
                    matrizB[x][y] = ' ';
                }
            }
        }

        System.out.println("\nMatriz B:");
        for (int x = 0; x < matrizB.length; x++) {
            for (int y = 0; y < matrizB[x].length; y++) {
                System.out.print(matrizB[x][y] + " ");
            }
            System.out.println(); 
        }
        
        // Terceira matriz.

        char[][] matrizC = new char[4][4];
        for (int x = 0; x < matrizC.length; x++) {
            for (int y = 0; y <= x; y++) { 
                matrizC[x][y] = '*';
            }
            for (int y = x + 1; y < matrizC[x].length; y++) {
                matrizC[x][y] = ' ';
            }
        }

        System.out.println("\nMatriz C:");
        for (int x = 0; x < matrizC.length; x++) {
            for (int y = 0; y < matrizC[x].length; y++) {
                System.out.print(matrizC[x][y] + " ");
            }
            System.out.println();
        }
    }
}
