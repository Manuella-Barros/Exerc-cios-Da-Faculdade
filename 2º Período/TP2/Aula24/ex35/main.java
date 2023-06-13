package TP2.Aula24.ex35;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Contas conta = new Contas(000, 1000, 0);

        int opcAcao, opcConta;
        double valor;

        System.out.printf("Qual conta deseja mexer? \nDigite 1 para a conta comum \nDigite 2 para a conta poupança \nDigite 3 para a conta especial \n");
        opcConta = teclado.nextInt();
        System.out.printf("Digite: \n- 1 => Para sacar \n- 2 => Para depositar \n> ");
        opcAcao = teclado.nextInt();
        System.out.printf("Insira um valor ");
        valor = teclado.nextDouble();

        switch (opcConta){
            case 1:
                conta = new ContaComum(001, 1000, valor);
                break;
            case 2:
                conta = new ContaPoupanca(002, 100, valor, 0.20);
                break;
            case 3:
                conta = new ContaEspecial(002, 100, valor, 200);
                break;
            default:
                System.out.printf("Não tem essa opção");
        }

        if(opcAcao == 1){
            System.out.printf("Saldo atual R$%.2f \n", conta.sacarDinheiro());
        } else if(opcAcao == 2){
            System.out.printf("Saldo atual R$%.2f \n", conta.depositarDinheiro());
        } else{
            System.out.printf("Não tem essa opção");
        }
    }
}
