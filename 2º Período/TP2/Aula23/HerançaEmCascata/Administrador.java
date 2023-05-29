package TP2.Aula23.HerançaEmCascata;

public class Administrador extends CorpoDocente{
    public int anos_experiencia;

    public Administrador(String nome, String fruta_fav, int idade, double salario, String area_especializacao, int anos_experiencia) {
        super(nome, fruta_fav, idade, salario, area_especializacao);
        this.anos_experiencia = anos_experiencia;
    }

    public void exibir_detalhes(){
        System.out.printf("\n\nInformações do Administrador \n\nNome: %s \nFruta favorita: %s \nIdade: %d \nSalario: %.2f \nArea de especialização: %s \nAnos de experciencia: %d\n", nome, fruta_fav, idade, salario, area_especializacao, anos_experiencia);
    }
}
