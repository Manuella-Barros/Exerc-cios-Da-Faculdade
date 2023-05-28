package TP2.Aula23.Exercicio_Juros;

public class JurosCompostos extends Juros{
    public JurosCompostos(double capital, double taxa, int tempo){
        super(capital, taxa, tempo);
    }

    public double calcularJuros(){
        return getCapital() * Math.pow(1 + (getTaxa()/100), getTempo()) - getCapital();
    }
}
