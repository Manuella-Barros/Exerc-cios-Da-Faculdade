package TP2.Aula31.ex36;

public class Subtracao extends OperacaoBinaria{
    public Subtracao(float operando1, float operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 - operando2;
    }
}
