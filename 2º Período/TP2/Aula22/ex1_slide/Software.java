package TP2.Aula22.ex1_slide;

public class Software extends Produto{
    public String categoria;

    public Software(String categoria, String descricao, int codigo, double preco, double peso){
        super(descricao, codigo, preco, peso);
        this.categoria = categoria;
    }
}

