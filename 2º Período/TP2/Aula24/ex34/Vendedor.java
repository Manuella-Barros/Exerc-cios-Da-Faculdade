package TP2.Aula24.ex34;

public class Vendedor extends Funcionario{
    public double bonus, salarioComBonus;

    public Vendedor(String nome, double salarioBruto, double imposto, double bonus) {
        super(nome, salarioBruto, imposto);
        this.bonus = bonus;
        calculaBonus();
    }

    public void calculaBonus(){
        salarioComBonus =  salarioBruto + (salarioBruto * bonus);
    }

    public double calculaSalarioLiquido(){
        calculaImposto();
        return salarioComBonus - imposto;
    }
}