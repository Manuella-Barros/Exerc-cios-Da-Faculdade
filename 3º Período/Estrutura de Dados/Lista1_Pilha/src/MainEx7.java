import java.util.Scanner;

public class MainEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilhaInfixa = new Pilha(20);
        PilhaGenerica<Integer> pilhaResultados = new PilhaGenerica<>(20);
        PilhaGenerica<Integer> pilhaAbreParentesesIndex = new PilhaGenerica<>(20);

        String expressao = "(1+((2+3)*(4*5)))";
        //String expressao = "(((2+2)+(2+3))+1)"; //(9 + 1)

        for (int i = 0; i < expressao.length(); i++) {
            char elementoExpressao = expressao.charAt(i);
            PreenchePilhaPosFixada(elementoExpressao, pilhaInfixa, pilhaResultados, pilhaAbreParentesesIndex);
        }

        System.out.println("Resultado = " + pilhaResultados.pop());
    }

    public static void PreenchePilhaPosFixada(char elementoExpressao,  Pilha pilhaInfixa, PilhaGenerica<Integer> pilhaResultados, PilhaGenerica<Integer> pilhaAbreParentesesIndex){
        int v1, v2;
        char operacao;
        String operacoes = "+-*/";

        if(elementoExpressao != ')'){
            pilhaInfixa.push(elementoExpressao);
        }
        if(elementoExpressao == '('){
            pilhaAbreParentesesIndex.push(pilhaInfixa.tamanhoAtual - 1);
        }
        if(elementoExpressao == ')'){
            int fechaParentesesIndex = pilhaInfixa.tamanhoAtual;
            int charindex = pilhaAbreParentesesIndex.pop();
            int distanciaParenteses = fechaParentesesIndex - charindex;

            // (, valor1, operacao, valor2
            if(distanciaParenteses == 4) {
                v1 = Character.getNumericValue(pilhaInfixa.pop()); // add valor 1
                operacao = pilhaInfixa.pop();
                v2 = Character.getNumericValue(pilhaInfixa.pop()); // add valor 2
                pilhaInfixa.pop(); // remove (

                pilhaResultados.push(ResolveConta(v1, v2, operacao));

            } else if( distanciaParenteses == 2){//
                pilhaResultados.push(ResolveConta(pilhaResultados.pop(), pilhaResultados.pop(), pilhaInfixa.pop()));
                pilhaInfixa.pop(); // remove (

            } else if( distanciaParenteses == 3) {
                char valor = pilhaInfixa.pop();
                int valorNum = 0;

                if(operacoes.contains(valor + "")){ //se primeiro item é +,-,*,/
                    operacao = valor; // add operacao
                    valorNum = Character.getNumericValue(pilhaInfixa.pop());
                } else {
                    valorNum = Character.getNumericValue(valor); // add valor (1+sfdf)// (sdsd+1)
                    operacao = pilhaInfixa.pop(); // add operacao
                }

                pilhaInfixa.pop(); // remove(
                pilhaResultados.push(ResolveConta(pilhaResultados.pop(), valorNum, operacao));
            }
        }
    }

    public static int ResolveConta(int v1, int v2, char operacao) {
        switch (operacao) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                return v1 / v2;
            default:
                return 0;
        }
    }
}