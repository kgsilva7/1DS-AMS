
import javax.swing.JOptionPane;

public class ExercicioTres {

    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        int pares = 0;
        int impares = 0;
        boolean repetidos = false;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 5; y++) {
                String input = JOptionPane.showInputDialog("Digite um número inteiro para a seguinte posição ao lado -> [" + x + "][" + y + "]");
                matriz[x][y] = Integer.parseInt(input);

                if (matriz[x][y] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 5; y++) {

                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 5; j++) {

                        if (x != i || y != j) {
                            if (matriz[x][y] == matriz[i][j]) {
                                repetidos = true;
                                break;
                            }
                        }
                    }
                    if (repetidos) {
                        break;
                    }
                }
                if (repetidos) {
                    break;
                }
            }
            if (repetidos) {
                break;
            }
        }

        System.out.println("A) A matriz " + (repetidos ? "possui" : "não possui") + " elementos repetidos.");

        System.out.println("B) Quantidade de números pares: " + pares);
        System.out.println("C) Quantidade de números ímpares: " + impares);
    }
}
