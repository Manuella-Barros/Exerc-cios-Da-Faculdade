package TP2.Aula22.ex1_slide;

public class Livro extends Produto{
    public String nomeAutor;

    public Livro(String nomeAutor, String descricao, int codigo, double preco, double peso){
        super(descricao, codigo, preco, peso);
        this.nomeAutor = nomeAutor;
    }
}
