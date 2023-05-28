package TP2.Aula23.HerançaEmCascata;

public class Aluno  extends MembroDaComunidade{
    public int matricula;

    public Aluno(String nome, String fruta_fav, int idade, int matricula) {
        super(nome, fruta_fav, idade);
        this.matricula = matricula;
    }
}
