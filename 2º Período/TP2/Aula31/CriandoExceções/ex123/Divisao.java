package TP2.Aula31.CriandoExceções;

public class Divisao {
    int op1, op2;

    public Divisao(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int calcular(){
        if (op2 != 0){
            return op1/op2;
        } else {
            throw new DivisaoPorZeroException("Divisor n pode ser 0");
        }
    }
}
