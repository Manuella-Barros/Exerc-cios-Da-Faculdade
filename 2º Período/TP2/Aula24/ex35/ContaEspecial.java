package TP2.Aula24.ex35;

public class ContaEspecial extends Contas {
    public double limite;

    public ContaEspecial(int numero, double saldo, double valor, double limite) {
        super(numero, saldo, valor);
        this.limite = limite;
    }

    @Override
    public double sacarDinheiro() {
        if(valor <= limite){
            return saldo - valor;
        } else{
            return 0;
        }
    }
}