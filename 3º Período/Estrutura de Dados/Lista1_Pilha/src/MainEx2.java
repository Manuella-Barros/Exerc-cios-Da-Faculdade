import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner scanner = new Scanner(System.in);
        String palavra, palavraSemSeparador = "", palavraInversa = "";
        boolean isValid = true;

        System.out.println("Insira uma palavra");
        palavra = scanner.next();

        for(int i = 1; i < palavra.length() - 1; i = i + 2){
            pilha.push(palavra.charAt(i));
        }

        for(int i = 0; i < palavra.length()/2; i++){
            char popValue = pilha.pop();

            if(popValue != 'D'){
                isValid = false;
            }
        }

        pilha.esvaziaPilha();

        for(int i = 0; i <= palavra.length() - 1; i = i + 2){
            palavraSemSeparador += palavra.charAt(i);
            pilha.push(palavra.charAt(i));
        }

        for(int i = 0; i <= palavra.length() - 1; i = i + 2){
            palavraInversa += pilha.pop();
        }

        if(!palavraSemSeparador.equals(palavraInversa)){
            isValid = false;
        }

        if(isValid){
            System.out.println("É válido");
        } else{
            System.out.println("Não é válido");
        }
    }
}
