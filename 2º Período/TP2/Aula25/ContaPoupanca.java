package TP2.Aula25;

public class ContaPoupanca extends Contas {
    public double rendimento;

    public ContaPoupanca(int numero, double saldo, double valor, double rendimento) {
        super(numero, saldo, valor);
        this.rendimento = rendimento;
        calculaRendimento();
    }

    public void calculaRendimento(){
        saldo += (saldo * rendimento);
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