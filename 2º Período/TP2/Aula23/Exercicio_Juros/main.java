//Se você fosse pensar numa implementação O.O. para o caso dos juros, muito provalvemente irá ter
//a ideia de criar duas classes: JurosSimples e JurosCompostos. Indo um pouco mais além, você
//definiria três atributos para cada uma dessas classes: capital, taxa e tempo; e um método:
//CalcularJuros().
//Nessa modelagem que fizemos das classes, é possível perceber que ambas as classes
//compartilham exatamente os mesmos atributos, mas diferem uma da outra pelo método
//CalcularJuros() que funcionaria de maneira diferente em cada uma delas.
//Neste exercício é pedido para que você utilize o conceito de herança de modo a compartilhar esses
//atributos que sabemos que são comuns a ambas as classes. Como você resolveria essa situação?
package TP2.Aula23.Exercicio_Juros;

public class main {
    public static void main(String[] args){
        JurosSimples js = new JurosSimples(2000,3,3);
        JurosCompostos jc = new JurosCompostos(2000, 3, 3);

        System.out.println("Você pagará o valor de " + js.calcularJuros() + " de juros simples ao final do empréstimo.");
        System.out.println("Você pagará o valor de " + String.format("%.2f", jc.calcularJuros()) + " de juros compostos ao final do empréstimo.");
    }
}
