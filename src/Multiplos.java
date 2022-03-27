import java.io.IOException;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) throws IOException {
        //Detalhes sobre o desafio no README.MD - Desafio 5/6
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o 1º número da comparação:");
        int a = leitor.nextInt(); //Entrada: 6 / 24
        System.out.println("Digite o 2º número da comparação:");
        int b = leitor.nextInt(); //Entrada: 6 / 25

        boolean multiplos = a == 0 || b ==0;
        if (!multiplos) {
            multiplos = a % b == 0 || b % a == 0;
        }
        if (multiplos) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        } //Saída esperada: São múltiplos / Não são múltiplos
    }
}