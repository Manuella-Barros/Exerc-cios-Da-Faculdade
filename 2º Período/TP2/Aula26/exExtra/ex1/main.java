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
        Livraria livrariaObj = new Livraria("Collen Hover", "Verity", 200, 20, 10);
        Scanner teclado = new Scanner(System.in);
        int opc = 0, valor = 0;

        do{
            if(livrariaObj.verificaLivroDisponivel()){
                System.out.printf("Quantos livros deseja comprar? \n(digite 0 se não deseja comprar) \n> ");
                opc = teclado.nextInt();

                if(opc!=0){
                    livrariaObj.quantidade -= opc;
                    valor = opc* livrariaObj.preco;
                }
            }
        }while (opc!=0);

        if (valor != 0){
            System.out.printf("Nota da compra \nTitulo: %s \nAutor: %s \nQuantidade restante: %d \nValor total: %d \n\n Volte sempre :)", livrariaObj.titulo, livrariaObj.autor,  livrariaObj.quantidade, valor);
        } else{
            System.out.println("Volte sempre :)");
        }

    }
}
