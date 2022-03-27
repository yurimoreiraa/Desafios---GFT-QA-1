import java.util.Scanner;

public class Tempo {
    public static void main(String[] args){
        //Detalhes sobre o desafio no README.MD - Desafio 6/6
        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        System.out.println("Horário de início do jogo:");
        inicio = scan.nextInt(); //Entrada: 16 / 0 / 2
        System.out.println("Horário do final do jogo:");
        fim = scan.nextInt(); //Entrada: 2 / 0 / 16
        horas = fim - inicio;

        if(horas <= 0){
            horas = horas + 24;
        }
        System.out.print("O JOGO DUROU " + horas + " HORA(S)\n");
        //Saída esperada: O JOGO DUROU 10 HORA(S) / O JOGO DUROU 24 HORA(S) / O JOGO DUROU 14 HORA(S)
    }
}