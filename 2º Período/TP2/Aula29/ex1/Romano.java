package TP2.Aula29.ex1;

import java.util.HashMap;

public class Romano {
    public HashMap mapaUnidade = new HashMap<>();
    public HashMap mapaDezena = new HashMap<>();
    public HashMap mapaCentena = new HashMap<>();
    public String[] valorUnidade = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public String[] valorDezena = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public String[] valorCentena = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public int num, c, d, u;;

    public Romano(int num){
        this.num = num;
        preencheMapa(); // PREENCHE OS VALORES PRA CONVERSÃO
        divideValor(); // DIVIDE CENTENA, DEZENA E UNIDADE
        converteNum(); // CONVERTE DE DECIMAL PRA ROMANO
    }

    public void preencheMapa() {
        for(int i = 0; i <= 9; i++){
            mapaUnidade.put(i,valorUnidade[i]);
            mapaDezena.put(i,valorDezena[i]);
            mapaCentena.put(i,valorCentena[i]);
        }
    }

    public void divideValor(){
        c = num/100;
        d = (num - (c * 100)) / 10;
        u = (num - (c * 100)) % 10;
    }

    public void converteNum(){
        System.out.println("\nDecimal = " + num + "\nRomano = " + mapaCentena.get(c) + mapaDezena.get(d) + mapaUnidade.get(u));
    }
}
