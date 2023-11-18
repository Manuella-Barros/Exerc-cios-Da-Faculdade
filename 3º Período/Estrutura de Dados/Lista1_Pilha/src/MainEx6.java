import java.util.Scanner;

public class MainEx6 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(17);
        Scanner scanner = new Scanner(System.in);
        String palavra = "a maçã está podre", valorTopo = "", palavraNova = "";

        for(int i = 0; i < palavra.length(); i++){

            if ( palavra.charAt(i) != ' ') {
                pilha.push(palavra.charAt(i));

            }
            if(palavra.charAt(i) == ' ' || i == palavra.length() - 1){
                int tamanho = pilha.tamanhoAtual;

                for(int n = 0; n < tamanho; n++){
                    palavraNova += pilha.pop();
                }

                palavraNova += ' ';
            }
        }

        System.out.println(palavraNova);
    }
}
