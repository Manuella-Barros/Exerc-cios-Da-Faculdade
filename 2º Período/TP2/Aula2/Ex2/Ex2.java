//Altere o tipo das duas variáveis do exercício 1 para ponto flutuante
package TP2.Ex2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        float num1, num2;
        int opc;

        System.out.printf("Escolha: \n1 - Soma \n2 - Subtracao \n3 - Multiplicacao \n4 - Divisao \n> ");
        opc = teclado.nextInt();

        System.out.println("Insira dois numeros: ");
        num1 = teclado.nextFloat();
        num2 = teclado.nextFloat();

        switch (opc){
            case 1:
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1+num2);
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1-num2);
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1*num2);
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1/num2);
                break;
        }
    }
}
