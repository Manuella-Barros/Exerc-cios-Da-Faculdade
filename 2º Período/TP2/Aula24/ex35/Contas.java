package TP2.Aula24.ex35;

public class Contas {
    public int numero;
    public double saldo, valor;

    public Contas(int numero, double saldo, double valor) {
        this.numero = numero;
        this.saldo = saldo;
        this.valor = valor;
    }

    public double sacarDinheiro(){
        return valor;
    }

    public double depositarDinheiro(){
        saldo += valor;
        return saldo;
    }
}
