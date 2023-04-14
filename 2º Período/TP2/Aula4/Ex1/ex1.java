//Crie uma classe ContaCorrente para representar uma
//conta corrente. A classe deverá armazenar o saldo da conta. Crie
//métodos para depositar uma quantia, sacar uma quantia e obter o
//saldo da conta. Para cada saque será debitada também uma taxa de
//operação no valor de R$ 1,50. O saque só poderá ser efetuado se
//houver saldo suficiente para a quantia solicitada mais a taxa da
//operação

package TP2.Aula4.Ex1;
import java.util.Scanner;
public class ex1 {
    public static void main(String [] args){
        ContaCorrente conta = new ContaCorrente();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.printf("\nEscolha uma opcao: \n1 - Depositar \n2 - Sacar \n3 - Ver saldo \n0 - Sair \n> ");
            conta.opc = teclado.nextInt();

            if(conta.opc == 1){
                System.out.printf("\nDigite a quantia a ser depositada: ");
                conta.salAdd = teclado.nextFloat();
            }
            if(conta.opc == 2){
                System.out.printf("\nDigite a quantia a ser sacada: ");
                //Esse do ta errado
                //do {
                   conta.salRetirar = teclado.nextFloat();
                //    if(conta.salRetirar > conta.salConta){
                //        System.out.printf("Valor maior que o da conta. Nao e possivel retirar");
                //    }
                //}while (conta.salRetirar > conta.salConta);

            }

            conta.contaCorrente();
        } while (conta.opc != 0);




    }
}
