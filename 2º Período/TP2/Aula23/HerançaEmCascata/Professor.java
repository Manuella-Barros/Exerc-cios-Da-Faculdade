package TP2.Aula23.HerançaEmCascata;

public class Professor extends CorpoDocente{
    public String aula; //nome das aulas q ele da

    public Professor(String nome, String fruta_fav, int idade, double salario, String area_especializacao, String aula){
        super(nome, fruta_fav, idade, salario, area_especializacao);
        this.aula = aula;
    }

    public void exibir_detalhes(){
        System.out.printf("\n\nInformações do Professor \n\nNome: %s \nFruta favorita: %s \nIdade: %d \nSalario: %.2f \nArea de especialização: %s \nAula: %s\n", nome, fruta_fav, idade, salario, area_especializacao, aula);
    }
}
