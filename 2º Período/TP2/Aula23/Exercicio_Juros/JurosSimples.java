package TP2.Aula23.Exercicio_Juros;

public class JurosSimples extends Juros{
    public JurosSimples(double capital, double taxa, int tempo){
        super(capital, taxa, tempo);
    }

    public double calcularJuros(){
        return getCapital() * (getTaxa() / 100) * getTempo();
    }
}
