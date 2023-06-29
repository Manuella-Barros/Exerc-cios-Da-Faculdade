package TP2.Aula31.ex36;

public class Multiplicacao extends OperacaoBinaria{
    public Multiplicacao(float operando1, float operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 * operando2;
    }
}
