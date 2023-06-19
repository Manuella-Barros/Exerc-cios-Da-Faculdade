package TP2.Aula26.exExtra.ex1;
//Crie uma interface chamada "ItemVendavel" que contenha métodos para
//manipular informações de um item vendido em uma livraria, como título,
//preço e quantidade em estoque. Em seguida, crie uma classe chamada "Livro"
//que implemente a interface "ItemVendavel" e represente um livro disponível
//para venda na livraria, com atributos adicionais, como autor e número de
//páginas. Por fim, crie uma classe chamada "Livraria" que utilize a interface
//"ItemVendavel" para gerenciar o estoque de livros e realizar operações de
//compra e venda.
import java.util.*;
public class main {
    public static void main(String[]args){
        Livraria livrariaObj = new Livraria();
        Scanner teclado = new Scanner(System.in);
        int opc;

        if(livrariaObj.verificaLivroDisponivel()){
            System.out.printf("Deseja comprar? \nDigite 0 para sim \nDifite 1 para não \n> ");
            opc = teclado.nextInt();

            switch (opc){
                case 0:
                    livrariaObj.realizaCompra();
                    break;
                case 1:
                    break;
            }
        }
    }
}
