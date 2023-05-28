package TP2.Aula23.HerançaEmCascata;

public class CorpoDocente extends Empregado{
    public String area_especializacao;

    public CorpoDocente(String nome, String fruta_fav, int idade, double salario, String area_especializacao) {
        super(nome, fruta_fav, idade, salario);
        this.area_especializacao = area_especializacao;
    }
}
