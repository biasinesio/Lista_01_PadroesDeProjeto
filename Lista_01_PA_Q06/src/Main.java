import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do aluno (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite as três notas do aluno:");
            int nota1 = scanner.nextInt();
            int nota2 = scanner.nextInt();
            int nota3 = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
            alunos.add(aluno);
        }

        System.out.println("\nNotas e média dos alunos:");
        int quantidadeAprovados = 0;
        int quantidadeReprovados = 0;
        double somaMedias = 0;

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            System.out.println("Aluno: " + aluno.getNome() + ", Notas: " + aluno.getNota1() + ", " + aluno.getNota2() + ", " + aluno.getNota3() + ", Média: " + media);

            somaMedias += media;

            if (aluno.isAprovado()) {
                quantidadeAprovados++;
            } else {
                quantidadeReprovados++;
            }
        }

        System.out.println("\nMédia geral da turma: " + (somaMedias / alunos.size()));
        System.out.println("Quantidade de alunos aprovados: " + quantidadeAprovados);
        System.out.println("Quantidade de alunos reprovados: " + quantidadeReprovados);

        System.out.println("\nAlunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.isAprovado()) {
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("\nAlunos reprovados:");
        for (Aluno aluno : alunos) {
            if (!aluno.isAprovado()) {
                System.out.println(aluno.getNome());
            }
        }

        scanner.close();
    }
}