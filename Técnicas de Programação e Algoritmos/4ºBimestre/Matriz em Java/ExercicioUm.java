import javax.swing.JOptionPane;

public class ExercicioUm {

    public static void main(String[] args) {
        
        System.out.println("A)");
        
        String[][] alfabeto = {
            {"a", "b", "c", "d", "e"},
            {"f", "g", "h", "i", "j"},
            {"l", "m", "n", "o", "p"},
            {"q", "r", "s", "t", "u"}
        };

        for (int x = 0; x < alfabeto.length; x++) {
            for (int y = 0; y < alfabeto[x].length; y++) {
                System.out.print(alfabeto[x][y] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("B)");
        
        int[][] numeros = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };
        
        for (int x = 0; x < numeros.length; x++) {
        for (int y = 0; y < numeros[x].length; y++){
            System.out.print(numeros[x][y] + " ");
        }
        System.out.println();
    }
        
        System.out.println();
        System.out.println("C)");
        
        double [][] numeros2 = {
            {1.9, 2.5, 10.0, 9.9},
            {1.0, 7.8, 2.5, 1.4},
            {3.5, 2.2, 4.7, 7.4}
        };
        
        for (int x = 0; x < numeros2.length; x++) {
        for (int y = 0; y < numeros2[x].length; y++){
            System.out.print(numeros2[x][y] + " ");
        }
        System.out.println();
    }
    }
}
