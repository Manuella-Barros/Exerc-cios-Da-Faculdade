package TP2.Aula23.HerançaEmCascata;

public class Funcionarios extends Empregado{
    public int carga_horaria;

    public Funcionarios(String nome, String fruta_fav, int idade, double salario, int carga_horaria) {
        super(nome, fruta_fav, idade, salario);
        this.carga_horaria = carga_horaria;
    }

    public void exibir_detalhes(){
        System.out.printf("\n\nInformações do Funcionario \n\nNome: %s \nFruta favorita: %s \nIdade: %d \nSalario: %.2f \nCarga horária: %d\n", nome, fruta_fav, idade, salario, carga_horaria);
    }
}
