import javax.swing.JOptionPane;

public class ExercicioQuatro {

    public static void main(String[] args) {
        double[][] matriz = new double[4][4];

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                String input = JOptionPane.showInputDialog(
                    "Digite um número decimal para a seguinte posição ao lado -> [" + x + "][" + y + "]:"
                );
                matriz[x][y] = Double.parseDouble(input);
            }
        }

        System.out.println("A) Diagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
        }

        System.out.println();
        System.out.println("B) Diagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][3 - i]);
        }
    }
}
