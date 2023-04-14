package TP2.Aula4.Ex2;

public class Data {
    public int dia;
    public int mes;
    public int ano;
    public char separador;
/*
    public int ehValida(){ //a) ehValida() que deverá retornar true se os valores de dia, mês e ano formarem uma data válida ou false caso contrário.
    }

    public int ehBissexto(){
    }
*/
    public void imprime(){
        System.out.printf("%d%s%d%s%d\n", dia, separador, mes, separador, ano);
    }
}
