package TP2.Aula25;

public class PagamentoOnline extends Pagamento{
    public int numCartao, qntParcelas;
    public String bandeira;

    public PagamentoOnline(double valor, int data, int numCartao, int qntParcelas, String bandeira) {
        super(valor, data);
        this.numCartao = numCartao;
        this.qntParcelas = qntParcelas;
        this.bandeira = bandeira;
    }

    public void exibirDetalhes(){
        System.out.printf("\nInformações do pagamento online \nNumero do cartao: %i \nParcelas: %i \nBandeira: %s \n", numCartao, qntParcelas, bandeira);
    }

    public void processarPagamento(){

    }
}
