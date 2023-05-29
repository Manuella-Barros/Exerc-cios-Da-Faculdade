package TP2.Aula23.HerançaEmCascata;
public class MembroDaComunidade {
    public String nome, fruta_fav;
    public int idade;

    public MembroDaComunidade(String nome, String fruta_fav, int idade) {
        this.nome = nome;
        this.fruta_fav = fruta_fav;
        this.idade = idade;
    }

    public void exibir_detalhes(){
        System.out.printf("\nNome: %s \nFruta favorita: %s \nIdade: %d\n", nome, fruta_fav, idade);
    }
}
