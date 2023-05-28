package TP2.Aula23.ParqueDeDivesões;

public class Atracao {
    private String nome;
    private int capacidade;
    private double preco;

    public Atracao(String nome, int capacidade, double preco){
        setCapacidade(capacidade);
        setNome(nome);
        setPreco(preco);
    }

    public boolean setCapacidade(int capacidade) {
        if(capacidade > 0){
            this.capacidade = capacidade;
            return true;
        } else{
            return false;
        }
    }

    public boolean setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        } else{
            return false;
        }
    }

    public boolean setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
            return true;
        } else{
            return false;
        }
    }

    public String getNome() {return nome;}

    public int getCapacidade() {return capacidade;}

    public double getPreco() {return preco;}
}
