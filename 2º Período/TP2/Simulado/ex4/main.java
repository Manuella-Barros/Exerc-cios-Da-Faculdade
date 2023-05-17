package TP2.Simulado.ex4;
import java.util.Scanner;
import java. util.ArrayList;
public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Livro livro = new Livro(" ", " ", 1, 1);
        String livroEscolhido, autor, titulo;
        int ano;
        double preco;
        ArrayList listaLivros = new ArrayList();

        do{
            System.out.println("Insira o autor");
            autor = teclado.nextLine();
            System.out.println("Insira o titulo");
            titulo = teclado.nextLine();
            System.out.println("Insira o ano");
            ano = teclado.nextInt();
            System.out.println("Insira o preço");
            preco = teclado.nextDouble();

            if(livro != null){
                livro = new Livro(autor, titulo, ano, preco);
                listaLivros.add(livro);
            }
        } while(livro != null);


        System.out.println("Insira um titulo");
        livroEscolhido = teclado.next();

        buscarLivro(livroEscolhido, listaLivros);
    }
//c. No programa principal, crie um método buscarLivro que recebe como parâmetro
//uma String contendo o título do livro e retorna o objeto “Livro” correspondente.
//Caso o livro não seja encontrado, o método deve retornar null.
//d. No programa principal, peça ao usuário para registrar livros até que ele insira uma
//string vazia. Depois peça para ele buscar um livro e apresente na tela as
//informações do livro buscado.
    public static Livro buscarLivro(String livroEscolhido, ArrayList listaLivros){
        for(int i = 0; i < listaLivros.size(); i++){
            String l = listaLivros.get(i);
        }
    }
}