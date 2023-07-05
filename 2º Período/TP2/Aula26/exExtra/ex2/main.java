package TP2.Aula26.exExtra.ex2;
//Crie uma classe chamada "Produto" que implementa a interface "Comparable"
//em Java, para representar um produto em uma loja. A classe "Produto" deve
//possuir atributos como nome, preço e quantidade em estoque. A interface
//"Comparable" deve ser utilizada para definir a ordem de comparação dos
//produtos com base em seu preço. Implemente o método CompareTo que
//recebe como argumento de entrada um segundo objeto da classe Produto
//retorna qual dos produtos tem o preço maior.
public class main {
    public static void main(String[]args){
        Produto p1 = new Produto("Bonequinha Ladybug", 2, 50);
        Produto p2 = new Produto("Boneco Cat Noir", 5, 20);

        switch (p1.compareTo(p2)){
            case -1:
                System.out.printf("%s é mais caro do que %s \n", p2.nome, p1.nome);
                break;
            case 1:
                System.out.printf("%s é mais caro do que %s \n", p1.nome, p2.nome);
            case 0:
                System.out.printf("Os dois custam a mesma coisa");
                break;
        }

    }
}
