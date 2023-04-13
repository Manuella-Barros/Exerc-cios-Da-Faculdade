//Leia a distância percorrida por um carro, o tempo gasto e a quantidade de gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e o consumo de combustível (Km/l)
//N entendi o calculo da gasolina
package TP2.Aula2.Ex6;
import java.util.Scanner;

public class Ex6 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int distancia, t, gas, velMed;

        System.out.println("Insira a distância percorrida por um carro, o tempo gasto e a quantidade de gasolina consumida");
        distancia = teclado.nextInt();
        t = teclado.nextInt();
        gas = teclado.nextInt();

        velMed = distancia / t;
        System.out.printf("A velocidade media = %d", velMed);
    }
}
