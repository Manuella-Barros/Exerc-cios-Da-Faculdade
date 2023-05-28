package TP2.Aula23.HerançaEmCascata;

public class Empregado extends MembroDaComunidade{
    public double salario;

    public Empregado(String nome, String fruta_fav, int idade, double salario) {
        super(nome, fruta_fav, idade);
        this.salario = salario;
    }
}
