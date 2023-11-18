import java.util.Scanner;

public class MainEx5 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);
        String palavra;
        char valorTopo;
        int indexAnterior = -1;

        System.out.println("Insira uma expressão");
        palavra = scanner.next();

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == '{' || palavra.charAt(i) == '}' || palavra.charAt(i) == '[' || palavra.charAt(i) == ']' ||
            palavra.charAt(i) == '(' || palavra.charAt(i) == ')'){
                pilha.push(palavra.charAt(i));
            }
        }

        for(int i = 0; !pilha.isVazia(); i++){
            valorTopo = pilha.pop();
            char fechamento = vericaPar(valorTopo);

            if(pilha.tamanhoMaximoOcupado % 2 != 0){
                System.out.println("Valor inválido");
                break;
            }
            if(fechamento == '-'){
                System.out.println("Valor inválido");
                break;
            } else if(fechamento != '+'){
                int indexFechamento = encontraIndexFechamento(fechamento, palavra);
                indexAnterior = verificaFechamento(indexFechamento, indexAnterior);

                if(indexAnterior == -1){
                    System.out.println("Valor inválido");
                    break;
                } else{
                    System.out.println("Válido");
                }
            }
        }
    }
    public static char vericaPar(char simboloAtual){
        switch (simboloAtual){
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            case '{':
            case '[':
            case '(':
                return '+';
            default:
                return '-';
        }
    }

    public static int encontraIndexFechamento(char fechamento, String palavra){
        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == fechamento){
                return i;
            }
        }

        return -1;
    }

    public static int verificaFechamento(int indexFechamento, int indexAnterior){
        if(indexAnterior > indexFechamento){

            return -1;
        } else{
            return indexFechamento;
        }
    }
}
