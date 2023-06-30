package TP2.Aula31.exSlide19;
import java.awt.geom.QuadCurve2D;
import java.util.*;
public class main {
    public static void main(String[]args){
        int a, b = 0, c;
        boolean erro = false;
        Scanner t = new Scanner(System.in);

        do{
            erro = false;
            try {
                erro = false;
                a = t.nextInt();
                b = t.nextInt();
                c = a / b;

                System.out.printf("%d / %d = %d\n", a, b, c);
            } catch(InputMismatchException e) {
                erro = true;
                System.out.printf("Entrada inválida\n");
                t.nextLine();
            } catch(ArithmeticException e) {
                erro = true;
                System.out.printf("Erro: %s\n", e.getMessage());
                t.nextLine();
            }
        } while (erro);
    }
}
