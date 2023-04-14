// Exercício 2: crie uma classe Data para representar uma data. Para
//criar uma data é obrigatório informar dia, mês e ano. Crie, também,
//três métodos:
//a) ehValida() que deverá retornar true se os valores de dia, mês e
//ano formarem uma data válida ou false caso contrário.
//b) ehBissexto() que deverá retornar true se os valores de dia, mês e
//ano formarem uma data válida e o ano for bissexto ou false caso
//contrário.
//c) imprime() que deverá imprimir a data com o separador default "/"
//ou com um separador definido pelo usuário. Caso a data seja
//inválida, o método deverá imprimir "INVÁLID

package TP2.Aula4.Ex2;
import java.util.Scanner;
public class ex2 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Data data = new Data();

        System.out.println("Insira o dia:");
        data.dia = teclado.nextInt();
        System.out.println("Insira o mes:");
        data.mes = teclado.nextInt();
        System.out.println("Insira o ano:");
        data.ano = teclado.nextInt();
        System.out.println("Insira um separador:");
        data.separador = teclado.next().charAt(0);
        data.imprime();
    }
}
