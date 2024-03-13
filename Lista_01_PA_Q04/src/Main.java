import java.util.Scanner;

/*4º Escreva um código que receba uma String qualquer e a imprima de forma invertida.
        Ex.: Entrada: estude java
        Saída: avaj edutse*/
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva qualquer palavra:");
        String palavra = sc.next();
        String novaPalavra = "";
        for (int i = palavra.length() - 1; i >= 0; i--){
            novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
        }
        System.out.println(novaPalavra);
    }
}