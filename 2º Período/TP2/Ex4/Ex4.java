//Exercício 4: Leia o raio de um círculo. Em seguida imprima o perímetro (2πR) e a área (πR2) do círculo com esse raio
package TP2.Ex4;
import java.util.Scanner;

public class Ex4 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double raio, perimetro, area, pi = 3.14;

        System.out.println("Insira um raio:");
        raio = teclado.nextFloat();

        perimetro = 2 * pi * raio;
        area = pi * (raio * raio);

        System.out.printf("O circulo de raio = %.2f tem o \n- Perimetro = %.2f \n- Area = %.2f", raio, perimetro, area);
    }
}
