package TP2.Aula23.HerançaEmCascata;

public class Graduado  extends MembroDaComunidade{
    public int ano_formacao;

    public Graduado(String nome, String fruta_fav, int idade, int ano_formacao) {
        super(nome, fruta_fav, idade);
        this.ano_formacao = ano_formacao;
    }
}
