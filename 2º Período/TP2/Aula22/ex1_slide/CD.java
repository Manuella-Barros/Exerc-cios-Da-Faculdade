package TP2.Aula22.ex1_slide;
public class CD extends Produto{
    public String nomeBanda;

    public CD(String nomeBanda, String descricao, int codigo, double preco, double peso){
        super(descricao, codigo, preco, peso);
        this.nomeBanda = nomeBanda;
    }
}
