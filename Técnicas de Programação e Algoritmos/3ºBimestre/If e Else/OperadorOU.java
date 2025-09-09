
import java.util.Scanner;

public class OperadorOU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você prefere salgado do que doce? Se sim, digite TRUE. Caso contrário, digite FALSE.");
        boolean salgado = scanner.nextBoolean();

        System.out.println("Você gosta de comida apimentada? Se sim, digite TRUE. Caso contrário, digite FALSE.");
        boolean apimentada = scanner.nextBoolean();

        if (salgado || apimentada) {
            System.out.println("Você gosta de salgado ou de comida apimentada (ou ambos).");
        } else {
            System.out.println("Você não gosta de salgado nem de comida apimentada.");
        }

        scanner.close();
    }
}
