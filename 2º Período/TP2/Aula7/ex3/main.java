//O imperador Romano, Júlio César, usava a Cifra de
//César para enviar ordens secretas aos seus generais.
//A ideia era trocar cada letra de uma mensagem pela
//terceira letra seguinte. Ou seja, a letra ‘a’ era
//substituída por ‘d’, a letra ‘b’ era substituída por ‘e’, e
//assim por diante.
//Escreva uma classe chamada Cifra. Essa classe não
//possui atributos mas possui um método denominado
//Criptografar que recebe uma string como parâmetro
//e retorna outra string criptografada assim como a
//Cifra de César. Essa classe também implementa o
//método Descriptografar que recebe como parâmetro
//uma string cifrada e retorna a mensagem original.
//Teste no seu programa principal dentro do método
//main a utilização da sua classe.
package TP2.Aula7.ex3;

import java.util.Scanner;
//Esse código foi feito com Thaissa Lopes, Lucca Carvalho e Lohan Toniatti

public class main {
    public static void main(String [] args){
        Scanner tecledo = new Scanner(System.in);
        Cifra cifra = new Cifra();
        cifra.Descriptografar("dfdl");
        cifra.Criptografar("acai");
    }
}