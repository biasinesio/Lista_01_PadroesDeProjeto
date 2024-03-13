class Aluno {
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public Aluno(String nome, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public boolean isAprovado() {
        return calcularMedia() >= 6.0;
    }

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }
}