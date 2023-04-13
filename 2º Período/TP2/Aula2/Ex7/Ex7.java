// Leia uma variável n inteira. Em seguida, imprima uma mensagem informando se o número n é par ou ímpa
package TP2.Aula2.Ex7;
import java.util.Scanner;
public class Ex7 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Insira um valor: ");
        n = teclado.nextInt();

        if(n % 2 == 0){
            System.out.printf("%d e par\n", n);
        } else{
            System.out.printf("%d e impar\n", n);
        }
    }
}
