//Adicione à classe Relogio o método TotalizarSegundos(). Esse método deverá calcular a quantidade de segundos total de acordo com os valores armazenados em seus atributos e retornar esse valor. Após implementar o método, teste sua funcionalidade no método Main() através de uma instância de Relogio.
package TP2.Aula4.ExRelogio;
import java.util.Scanner;
public class ExRelogio {
    public static void main(String [] args){
        Relogio rel = new Relogio();

        rel.horas = 13;
        rel.min = 02;
        rel.seg = 15;

        rel.mostraRelogio();
        rel.totalizarSegundos();
    }
}
