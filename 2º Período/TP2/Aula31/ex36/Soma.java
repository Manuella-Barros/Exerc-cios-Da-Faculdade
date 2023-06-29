package TP2.Aula31.ex36;

public class Soma extends OperacaoBinaria{
    public Soma(float operando1, float operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular(){
        return operando1 + operando2;
    }
}
