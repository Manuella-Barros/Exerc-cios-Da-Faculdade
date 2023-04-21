package TP2.Aula7.ex4;
import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de funções quadráticas!");
        System.out.println("Favor entre com os valores de a, b e c:");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        //Instanciação de um objeto FuncaoQuadratica
        FuncaoQuadratica objFunc = new FuncaoQuadratica(a, b, c);
        System.out.printf("\nO objeto função criado é %s\n", objFunc.Descricao());

        //Agora que o objeto foi criado, vamos chamar seus métodos
        System.out.printf("O X do vértice vale %.2f e o Y do vértice vale %.2f\n", objFunc.XVertice(), objFunc.YVertice());
        System.out.printf("As raízes da função valem %.2f e %.2f\n", objFunc.Raiz1(), objFunc.Raiz2());
        System.out.printf("A concavidade da função é %s\n", objFunc.Concavidade());
    }
}
