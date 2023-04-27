//Exercício 26: crie um tipo enumerado para representar conceitos de
//um curso, com os seguintes intervalos de nota:
//
//✔ 0 a 2.9: péssimo
//✔ 3.0 a 4.9: ruim
//✔ 5.0 a 6.9: regular
//✔ 7.0 a 8.9: bom
//✔ 9.0 a 10.0: muito bom
//
//Em seguida, leia notas e informe o conceito associado.
package TP2.Aula9.TiposEnumerados.Ex26;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1;
        System.out.print("Digite o valor da nota: \n");
        n1 = teclado.nextFloat();

        for (int i = 0; i < Notas.values().length; i++) {
            if (n1 >= Notas.values()[i].min && n1 <= Notas.values()[i].max) {
                System.out.printf("O conceito é %s \n", Notas.values()[i].conceito);
            }
        }
    }
}
