//Crie uma classe chamada Funcionario que inclui três
//informações como atributos: o primeiro nome, o
//sobrenome e o salário mensal de um funcionário
//(valor decimal maior ou igual que 0 e menor que
//20000).
//Sua classe deverá ter um construtor que inicializa
//esses três valores. Para valores default, considere o
//nome e o sobrenome como textos vazios e o salário
//como 0.
//Escreva métodos Getters e Setters para as variáveis
//que precisam ser protegidas pelo encapsulamento. Por
//exemplo, se um salário tentar ser alterado de modo
//inválido de acordo com a regra do negócio, o atributo
//deve ser mantido inalterado.
//No seu programa principal (classe Main), teste sua
//classe Funcionario. Crie duas instâncias de Funcionario
//e exiba no Console seus nomes e salários. Depois
//disso, aplique um aumento de 20% em seus salários e
//novamente faça a exibição no Console
//package TP2.Aula7.ex1;
//public class ex1 {
//    public static void main(String [] args){
//        Funcionario func1 = new Funcionario(" ", " ", 0);
//        Funcionario func2 = new Funcionario(" ", " ", 0);
//
//        func1.dados();
//        func2.dados();
//    }
//}

package TP2.Aula7.ex1;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario func1 = new Funcionario(" ", " ", 0);
        Funcionario func2 = new Funcionario(" ", " ", 0);

        dados(func1, teclado);
        dados(func2, teclado);

        teclado.close();
    }

    public static void dados(Funcionario func, Scanner teclado) {
        System.out.println("\nInsira os dados do funcionario");
        System.out.println("Insira seu nome, sobrenome e salario: ");
        func.setNome(teclado.next());
        func.setSobrenome(teclado.next());
        func.setSalMen(teclado.nextFloat());

        func.imprime();
    }
}