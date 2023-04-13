//Exercício 3: Leia o salário e o percentual de aumento. Em seguida, aplique o percentual de aumento sobre o salário e imprima o novo salário.
package TP2.Ex3;
import java.util.Scanner;

public class Ex3 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        float salInicial, aum, salFinal;

        System.out.println("Insira seu salario: ");
        salInicial = teclado.nextFloat();

        System.out.println("Insira o percentual de aumento: ");
        aum = teclado.nextFloat();

        salFinal = salInicial + ((salInicial * aum)/100);
        System.out.printf("Seu salario final e = %.2f", salFinal);
    }
}
