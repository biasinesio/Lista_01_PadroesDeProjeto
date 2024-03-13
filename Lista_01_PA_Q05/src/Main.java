import java.util.Scanner;
import java.util.Arrays;

/*5º Escreva um código que receba uma String simples (apenas uma palavra) e monte um array
com os valores respectivos a cada letra da palavra, os organize em ordem crescente, imprima
esse array e a palavra na nova ordem.
Ex.:
Entrada: estudar
Array: {5, 19, 20, 21, 4, 1, 18}
Array ordenado: {1, 4, 5, 18, 19, 20, 21}
Saída: aderstu.*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma palavra:");
        String palavra = sc.next();

        int[] arrayLetras = new int[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            arrayLetras[i] = (int) palavra.charAt(i);
        }

        System.out.println("Array: " + Arrays.toString(arrayLetras));

        Arrays.sort(arrayLetras);

        System.out.println("Array ordenado: " + Arrays.toString(arrayLetras));

        System.out.print("Palavra ao contrário: ");
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }
        System.out.println();

        sc.close();
    }
}