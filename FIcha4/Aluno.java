public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(Aluno a)
    {
        this.nome = a.getNome();
        this.idade = a.getIdade();
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public Aluno clone()
    {
        return new Aluno(this);
    }
}
