import java.util.Scanner;

/*1º Escrever um código que receba um número inteiro e informe se ele é um número primo.*/

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escreva um número inteiro:");
        num = sc.nextInt();

        if (Primo(num)) {
            System.out.println(num + " ,esse número é primo!");
        } else {
            System.out.println(num + " ,não é primo");
        }
    }
        public static boolean Primo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    