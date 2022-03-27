import java.util.Scanner;

public class Encaixa {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //Detalhes sobre o desafio no README.MD - Desafio 4/6
        System.out.println("Quantos testes deseja realizar?");
        int count = scan.nextInt(); //Entrada: 4

        for (int i = 0; i < count; i++) {

            System.out.println("Digite a 1º sequência de números inteiros:");
            int A = scan.nextInt(); //Entrada: 5678690 / 5434554 / 1243 / 54
            System.out.println("Digite a 2º sequência de números inteiros:");
            int B = scan.nextInt(); //Entrada: 78690 / 543 / 1243 / 654

            boolean encaixa = A >= B;

            while (encaixa && B >= 1) {

                int ra = A % 10;
                int rb = B % 10;

                if (ra == rb) {
                    A = A / 10;
                    B = B / 10;
                } else {
                    encaixa = false;
                }
            }
            if (encaixa) System.out.println("Encaixa");
            else System.out.println("Não encaixa");
            //Saída esperada: Encaixa / Não encaixa / Encaixa / Não encaixa
        }
    }
}