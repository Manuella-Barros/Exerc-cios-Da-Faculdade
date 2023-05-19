import TP2.Aula12.ex1.ValidaString;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String texto1, texto2;
        ValidaString t1;

        System.out.println("Insira o texto 1: ");
        texto1 = teclado.next();
        System.out.println("Insira o texto 2: ");
        texto2 = teclado.next();


         t1 = new ValidaString(texto1, texto2);
    }

}
