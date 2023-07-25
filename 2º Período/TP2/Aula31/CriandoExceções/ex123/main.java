package TP2.Aula31.CriandoExceções.ex123;

import TP2.Aula31.ex36.*;
import TP2.Aula31.ex36.RaizQuadrada;

import java.util.*;
public class main {
    public static void main(String[] args) {
        int opc, op1, op2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.printf("Escolha a operação deseja realizar \n1 - Raiz Quadrada \n2 - Divisão \n0 - cancelar \n> ");
            opc = teclado.nextInt();

            switch (opc){
                case 1:
                    try {
                        System.out.println("Digite um valor: ");
                        op1 = teclado.nextInt();
                        RaizQuadrada raizQuadrada = new RaizQuadrada(op1);
                        System.out.println(raizQuadrada.calcular());
                    } catch (Exception e) {
                        System.out.println("Erro " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Digite 2 valores");
                        op1 = teclado.nextInt();
                        op2 = teclado.nextInt();
                        Divisao divisao = new Divisao(op1, op2);
                        System.out.println(divisao.calcular());
                    } catch (Exception e){
                        System.out.println("Erro " + e.getMessage());
                    }
                    break;
            }
        } while (opc != 0);
    }
}
