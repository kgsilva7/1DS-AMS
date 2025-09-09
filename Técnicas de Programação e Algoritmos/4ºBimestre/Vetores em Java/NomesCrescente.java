import javax.swing.JOptionPane;
import java.util.Arrays;

public class NomesCrescente {
    public static void main(String[] args) {
        
        String[] nomes = new String[15];
        
        for (int i = 0; i < 15; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "° nome: ");
        }
        
        Arrays.sort(nomes);
        
        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + "° nome: " + nomes[i]);
        }
    }
}

