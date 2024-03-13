import java.util.Scanner;
import java.util.Random;

/*2º Escrever um código que sorteie um número randômico de 0 a 1000, peça um número inteiro
neste intervalo, se o usuário errar, informar se o valor sorteado é maior ou menor que o
informado e solicitar outro número do usuário até que ele acerte o número. Quando acertar,
informar a quantidade de palpites que ele informou até acertar.*/

public class Main{
    public static void main(String[] args) {
        Random rd = new Random();
        int numerosorteio = rd.nextInt(1001);
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe o número (entre 0 e 1000):   ");

        while (true) {
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numerosorteio) {
                System.out.println("Parabéns! Você acertou o número " + numerosorteio + " em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numerosorteio) {
                System.out.println("O número sorteado é maior que " + palpite + ". Tente novamente:");
            } else {
                System.out.println("O número sorteado é menor que " + palpite + ". Tente novamente:");
            }
        }

        scanner.close();
    }
}
