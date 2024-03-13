import java.util.Scanner;

/*  3º Escreva um código que receba um nome completo em forma de String e mostre as iniciais do nome.
        Ex.:
Entrada: Demetrius de Castro do Amaral
Saída: D.C.A*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine().toUpperCase();

        StringBuilder iniciais = new StringBuilder();
        String[] partesNome = nomeCompleto.split(" ");
        for (String parte : partesNome) {
            if (!parte.isEmpty() && !parte.equalsIgnoreCase("de") && !parte.equalsIgnoreCase("do") && !parte.equalsIgnoreCase("da")) {
                iniciais.append(parte.charAt(0)).append(".");
            }
        }

        System.out.println("Iniciais do nome: " + iniciais);

        scanner.close();
    }
}