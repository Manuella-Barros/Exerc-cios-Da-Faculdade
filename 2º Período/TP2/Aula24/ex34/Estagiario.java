package TP2.Aula24.ex34;

public class Estagiario extends  Funcionario{
    public Estagiario(String nome, double salarioBruto, double imposto) {
        super(nome, salarioBruto, imposto);
    }

    public double calculaSalarioLiquido(){
        return salarioBruto;
    }
}