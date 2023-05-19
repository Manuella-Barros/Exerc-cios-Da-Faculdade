package TP2.Simulado.ex4;


public class Livro {
    public String autor, titulo;
    private int ano;
    private double preco;

    public Livro(String autor, String titulo, int ano, double preco) {
        this.autor = autor;
        this.titulo = titulo;
        setAno(ano);
        setPreco(preco);
    }

    public boolean setAno(int ano) {
        if (ano > 0 && ano <= 2023) {
            this.ano = ano;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
            return true;
        } else {
            return false;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public double getPreco() {
        return this.preco;
    }

    public void exibirDados() {
        System.out.printf("Autor: %s \nTitulo: %s \nAno: %d \nPreço: %.2f", autor, titulo, ano, preco);
    }
}
