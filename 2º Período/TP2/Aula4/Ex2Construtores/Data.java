package TP2.Aula4.Ex2Construtores;

public class Data {
    private int dia, mes, ano; //ATRIBUTOS
    private char separador; //ATRIBUTOS

    public Data(int dia, int mes, int ano, char separador){ //CONSTRUTOR.  Inicializa a instância com os valores desejados
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setSeparador(separador);
        ehBissexto();
    }

    public void setDia(int dia){ //SETTING. coloca o valor no atributo de acordo com o parametro
        this.dia = dia;
    }
    public void setMes(int mes){ //SETTING
        this.mes = mes;
    }
    public void setAno(int ano){ //SETTING
        this.ano = ano;
    }
    public void setSeparador(char separador){
        this.separador = separador;
    } //SETTING

    public void imprime(){
        System.out.printf("\n%d%c%d%c%d\n", dia, separador, mes, separador, ano);

        if(ehBissexto() == true){
            System.out.println("É bissexto");
        } else{
            System.out.println("Não é bissexto");
        }
    }

    public boolean ehValida(){
        if(dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0 && ano <= 2023){
            return true;
        } else{
            System.out.println("Data Invalida");
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

    public int getDia(){ return dia;}//GETTING. retorna valores para utiliza-los na main
    public int getMes(){ return mes;}//GETTING
    public int getAno(){ return ano;}//GETTING
    public char getSeparador(){ return separador;}//GETTING

}
