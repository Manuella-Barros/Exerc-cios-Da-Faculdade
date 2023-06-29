package TP2.Aula31.ex36;

public class RaizQuadrada extends OperacaoUnaria{
    public RaizQuadrada(double operando) {
        super(operando);
    }

    @Override
    public double calcular(){
        if(operando >= 0){
            return Math.sqrt(operando);
        } else{
            throw new IllegalArgumentException("Não existe raiz de número negativo");
        }
    }
}
