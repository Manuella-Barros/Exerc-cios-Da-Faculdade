package TP2.Aula31.ex36;

public class Divisao extends OperacaoBinaria{
    public Divisao(float operando1, float operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        if(operando2 != 0){
            return operando1/operando2;
        } else{
            throw new IllegalArgumentException("Não pode dividir por 0");
        }
    }
}
