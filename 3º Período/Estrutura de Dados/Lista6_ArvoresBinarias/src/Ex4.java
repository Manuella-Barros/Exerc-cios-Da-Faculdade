import java.util.Scanner;

// Complexidade O(h^2)
//
// O método constroiArvore chama o método constroiArvoreRecursivamente que gasta O(n) pra construir a arvore pois precisa
// percorrer todos os valores de um vetor de tamanho n para faze-la
//
// O método imprimePreOrdem chama o método imprimePreOrdemRecursiva gasta O(h) pra imprimir a arvore pois precisa percorrer
// todos os elementos da arvore que tem altura h
//
// O método removeForaIntervalo chama o método removeForaIntervaloRecursiva gasta O(h^2) pois pra encontrar os elementos
// que devem ser removidos é preciso percorrer todos os elementos da arvore que tem altura h e quando o elemento é
// encontrado o método removeRecursiva é chamado para remover todos os elementos da arvore com aquele valor

public class Ex4 {
    public static void main(String[] args) {
        ArvBinBusca<Integer> arvBinBusca = new ArvBinBusca<>();
        //int vetor[] = { 4, 1, 7, 3 };    // <4<1<><3<><>>><7<><>>>
        int vetor[] = { 6, 2, 8, 1, 4, 3 };    // <4<1<><3<><>>><7<><>>>
        Scanner scanner = new Scanner(System.in);
        int min, max;

        arvBinBusca.constroiArvore(vetor); // O(n)
        System.out.println("\nArvore");
        arvBinBusca.imprimePreOrdem(); // O(h)
        try {
            System.out.println("\nDigite um intervalo a ser retirado, minimo e maximo");
            min = scanner.nextInt();
            max = scanner.nextInt();
            arvBinBusca.removeForaIntervalo(min, max); // O(h)
            System.out.printf("\nArvore sem o intervalo %d e %d\n", min, max);
            arvBinBusca.imprimePreOrdem(); // O(h)

        } catch (Exception e){
            System.out.println("Insira numeros");
        }
    }
}
