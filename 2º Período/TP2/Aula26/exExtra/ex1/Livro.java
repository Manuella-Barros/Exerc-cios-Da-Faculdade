package TP2.Aula26.exExtra.ex1;

public class Livro implements ItemVendavel{
    public String autor;
    public int numPags;

    @Override
    public boolean verificaLivroDisponivel() {return false;}
}
