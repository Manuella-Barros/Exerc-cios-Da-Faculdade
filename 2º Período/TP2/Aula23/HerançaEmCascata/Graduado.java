package TP2.Aula23.HerançaEmCascata;

public class Graduado  extends MembroDaComunidade{
    public int ano_formacao;

    public Graduado(String nome, String fruta_fav, int idade, int ano_formacao) {
        super(nome, fruta_fav, idade);
        this.ano_formacao = ano_formacao;
    }

    public void exibir_detalhes(){
        System.out.printf("\n\nInformações do Graduado \n\nNome: %s \nFruta favorita: %s \nIdade: %d \nAno de formação: %d\n", nome, fruta_fav, idade, ano_formacao);
    }
}
