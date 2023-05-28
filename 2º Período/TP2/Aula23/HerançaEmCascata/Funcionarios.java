package TP2.Aula23.HerançaEmCascata;

public class Funcionarios extends Empregado{
    public int carga_horaria;

    public Funcionarios(String nome, String fruta_fav, int idade, double salario, int carga_horaria) {
        super(nome, fruta_fav, idade, salario);
        this.carga_horaria = carga_horaria;
    }
}
