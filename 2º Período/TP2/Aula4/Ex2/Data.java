package TP2.Aula4.Ex2;

public class Data {
    public int dia;
    public int mes;
    public int ano;
    public char separador;

    public boolean ehValida(){ //a) ehValida() que deverá retornar true se os valores de dia, mês e ano formarem uma data válida ou false caso contrário.
        if(dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0 && ano <= 2023){
            return true;
        } else{
            return false;
        }
    }

    public boolean ehBissexto(){
        if (ano % 4 == 0){
            if (ano % 100 == 0){
                if (ano % 400 == 0){
                    return true;
                } else{
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    public void imprime(){
        System.out.printf("%d%s%d%s%d\n", dia, separador, mes, separador, ano);
    }
}
