package TP2.Aula15.ex38;
//Exercício 38: leia strings e armazene-as em uma lista até que o
//usuário digite uma string vazia. Não permita que sejam armazenadas
//strings duplicadas na lista. Ao final, imprima a lista na ordem inversa.
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        String palavra;

        do{
            System.out.println("Insira uma palavra");
            palavra = teclado.nextLine();

            if(!palavra.isBlank() && !lista.contains(palavra)){ //add na lista se: palavra != vazio && palavra ñ estiver na lista
                lista.add(palavra);
            }


        }while (!palavra.isBlank()); //Faça enquanto a palavra = vazio for falsa, ou seja, n for vazio

        for(int i = lista.size() - 1; i >= 0; i--){
            System.out.println(lista.get(i));
        }

    }
}
