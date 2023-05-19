package TP2.Simulado.ex4;
import java.util.Scanner;
import java. util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        new Livro(" ", " ", 1, 1.0);
        String titulo, autor;
        int ano;
        double preco;
        ArrayList listaLivros = new ArrayList();

        System.out.println("Insira o titulo");
        titulo = teclado.nextLine();
        while(!titulo.isEmpty()) {
            System.out.println("Insira o autor");
            autor = teclado.nextLine();
            System.out.println("Insira o ano");
            ano = teclado.nextInt();
            System.out.println("Insira o preço");
            preco = teclado.nextDouble();
            teclado.nextLine();// pega o espaço que o double n pega

            if (!titulo.isEmpty()) {
                Livro livro = new Livro(autor, titulo, ano, preco);
                listaLivros.add(livro);
            }

            System.out.println("Insira o titulo");
            titulo = teclado.nextLine();
        }

        System.out.println("Insira um titulo para buscar");
        String livroEscolhido = teclado.next();
        Livro li = buscarLivro(livroEscolhido, listaLivros);
        System.out.printf("Autor: %s \nTitulo: %s \nAno: %d \nPreço: %.2f", li.autor, li.titulo, li.getAno(), li.getPreco());
    }

    public static Livro buscarLivro(String livroEscolhido, ArrayList listaLivros) {
        for(int i = 0; i < listaLivros.size(); ++i) {
            Livro l = (Livro)listaLivros.get(i);
            if (l.titulo.equals(livroEscolhido)) {
                return l;
            }
        }

        return null;
    }
}
