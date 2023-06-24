package TP2.Aula25;
import java.util.*;
public class main {
    public static void main(String[]args){
        TP2.Aula25.Contas contas = new TP2.Aula25.Contas(000, 1000, 0); // acho q deu problema na pasta
        PagamentoBoleto pagBol = new PagamentoBoleto(100, 9, 4, 8);
        PagamentoOnline pagOnl = new PagamentoOnline(100, 9, 12345, 2, "Mastercard");
        int num;
        Scanner teclado = new Scanner(System.in);

        //BOLETO
        if((pagBol.data - pagBol.dataVenc) > 0 ){
            pagBol.venceuBoleto = true;
        } else {
            pagBol.venceuBoleto = false;
        }

        if(pagBol.venceuBoleto == false){
            pagBol.processarPagamento(contas);
        } else{
            pagBol.processarPagamento(contas, 150.0);
        }

        //ONLINE
        System.out.println("Pagou o cartão em quantas vezes?");
        num = teclado.nextInt();
        if(num > pagOnl.qntParcelas){
            pagOnl.processarPagamento(contas, num, 10);
            pagBol.venceuBoleto = true;
        } else {
            pagOnl.processarPagamento(contas);
        }
    }
}
