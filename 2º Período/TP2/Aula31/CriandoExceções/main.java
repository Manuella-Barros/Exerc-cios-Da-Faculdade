package TP2.Aula31.CriandoExceções;

import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int opc, op1, op2;
        boolean erro = false;

        do {
            erro = false;
            System.out.printf("Escolha a operação deseja realizar \n1 - Raiz Quadrada \n2 - Soma \n3 - Subtração \n4 - Divisão \n5 - Multiplicação \n0 - cancelar \n> ");
            opc = t.nextInt();

            switch (opc) {
                case 1:
                    try {
                        System.out.println("Digite um valor: ");
                        op1 = t.nextInt();
                        RaizQuadrada raizQuadrada = new RaizQuadrada(op1);
                        System.out.println(raizQuadrada.calcular());
                    } catch (Exception e) {
                        erro = true;
                        System.out.println("Erro " + e.getMessage());
                    }
                    break;
            }
        } while (erro);
    }
}
