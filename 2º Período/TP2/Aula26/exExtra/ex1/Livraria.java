package TP2.Aula26.exExtra.ex1;

public class Livraria extends Livro implements ItemVendavel{
    public Livraria(String autor, String titulo, int numPags, int preco, int quantidade) {
        super(autor, titulo, numPags, preco, quantidade);
    }

    public void realizaCompra(){

    }
    public void realizaVenda(){}
}
