package TP2.Aula15.ex47;
//Exercício 47: Implemente um programa em Java que lê uma frase e
//conta quantas palavras existem e o número de ocorrências de cada
//palavra.
//
//Dica: use a classe StringTokenizer para quebrar a frase em palavras.
import java.util.*;
public class main {
    public static void main(String[]args){
        String texto = "eai como voce ta?";
        StringTokenizer textoDividido = new StringTokenizer(texto, " ");

        while (textoDividido.hasMoreTokens()) {
            System.out.println(textoDividido.nextToken());
        }
    }
}
