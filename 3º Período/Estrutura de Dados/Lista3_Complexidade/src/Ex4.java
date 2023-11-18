//4) Implemente um método com a melhor complexidade possível para conseguir a quantidade
//de inteiros pares de uma pilha. Use a classe Pilha aprendida em sala de aula que possui os
//métodos pop e push padrões, além de atributos padrões. Você possui liberdade para criar
//novos métodos e/ou atributos e alterar os métodos pop e push já existentes.

public class Ex4 {

    // COMPLEXIDADE DE 0(n)
    public static void main(String[] args) {
        PilhaGenerica<Integer> pilhaGenerica = new PilhaGenerica<>(6);
        PilhaGenerica<Integer> pilhaPares = new PilhaGenerica<>(6);

        preenchePilha(pilhaGenerica);

        for(int i = 0; i < pilhaGenerica.tamanhoMaximoOcupado; i++){ // O(n)
            int num = pilhaGenerica.pop(); // O(1)

            if(num % 2 == 0){ // O(1)
                pilhaPares.push((num)); // O(1)
            }
        }

        printaPilha(pilhaPares);
    }

    public static void preenchePilha(PilhaGenerica<Integer> pilhaGenerica){
        for(int i = 1; i <= pilhaGenerica.n; i++){ // O(n)
            pilhaGenerica.push(i);
        }
    }

    public static void printaPilha(PilhaGenerica<Integer> pilhaPares){
        int tamanho = pilhaPares.tamanhoAtual; // O(1)

        for(int i = 0; i < tamanho; i++){ // O(n)
            System.out.println(pilhaPares.pop());
        }
    }
}