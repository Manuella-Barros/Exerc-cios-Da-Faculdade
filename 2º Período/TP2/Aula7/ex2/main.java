//Crie uma classe Produto que uma loja de materiais vai
//utilizar para representar um item vendido na loja. Um
//Produto deve possuir 4 informações: um número de
//identificação (inteiro positivo que varia de 1 até 9999),
//
//a quantidade de itens (inteiro não negativo), o nome
//do produto (texto) e o preço por item (um valor
//decimal não negativo).
//Sua classe deve ter um construtor que inicializa os
//quatro valores de modo íntegro. Sendo assim, para as
//informações que achar necessário, crie métodos
//Getters e Setters. Para valores default, considere que
//um número de identificação padrão é 1, a quantidade
//é 0, o preço é 0 e o nome é um texto vazio.
//
//package TP2.Aula7.ex2;
//import java.util.Scanner;
////Esse código foi feito com Thaissa Lopes, Lucca Carvalho e Lohan Toniatti
//
//public class main {
//    public static void main(String [] args){
//        Scanner teclado = new Scanner(System.in);
//        Produto prod = new Produto(1, 0, " ", 0);
//    }
//}

package TP2.Aula7.ex2;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto prod = new Produto(1, 0, " ", 0);

        System.out.println("Insira as informações do produto: ");
        System.out.printf("\nId: ");
        prod.setId(teclado.nextInt());
        System.out.printf("\nQuantidade: ");
        prod.setQntd(teclado.nextInt());
        System.out.printf("\nNome: ");
        prod.setNome(teclado.next());
        System.out.printf("\nPreco: ");
        prod.setPreco(teclado.nextFloat());

        prod.imprime();
        teclado.close();

    }
}