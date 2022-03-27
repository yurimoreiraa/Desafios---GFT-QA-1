import java.util.Scanner;

public class SomaSimples {

    //Detalhes sobre o desafio no README.MD - Desafio 2/6
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        System.out.println("Digite A:");
        A = sc.nextInt(); //Entrada: 30 / -30 / 0
        System.out.println("Digite B:");
        B = sc.nextInt(); //Entrada: 10 / 10 / 0

        soma = A + B;

        System.out.println("SOMA = " + soma); // Saída esperada: SOMA = 40 / SOMA = -20 / SOMA = 0

        sc.close();

    }
}