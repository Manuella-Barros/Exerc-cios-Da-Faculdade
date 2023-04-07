//Exercício 1: Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e divisão entre elas.
package TP2.Ex1;

import java.util.Scanner;

public class operacao {
    public static void main(String [] args){
        int num1, num2, opc;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Escolha: \n1 - soma \n2- subtracao \n3 - multiplicacao \n4 - divisao \n> ");
        opc = teclado.nextInt();

        System.out.printf("Insira dois numeros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();

        switch (opc){
            case 1:
                System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
                break;
            case 2:
                System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
                break;
            case 3:
                System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
                break;
            case 4:
                System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
                break;
        }
    }
}
