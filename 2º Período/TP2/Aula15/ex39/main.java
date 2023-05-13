package TP2.Aula15.ex39;
//Exercício 39: leia uma string e imprima quantas vezes as letras de A a
//Z aparecem na string. Dica: use uma lista para armazenar as letras
//lidas e outra lista para contar quantas vezes as letras aparecem.
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        ArrayList listaLetras = new ArrayList();
        ArrayList listaQuantidade = new ArrayList();
        String palavra, alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Insira uma palavra: ");
        palavra = teclado.next().toUpperCase(); //Tudo em maiusculo pra comparar

        for(int i = 0; i < palavra.length(); i++){ //Le cada letra da palavra
            for (int j = 0; j < 26; j++){ //Le cada letra do alfabeto
                if(!listaLetras.contains(alfabeto.charAt(j))){
                    listaLetras.add(alfabeto.charAt(j)); //aqui eu to criando uma lista com tds as letras do alfabeto
                    
                }
                //if(palavra.charAt(i) == alfabeto.charAt(j)){
                //    System.out.println(palavra.charAt(i) + " é igual a " + alfabeto.charAt(j));
                //}
            }
        }
        System.out.println(listaQuantidade);
    }
}
