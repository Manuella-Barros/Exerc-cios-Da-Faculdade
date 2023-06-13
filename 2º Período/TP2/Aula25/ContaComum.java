package TP2.Aula25;

public class ContaComum extends Contas {
    public ContaComum(int numero, double saldo, double valor) {
        super(numero, saldo, valor);
    }

    @Override
    public double sacarDinheiro() {
        if(valor <= saldo){
            return saldo - valor;
        } else{
            return 0;
        }
    }
}