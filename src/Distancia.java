import java.util.Scanner;

public class Distancia {

    //Detalhes sobre o desafio no README.MD - Desafio 1/6
    public static void main(String[] args) {
        int minutos;
        Scanner input = new Scanner(System.in);
        int k = input.nextInt(); //Entrada: 30
        minutos = k * 2;
        System.out.println(minutos + " minutos"); //Saída esperada: 60 minutos
    }
}

