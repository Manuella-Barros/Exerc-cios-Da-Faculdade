package TP2.Aula31.ex48;
import java.util.*;

public class main {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        int num, soma = 0, opc;

        do{
            System.out.printf("Digite um numero maior do que 0 para somar e menor ou igual a 0 para parar \n> ");
            opc = t.nextInt();

            if(opc > 0){
                System.out.println("Insira um numero > 0 a ser somado");
                num = t.nextInt();
                if(num > 0){
                    soma += num;
                } else{
                    throw new IllegalArgumentException("O numero deve ser maior do que 0");
                }
            }
        } while (opc > 0);

        System.out.println(soma);
    }
}
