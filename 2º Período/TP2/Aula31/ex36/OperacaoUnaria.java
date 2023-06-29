package TP2.Aula31.ex36;

abstract public class OperacaoUnaria {
    public double operando;

    public OperacaoUnaria(double operando) {
        this.operando = operando;
    }

    abstract public double calcular();
}
