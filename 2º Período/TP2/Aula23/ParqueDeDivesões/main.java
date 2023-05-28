//Você está desenvolvendo um sistema para um parque de diversões e precisa criar classes para
//representar diferentes tipos de atrações. Crie uma classe base chamada "Atracao" com os atributos
//"nome", "capacidade” e “preço". Em seguida, crie as classes "MontanhaRussa" e "Carrossel" que
//herdem da classe "Atracao". A classe "MontanhaRussa" terá um atributo adicional chamado
//"altura_minima" e a classe "Carrossel" terá um atributo adicional chamado "idade_minima". Ambas
//as classes terão um método chamado "exibir_detalhes" que imprime as informações da atração,
//incluindo o nome, capacidade e os atributos específicos de cada atração .A classe atração terá um
//método chamado “arrecadacao_maxima”, que calcula o valor máximo que pode ser arrecadado com
//cada atração. Não esqueça de criar classes completas, isto é, verifique a necessidade de
//encapsulamento dos atributos e crie os getters, setters e construtores correspondentes. No programa
//principal peça ao usuário para inserir os dados e teste sua classe.

package TP2.Aula23.ParqueDeDivesões;

public class main {
    public static void main(String [] args){
        MontanhaRussa mr = new MontanhaRussa("Roda Roda jequiti", 12, 10,1.30);
        Carrossel cr = new Carrossel("Embarque nesse", 10, 75, 12);

        System.out.println(mr.exibirDetalhes());
        System.out.println(cr.exibirDetalhes());
    }
}
