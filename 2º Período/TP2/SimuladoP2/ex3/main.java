package TP2.SimuladoP2.ex3;
import java.util.*;

public class main {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        System.out.println("Informe o primeiro valor: ");
        boolean erro = false;

        do{
            erro = false;
            try{
                erro = false;
                int x = teclado.nextInt();
                System.out.println("Informe o segundo valor: ");
                int y = teclado.nextInt();
                int r = x / y;
                System.out.println("O resultado da divisão é " + r);
            }catch (InputMismatchException e){
                erro = true;
                System.out.println("Erro: " + e.getMessage());
            }catch (ArithmeticException e){
                erro = true;
                System.out.println("Erro: " + e.getMessage());
            }catch (Exception e){
                erro = true;
                System.out.println("Erro " + e.getMessage());
            }
            teclado.next();
        }while (erro);
    }
}
