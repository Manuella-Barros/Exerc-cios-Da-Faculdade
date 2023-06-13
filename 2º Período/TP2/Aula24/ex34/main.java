package TP2.Aula24.ex34;

public class main {
    public static void main(String[]args){
        Estagiario estagiario = new Estagiario("Jc",2000, 0.10);
        Vendedor vendedor = new Vendedor("Judas", 1000, 0.90, 0.10);

        System.out.printf("\nSalario liquido funcionario: %.2f ", estagiario.calculaSalarioLiquido());
        System.out.printf("\nSalario liquido vendedor: %.2f ", vendedor.calculaSalarioLiquido());
    }
}