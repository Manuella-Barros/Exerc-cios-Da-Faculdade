package TP2.Aula26.exExtra.ex2;

public class Produto implements Comparable{
    public String nome;
    public double preco;
    public int quant;

    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    //Era pra ter um override mas n vai
    public int compareTo(Object o) {
        Produto aux = (Produto) o;

        if (preco < aux.preco){
            return -1;
        } else if(preco > aux.preco){
            return 1;
        } else{
            return 0;
        }
    }
}
