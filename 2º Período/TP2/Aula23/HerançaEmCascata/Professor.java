package TP2.Aula23.HerançaEmCascata;

public class Professor extends CorpoDocente{
    public String[] aulas; //nome das aulas q ele da

    public Professor(String nome, String fruta_fav, int idade, double salario, String area_especializacao, String[] aulas){
        super(nome, fruta_fav, idade, salario, area_especializacao);
        this.aulas = aulas;
    }
}
