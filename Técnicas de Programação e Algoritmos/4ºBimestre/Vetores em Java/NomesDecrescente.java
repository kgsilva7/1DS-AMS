import javax.swing.JOptionPane;
import java.util.Arrays; 

public class NomesDecrescente {
    public static void main(String[] args) {
        
        String[] nomes = new String[15];

        for (int i = 0; i < 15; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° nome: ");
        }

        Arrays.sort(nomes);
        
        System.out.println("Nomes em ordem decrescente:");
        for (int i = 14; i >= 0; i--) {
            System.out.println((15 - i) + "° nome: " + nomes[i]);
        }
    }
}
