package TP2.Aula14;
import java.util.Scanner;

public class main {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        String paragrafo;
        Tweet twt = new Tweet(" ");

        System.out.println("Insira um texto: ");
        paragrafo = teclado.nextLine(); //Pega as string com espaços
        twt.setParagrafo(paragrafo);
        twt.contaCaracteres(paragrafo);
        twt.contaPalavras(paragrafo);

    }
}
