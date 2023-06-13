package TP2.Aula25;
public class PagamentoBoleto extends Pagamento{
    public int numBoleto, dataVenc;
    public boolean venceuBoleto = false;

    public PagamentoBoleto(double valor, int data, int numBoleto, int dataVenc, boolean venceuBoleto) {
        super(valor, data);
        this.numBoleto = numBoleto;
        this.dataVenc = dataVenc;
        this.venceuBoleto = venceuBoleto;
    }

    public void exibirDetalhes(){
        System.out.printf("\nInformações do pagamento \nNumero do boleto: %i \nData de vencimento: %i \nJá venceu: %s\n", numBoleto, dataVenc, venceuBoleto);
    }

    public void processarPagamento(){
        if((data - dataVenc) > 0 ){
            venceuBoleto = true;
        }

        if(venceuBoleto == false){
            System.out.printf("\nValor a ser pago: %.2f \n", valor);
        } else{
            double multa;

        }
    }
}
