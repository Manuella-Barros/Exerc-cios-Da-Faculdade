package TP2.Aula26.exExtra.ex1;

public class Livro implements ItemVendavel{
    public String autor, titulo;
    public int numPags, preco, quantidade;

    public Livro(String autor, String titulo, int numPags, int preco, int quantidade) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPags = numPags;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean verificaLivroDisponivel() {
        if(quantidade > 0){
            return true;
        } else{
            return false;
        }
    }
    @Override
    public void titulo(){}
    @Override
    public void preco(){}
    @Override
    public void quantide(){}
}
