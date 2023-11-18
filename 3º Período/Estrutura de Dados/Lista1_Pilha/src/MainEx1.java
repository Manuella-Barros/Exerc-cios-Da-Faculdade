//Escreva uma função para determinar se uma cadeia de caracteres (string) é da forma: x C
//y onde x e y são cadeias de caracteres compostas por letras ‘A’ e/ou ‘B’, e y é o inverso de
//x. Isto é, se x = “ABABBA”, y deve equivaler a “ABBABA”. Em cada ponto, você só poderá ler
//o próximo caractere da cadeia.

import java.util.Scanner;

// x C y
// x => palavra e y = inverso palavra
// palavra C inverso da palavra
// ABBCBBA é valido
// ABCAA é invalido

public class MainEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();
        String palavra;
        boolean isMiddle = false; //Determina quando chega na metade da cadeia

        System.out.println("Esse programa verificará que a palavra inserida segue o formato x C y, sendo x uma" +
                " palavra e y o inverso dela\n");
        System.out.println("Insira uma palavra");
        palavra = scanner.next();

        for(int i = 0; i < palavra.length(); i++){ //ABB C BBA
            if(palavra.charAt(i) == 'C' || palavra.charAt(i) == 'c'){
                isMiddle = true;

            } else if(!isMiddle){
                pilha.push(palavra.charAt(i));

            } else {
                char topoPilha = pilha.pop();

                if(palavra.charAt(i) == topoPilha){
                    if(pilha.isVazia()){
                        System.out.println("A sequência é valida");
                        break;
                    }
                } else{
                    System.out.println("A sequência é invalida");
                    break;
                }
            }
        }
    }
}