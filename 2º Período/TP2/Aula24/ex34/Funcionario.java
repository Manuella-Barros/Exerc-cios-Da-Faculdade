package TP2.Aula24.ex34;

public class Funcionario {
    public String nome;
    public double salarioBruto, imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public void calculaImposto(){
        if(salarioBruto <= 900){
            imposto = 0;
        } else if(salarioBruto <= 1500){
            imposto = salarioBruto * 0.15; // pega o valor de 15% do salario
        } else{
            imposto = salarioBruto * 0.20; // pega o valor de 15% do salario
        }
    }

    public double calculaSalarioLiquido(){
        return salarioBruto - imposto;
    }
}
