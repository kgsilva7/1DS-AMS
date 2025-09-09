import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumerosDecrescente {
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[10];
        
        for (int i = 0; i < 50; i++) {
            String numero = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: ");
            if (numero != null) {
                numeros[i] = Integer.parseInt(numero);
            } else {
                System.out.println("Entrada cancelada.");
                return;
            }
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números em ordem decrescente:");
        for (int i = 49; i >= 0; i--) {
            System.out.println((i + 1) + "° número: " + numeros[i]);
        }
    }
}
