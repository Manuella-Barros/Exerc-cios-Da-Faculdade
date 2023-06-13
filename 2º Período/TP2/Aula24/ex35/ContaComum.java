package TP2.Aula24.ex35;

public class ContaComum extends Contas{
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