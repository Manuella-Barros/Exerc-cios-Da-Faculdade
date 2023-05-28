package TP2.Aula23.ParqueDeDivesões;

public class MontanhaRussa extends Atracao{
    private double altura_minima;

    public MontanhaRussa(String nome, int capacidade, double preco, double altura_minima) {
        super(nome, capacidade, preco);
        setAltura_minima(altura_minima);
    }

    public boolean setAltura_minima(double altura_minima) {
        if(altura_minima >= 1.30){
            this.altura_minima = altura_minima;
            return true;
        } else{
            return false;
        }
    }

    public double getAltura_minima() {return altura_minima;}

    public String exibirDetalhes(){
        return "\nNome: " + getNome() + "\nCapacidade: " + getCapacidade() + "\nPreço: R$" + getPreco() + "\nAltura minima: " + getAltura_minima();
    }
}
