package TP2.Aula23.Exercicio_Juros;

public class Juros {
    private double capital, taxa;
    private int tempo;

    public Juros(double capital, double taxa, int tempo){
        setCapital(capital);
        setTaxa(taxa);
        setTempo(tempo);
    }

    public boolean setCapital(double capital) {
        if(capital > 0){
            this.capital = capital;
            return true;
        }
        return false;
    }

    public boolean setTaxa(double taxa) {
        if(capital > 0){
            this.taxa = taxa;
            return true;
        }
        return false;
    }

    public boolean setTempo(int tempo) {
        if(capital > 0){
            this.tempo = tempo;
            return true;
        }
        return false;    }

    public double getCapital() {return capital;}

    public double getTaxa() {return taxa;}

    public int getTempo() {return tempo;}
}
