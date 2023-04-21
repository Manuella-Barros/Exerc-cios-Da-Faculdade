package TP2.Aula9.ex23;
import java.util.Scanner;

public class CalculaMedia {
    private int quant;
    private double[] notas;
    Scanner teclado = new Scanner(System.in);


    public CalculaMedia(){
        input();
        media();
    }

    public void input(){
        System.out.println("Insira a quantidade de alunos: ");
        quant = teclado.nextInt();

        notas = new double[quant];

        for(int i = 0; i < quant; i++){
            System.out.printf("Insira a nota do aluno %d\n", i+1);
            notas[i] = teclado.nextInt();
        }
    }

    public void media(){
        int sum = 0, media = 0;

        for(int i = 0; i < quant; i++){
            sum += notas[i];
        }

        media = sum/quant;

        System.out.printf("Media: %d", media);
    }
}
