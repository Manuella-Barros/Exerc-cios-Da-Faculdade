package TP2.Aula23.ParqueDeDivesões;

public class Carrossel extends Atracao{
    public int idade_minima;

    public Carrossel(String nome, int capacidade, double preco, int idade_minima) {
        super(nome, capacidade, preco);
    }

    public boolean setIdade_minima(int idade_minima) {
        if(idade_minima >= 5){
            this.idade_minima = idade_minima;
            return true;
        } else{
            return false;
        }
    }

    public int getIdade_minima() {return idade_minima;}

    public String exibirDetalhes(){
        return "\nNome: " + getNome() + "\nCapacidade: " + getCapacidade() + "\nPreço: R$" + getPreco() + " caro pra ver a Maria Joaquina \nIdade minima: " + getIdade_minima();
    }
}
