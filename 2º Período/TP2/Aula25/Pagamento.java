package TP2.Aula25;

abstract public class Pagamento {
    public double valor;
    public int data; // data = mes

    public Pagamento(double valor, int data) {
        this.valor = valor;
        this.data = data;
    }

    public void exibirDetalhes(){
        System.out.printf("\nInformações do pagamento \nValor: %.2f \nData: %i \n", valor, data);
    }

    abstract public void processarPagamento();
}
