package TP2.Aula9.ex25;
import java.util.Scanner;

public class Empurra {
    private int n,p,k;
    private int[] v;


    Scanner teclado = new Scanner(System.in);

    public Empurra() {
        lerVetor();
        insereVetor();
        imprime();
    }

    public void lerVetor() {
        System.out.println("Insira o valor de p (posição)");
        p = teclado.nextInt(); //PEGA POSIÇÃO
        System.out.println("Insira o valor de k");
        k = teclado.nextInt(); //PEGA NUMERO

        System.out.println("Insira um valor N: ");
        n = teclado.nextInt(); //PEGA TAMANHO DO VETOR
        v = new int[n];

        for(int i = 0; i < n; i++ ) { //INSERE VALOR NO VETOR
            System.out.printf("Insira um valor da posição %d do vetor: ", i);
            v[i] = teclado.nextInt();
        }
    }

    public void insereVetor(){
        for(int i = n-1; i >= 0; i--){
            if(i > p){
                v[i] = v[i-1];
            } else if(i == p){
                v[i] = k;
            }
        }
    }

    public void imprime() {
        for(int i = 0; i < n; i++ ) {
            System.out.printf("valor da posição %d do vetor: %d\n", i, v[i]);
        }

    }


}
