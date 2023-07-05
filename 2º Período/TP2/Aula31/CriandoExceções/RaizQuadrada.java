package TP2.Aula31.CriandoExceções;

public class RaizQuadrada{
    double operando;
    public RaizQuadrada(double operando) {
        this.operando = operando;
    }

    public double calcular(){
        if(operando >= 0){
            return Math.sqrt(operando);
        } else{
            throw new ValorNegativoException("valor negativo");
        }
    }
}
