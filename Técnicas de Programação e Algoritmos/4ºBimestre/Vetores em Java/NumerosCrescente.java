import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumerosCrescente {
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[50];
        
        for (int i = 0; i < 50; i++) {
            
            String numero = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número: ");
            numeros[i] = Integer.parseInt(numero);
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números em ordem crescente:");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + "° número: " + numeros[i]);
        }
    }
}
