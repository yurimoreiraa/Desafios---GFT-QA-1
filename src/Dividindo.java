import java.io.IOException;
import java.util.Scanner;

public class Dividindo {

    public static void main(String[] args) throws IOException {
        //Detalhes sobre o desafio no README.MD - Desafio 3/6
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas divisões você deseja realizar?");
        int N = leitor.nextInt(); //Entrada: 3
        int X, Y;
        for (int i = 0; i < N; i++) {
            System.out.println("Digite o dividendo:");
            X = leitor.nextInt(); //Entrada: 3 / -8 / 0
            System.out.println("Digite o divisor:");
            Y = leitor.nextInt(); //Entrada: -2 / 0 / 8
            if (Y == 0) {
                System.out.println("Divisão impossível");
            } else {
                double dx = X;
                double dy = Y;

                System.out.println("Resultado: " + dx / dy); //Saída esperada: -1.5 / Divisão impossível / 0.0
            }
        }
    }
}