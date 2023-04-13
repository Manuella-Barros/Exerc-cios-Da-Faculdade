//Ex5: Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo
package TP2.Aula2.Ex5;
import java.util.Scanner;

public class Ex5 {
    public static void main(String [] args){
        Scanner teclaco = new Scanner(System.in);
        int t, hora, min, seg;

        System.out.println("Insira um tempo em segundos: ");
        t = teclaco.nextInt();

        //    1 min = 60 seg;    1 hors = 3600 seg
        hora = t >= 3600 ? t / 3600 : 0; // if de uma linha só
        t = hora == 0 ? t : t % 3600;
        min = t >= 60 ? t / 60 : 0;
        seg = min == 0 ? t : t % 60;

        if(hora < 10){
            System.out.printf("0%d:", hora);
        } else{
            System.out.printf("%d:", hora);
        }

        if(min < 10){
            System.out.printf("0%d:", min);
        } else{
            System.out.printf("%d:", min);
        }

        if(seg < 10){
            System.out.printf("0%d", seg);
        } else{
            System.out.printf("%d", seg);
        }
    }
}
