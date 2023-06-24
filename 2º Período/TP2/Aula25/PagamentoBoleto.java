package TP2.Aula25;
public class PagamentoBoleto extends Pagamento{
    public int numBoleto, dataVenc;
    public boolean venceuBoleto = false;

    public PagamentoBoleto(double valor, int data, int numBoleto, int dataVenc) {
        super(valor, data);
        this.numBoleto = numBoleto;
        this.dataVenc = dataVenc;
    }

    public void exibirDetalhes(){
        System.out.printf("\nInformações do pagamento \nNumero do boleto: %i \nData de vencimento: %i \nJá venceu: %s\n", numBoleto, dataVenc, venceuBoleto);
    }

    public boolean processarPagamento(Contas contas) {
        System.out.println(valor);
        return true;
    }
    public boolean processarPagamento(Contas contas, double multa){
        System.out.println(valor + multa);
        return true;
    }

    /*
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
     */

}
