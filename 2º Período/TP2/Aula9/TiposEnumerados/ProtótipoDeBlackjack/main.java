//Nesse jogo de dois jogadores, para cada um é sorteada uma carta entre Ás e Rei.
//Utilizando tipos enumerados, verifique qual carta sorteada é maior e imprima o
//vencedor do jogo. Nesse jogo, o Ás é a carta mais valiosa e vale mais que o Rei.
package TP2.Aula9.TiposEnumerados.ProtótipoDeBlackjack;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Blackjack blackjack = new Blackjack((int)Math.floor(Math.random() * 12),(int)Math.floor(Math.random() * 12));
        blackjack.imprime();
    }
}
