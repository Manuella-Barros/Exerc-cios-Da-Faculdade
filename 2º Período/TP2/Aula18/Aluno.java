package TP2.Aula18;

public class Aluno {
    public String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }

    }

    public int getIdade() {
        return this.idade;
    }

    public void exibir_informacoes() {
        System.out.println("Nome do aluno: " + nome + "\nIdade: " + idade);
    }
}

