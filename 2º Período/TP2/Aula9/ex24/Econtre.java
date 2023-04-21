package TP2.Aula9.ex24;
import java.util.Scanner;
public class Econtre {
    private int n, k;
    private int[] v;
    Scanner teclado = new Scanner(System.in);

    public Econtre(){
        input();
        lerVetor();
        compara();
    }

    public void input(){
        System.out.println("Insira o valor n (tamanho)");
        n = teclado.nextInt();
        System.out.println("Insira o valor k");
        k = teclado.nextInt();
        v = new int[n];
    }
    public void lerVetor(){
        for(int i = 0; i < n; i++){
            System.out.println("Insira um valor no vetor");
            v[i] = teclado.nextInt();
        }
    }

    public void compara(){
        int contador = 0;
        for(int i = 0; i < n; i++){
            if(v[i] == k){
                System.out.printf("K está na pçosição %d\n", i);
                contador++;
            }
        }

        if(contador == 0){
            System.out.println("Número não encontrado");
        }
    }
}
