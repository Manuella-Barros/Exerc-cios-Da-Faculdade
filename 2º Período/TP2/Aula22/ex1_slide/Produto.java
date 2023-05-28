package TP2.Aula22.ex1_slide;

public class Produto {
    public String descricao;
    public int codigo;
    protected double preco, peso;

    public Produto(String descricao, int codigo, double preco, double peso){
        this.descricao = descricao;
        this.codigo = codigo;
        setPreco(preco);
        setPeso(peso);
    }

    public void calculaFrete(){
        System.out.printf("Frete = %.2f\n", peso*6.5);
    }

    public boolean setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
            return true;
        } else{
            return false;
        }
    }

    public boolean setPeso(double peso) {
        if(peso > 0){
            this.peso = peso;
            return true;
        } else{
            return false;
        }
    }

    public double getPreco() {return preco;}

    public double getPeso() {return peso;}
}