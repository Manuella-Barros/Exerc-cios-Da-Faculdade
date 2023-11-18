//Sabe-se que existem partes de sistemas operacionais que cuidam da ordem em que os
//processos devem ser executados. Por exemplo, em um sistema de computação “timeshared”, existe a necessidade de manter um conjunto de processos em uma fila. Realize uma
//modelagem e crie classes que representam um Processo e o Sistema Operacional. Dessa
//maneira, escreva métodos para:
//a. Incluir novos processos em uma fila de processos;
//b. Retirar da fila o processo com o maior tempo de espera;
//c. Imprimir o conteúdo da fila de processos em determinado momento. Cada processo possui
//um número identificador.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Fila fila = new Fila(3);
        int processo, opc;
        boolean isValid;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n1 - Incluir processo na fila \n2 - Retirar processo da fila " +
                    "\n3 - imprimir conteúdo da fila \n0 - Sair");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("\nO que deseja incluir na pilha?");
                    processo = scanner.nextInt();
                    isValid = adicionaFila(fila, processo);

                    if(isValid){
                        System.out.println("\nProcesso adicionado com sucesso");
                    } else{
                        System.out.println("\nNão foi possivel adicionar, a pilha está cheia");
                    }
                    break;

                case 2:
                    processo = removeFila(fila);
                    if(processo != Integer.MIN_VALUE){
                        System.out.println("\nO processo " + processo + " foi removido com sucesso");
                    } else{
                        System.out.println("\nNão foi possivel remover, a pilha está vazia");
                    }
                    break;

                case 3:
                    imprimeFila(fila);

                default:
                    break;
            }
        } while(opc != 0);
    }

    public static boolean adicionaFila(Fila fila, int valor){
        return fila.insere(valor);
    }

    public static int removeFila(Fila fila){
        return fila.remove();
    }

    public static void imprimeFila(Fila fila){
        if(!fila.isVazia()){
            System.out.println("\nItens na fila");

            for (int i = fila.inicio, j = 1; j <= fila.qntElementos; i = (i + 1) % fila.tamanho, j++){
                System.out.println(j + " - " + fila.vetor[i]);
            }
        } else{
            System.out.println("\nNão há elementos na fila");
        }
    }
}