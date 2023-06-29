package TP2.Aula31.ex36;

abstract public class OperacaoBinaria {
    public float operando1, operando2;

    public OperacaoBinaria(float operando1, float operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    abstract public double calcular();
}
